package dao.impl;

import assets.ObjectFactory;
import dao.IPrezenckaDao;
import entity.Prezencka;
import entity.Ucastnik;
import exception.InvalidEntryDataException;
import exception.PrezenckaNotFoundException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import rowmapper.PrezenckaRowMapper;

import java.util.List;
import java.util.UUID;
import org.springframework.dao.DataIntegrityViolationException;

public class MySQLPrezenckaDao implements IPrezenckaDao {

    private JdbcTemplate jdbcTemplate;
    private PrezenckaRowMapper prezenckaRowMapper;

    public MySQLPrezenckaDao() {
        jdbcTemplate = ObjectFactory.INSTANCE.getJdbcTemplate();
        prezenckaRowMapper = new PrezenckaRowMapper();
    }

    public UUID pridajPrezencku(Prezencka prezencka, List<UUID> ucastnici) {
        UUID idPrezencky = null;
        try {
        String sql = "INSERT into prezencka(id, datum, id_predmetu) VALUES (?,?,?)";
        idPrezencky = UUID.randomUUID();       
        jdbcTemplate.update(sql, idPrezencky.toString(), prezencka.getDatum(), prezencka.getPredmet().getId().toString());

        } catch (Exception e) {
            throw new InvalidEntryDataException("Prezencka nebola ulozena. Predmet s id " + prezencka.getPredmet().getId().toString() + " v databaze neexistuje.");
        }
        
       UUID idAktUcastnika = null;
       try {
        String sql = "INSERT INTO dochadzka (id_prezencky, id_ucastnika) VALUES (?,?)";
        
        for (UUID idUcastnika : ucastnici) {
            idAktUcastnika = idUcastnika;
            jdbcTemplate.update(sql, idPrezencky.toString(), idUcastnika.toString());
        }
       }catch (DataIntegrityViolationException e)  {
           vymazPrezencku(idPrezencky);
           throw new InvalidEntryDataException("Prezencka nebola ulozena. Ucastnik s id "+ idAktUcastnika.toString()+" v databaze neexistuje.");
       }
        return idPrezencky;
    }

    public Prezencka dajPrezencku(UUID id) {
        String sql = "SELECT prezencka.id as prezencka_id, prezencka.datum as prezencka_datum,"
                + " prezencka.id_predmetu as prezencka_id_predmetu, predmet.id as predmet_id, predmet.nazov as predmet_nazov "
                + " FROM prezencka JOIN predmet ON prezencka.id_predmetu = predmet.id WHERE prezencka.id = ?";
        try {
            return jdbcTemplate.queryForObject(sql, prezenckaRowMapper, id.toString());
        } catch (EmptyResultDataAccessException e) {
            throw new PrezenckaNotFoundException("Prezencka s id " + id.toString() + " sa v databaze nenachadza.");
        }
    }

    public List<Prezencka> dajPrezencky() {
        String sql = "SELECT prezencka.id as prezencka_id, prezencka.datum as prezencka_datum,"
                + " prezencka.id_predmetu as prezencka_id_predmetu, predmet.id as predmet_id, predmet.nazov as predmet_nazov "
                + " FROM prezencka JOIN predmet ON prezencka.id_predmetu = predmet.id";
        return jdbcTemplate.query(sql, prezenckaRowMapper);
    }

    public List<Prezencka> dajPrezenckyUcastnika(Ucastnik ucastnik) {
        String sql = "SELECT prezencka.id as prezencka_id, prezencka.datum as prezencka_datum,"
                + " prezencka.id_predmetu as prezencka_id_predmetu, predmet.id as predmet_id, predmet.nazov as predmet_nazov "
                + " FROM prezencka JOIN predmet ON prezencka.id_predmetu = predmet.id JOIN dochadzka "
                + "ON dochadzka.id_prezencky = prezencka.id WHERE dochadzka.id_ucastnika = ?";
        return jdbcTemplate.query(sql, prezenckaRowMapper, ucastnik.getId().toString());
    }

    public void vymazPrezencku(UUID id) {
        String sql = "DELETE FROM prezencka WHERE id = ?";
        jdbcTemplate.update(sql, id.toString());
    }
}
