package dao.impl;

import assets.ObjectFactory;
import dao.IPredmetDao;
import entity.Predmet;
import exception.PredmetNotFoundException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import rowmapper.PredmetRowMapper;

import java.util.List;

public class MySQLPredmetDao implements IPredmetDao {

    private JdbcTemplate jdbcTemplate;
    private PredmetRowMapper predmetRowMapper;

    public MySQLPredmetDao() {
        jdbcTemplate = ObjectFactory.INSTANCE.getJdbcTemplate();
        predmetRowMapper = new PredmetRowMapper();
    }

    public Long pridajPredmet(Predmet predmet) {
        MapSqlParameterSource parameters = new MapSqlParameterSource()
                .addValue("nazov", predmet.getNazov());

        Number id = new SimpleJdbcInsert(jdbcTemplate)
                .withTableName("predmet")
                .usingGeneratedKeyColumns("id")
                .usingColumns("nazov")
                .executeAndReturnKey(parameters);
        return id.longValue();
    }

    public Predmet dajPredmet(long id){
        String sql = "SELECT id, nazov FROM predmet WHERE id = ?";
        try {
            return jdbcTemplate.queryForObject(sql, predmetRowMapper, id);
        } catch (EmptyResultDataAccessException e) {
            throw new PredmetNotFoundException("Predmet s id "+id+" sa v databaze nenachadza.");
        }
    }

    public List<Predmet> dajPredmety() {
        String sql = "SELECT id, nazov FROM predmet";
        return jdbcTemplate.query(sql, predmetRowMapper);
    }

    public void vymazPredmet(long id) {
        String sql = "DELETE FROM predmet WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }
}
