package dao.impl;

import assets.ObjectFactory;
import dao.IUcastnikDao;
import entity.Prezencka;
import entity.Ucastnik;
import exception.UcastnikNotFoundException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import rowmapper.UcastnikRowMapper;

import java.util.List;
import java.util.UUID;

public class MySQLUcastnikDao implements IUcastnikDao {

    private JdbcTemplate jdbcTemplate;
    private UcastnikRowMapper ucastnikRowMapper;

    public MySQLUcastnikDao() {
        jdbcTemplate = ObjectFactory.INSTANCE.getJdbcTemplate();
        ucastnikRowMapper = new UcastnikRowMapper();
    }

    public UUID pridajUcastnika(Ucastnik ucastnik) {
        String sql = "INSERT into ucastnik(id, meno, priezvisko) VALUES (?,?,?)";
        UUID id = UUID.randomUUID();       
        jdbcTemplate.update(sql, id.toString(), ucastnik.getMeno(), ucastnik.getPriezvisko());
        return id;
    }

    public Ucastnik dajUcastnika(UUID id) {
        String sql = "SELECT id as ucastnik_id, meno as ucastnik_meno, priezvisko as ucastnik_priezvisko FROM ucastnik WHERE id = ?";
        try {
            return jdbcTemplate.queryForObject(sql, ucastnikRowMapper, id.toString());
        } catch (EmptyResultDataAccessException e) {
            throw new UcastnikNotFoundException("Ucastnik s id "+id.toString()+" sa v databaze nenachadza.");
        }
    }

    public List<Ucastnik> dajUcastnikov() {
        String sql = "SELECT id as ucastnik_id, meno as ucastnik_meno, priezvisko as ucastnik_priezvisko FROM ucastnik";
        return jdbcTemplate.query(sql, ucastnikRowMapper);
    }

    public List<Ucastnik> dajUcastnikovNaPrezencke(Prezencka prezencka) {
        String sql = "SELECT ucastnik.id as ucastnik_id, ucastnik.meno as ucastnik_meno, " +
                "ucastnik.priezvisko as ucastnik_priezvisko FROM ucastnik " +
                "JOIN dochadzka on ucastnik.id = dochadzka.id_ucastnika " +
                "WHERE dochadzka.id_prezencky = ?";
        return jdbcTemplate.query(sql, ucastnikRowMapper, prezencka.getId().toString());
    }

    public void vymazUcastnika(UUID id) { 
        String sql = "DELETE FROM ucastnik WHERE id = ?";
        jdbcTemplate.update(sql, id.toString());
    }
}
