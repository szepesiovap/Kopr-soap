package dao.impl;

import assets.ObjectFactory;
import dao.IUcastnikDao;
import entity.Prezencka;
import entity.Ucastnik;
import exception.UcastnikNotFoundException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import rowmapper.UcastnikRowMapper;

import java.util.List;

public class MySQLUcastnikDao implements IUcastnikDao {

    private JdbcTemplate jdbcTemplate;
    private UcastnikRowMapper ucastnikRowMapper;

    public MySQLUcastnikDao() {
        jdbcTemplate = ObjectFactory.INSTANCE.getJdbcTemplate();
        ucastnikRowMapper = new UcastnikRowMapper();
    }

    public Long pridajUcastnika(Ucastnik ucastnik) {
        MapSqlParameterSource parameters = new MapSqlParameterSource()
                .addValue("meno", ucastnik.getMeno())
                .addValue("priezvisko", ucastnik.getPriezvisko());

        Number id = new SimpleJdbcInsert(jdbcTemplate)
                .withTableName("ucastnik")
                .usingGeneratedKeyColumns("id")
                .usingColumns("meno","priezvisko")
                .executeAndReturnKey(parameters);
        return id.longValue();
    }

    public Ucastnik dajUcastnika(long id) {
        String sql = "SELECT id as ucastnik_id, meno as ucastnik_meno, priezvisko as ucastnik_priezvisko FROM ucastnik WHERE id = ?";
        try {
            return jdbcTemplate.queryForObject(sql, ucastnikRowMapper, id);
        } catch (EmptyResultDataAccessException e) {
            throw new UcastnikNotFoundException("Ucastnik s id "+id+" sa v databaze nenachadza.");
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
        return jdbcTemplate.query(sql, ucastnikRowMapper, prezencka.getId());
    }

    public void vymazUcastnika(long id) { 
        String sql = "DELETE FROM ucastnik WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }
}
