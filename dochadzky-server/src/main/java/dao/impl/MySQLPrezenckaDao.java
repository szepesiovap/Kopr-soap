package dao.impl;

import assets.ObjectFactory;
import dao.IPrezenckaDao;
import entity.Prezencka;
import entity.Ucastnik;
import exception.InvalidEntryDataException;
import exception.PrezenckaNotFoundException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import rowmapper.PrezenckaRowMapper;

import java.util.List;
import org.springframework.dao.DataIntegrityViolationException;

public class MySQLPrezenckaDao implements IPrezenckaDao {

    private JdbcTemplate jdbcTemplate;
    private PrezenckaRowMapper prezenckaRowMapper;

    public MySQLPrezenckaDao() {
        jdbcTemplate = ObjectFactory.INSTANCE.getJdbcTemplate();
        prezenckaRowMapper = new PrezenckaRowMapper();
    }

    public Long pridajPrezencku(Prezencka prezencka, List<Long> ucastnici) {
        long idPrezencky = -1;
        try {
            MapSqlParameterSource parameters = new MapSqlParameterSource()
                    .addValue("datum", prezencka.getDatum())
                    .addValue("id_predmetu", prezencka.getPredmet().getId());

            Number id = new SimpleJdbcInsert(jdbcTemplate)
                    .withTableName("prezencka")
                    .usingGeneratedKeyColumns("id")
                    .usingColumns("datum", "id_predmetu")
                    .executeAndReturnKey(parameters);

            idPrezencky = id.longValue();
        } catch (Exception e) {
            throw new InvalidEntryDataException("Prezencka nebola ulozena. Predmet s id " + prezencka.getPredmet().getId() + " v databaze neexistuje.");
        }
        
       long idAktUcastnika = -1;
       try {
        String sql = "INSERT INTO dochadzka (id_prezencky, id_ucastnika) VALUES (?,?)";
        
        for (long idUcastnika : ucastnici) {
            idAktUcastnika = idUcastnika;
            jdbcTemplate.update(sql, idPrezencky, idUcastnika);
        }
       }catch (DataIntegrityViolationException e)  {
           vymazPrezencku(idPrezencky);
           throw new InvalidEntryDataException("Prezencka nebola ulozena. Ucastnik s id "+ idAktUcastnika+" v databaze neexistuje.");
       }
        return idPrezencky;
    }

    public Prezencka dajPrezencku(long id) {
        String sql = "SELECT prezencka.id as prezencka_id, prezencka.datum as prezencka_datum,"
                + " prezencka.id_predmetu as prezencka_id_predmetu, predmet.id as predmet_id, predmet.nazov as predmet_nazov "
                + " FROM prezencka JOIN predmet ON prezencka.id_predmetu = predmet.id WHERE prezencka.id = ?";
        try {
            return jdbcTemplate.queryForObject(sql, prezenckaRowMapper, id);
        } catch (EmptyResultDataAccessException e) {
            throw new PrezenckaNotFoundException("Prezencka s id " + id + " sa v databaze nenachadza.");
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
        return jdbcTemplate.query(sql, prezenckaRowMapper, ucastnik.getId());
    }

    public void vymazPrezencku(long id) {
        String sql = "DELETE FROM prezencka WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }
}
