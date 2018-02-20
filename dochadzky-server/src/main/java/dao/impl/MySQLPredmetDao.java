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
import java.util.UUID;

public class MySQLPredmetDao implements IPredmetDao {

    private JdbcTemplate jdbcTemplate;
    private PredmetRowMapper predmetRowMapper;

    public MySQLPredmetDao() {
        jdbcTemplate = ObjectFactory.INSTANCE.getJdbcTemplate();
        predmetRowMapper = new PredmetRowMapper();
    }

    public UUID pridajPredmet(Predmet predmet) {
        String sql = "INSERT into predmet(id, nazov) VALUES (?,?)";
        UUID id = UUID.randomUUID();       
        jdbcTemplate.update(sql, id.toString(), predmet.getNazov());
        return id;
    }

    public Predmet dajPredmet(UUID id){
        String sql = "SELECT id, nazov FROM predmet WHERE id = ?";
        try {
            return jdbcTemplate.queryForObject(sql, predmetRowMapper, id.toString());
        } catch (EmptyResultDataAccessException e) {
            throw new PredmetNotFoundException("Predmet s id "+id.toString()+" sa v databaze nenachadza.");
        }
    }

    public List<Predmet> dajPredmety() {
        String sql = "SELECT id, nazov FROM predmet";
        return jdbcTemplate.query(sql, predmetRowMapper);
    }

    public void vymazPredmet(UUID id) {
        String sql = "DELETE FROM predmet WHERE id = ?";
        jdbcTemplate.update(sql, id.toString());
    }
}
