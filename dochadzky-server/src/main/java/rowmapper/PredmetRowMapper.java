package rowmapper;

import entity.Predmet;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PredmetRowMapper implements RowMapper<Predmet> {

    public Predmet mapRow(ResultSet resultSet, int i) throws SQLException {
        Predmet predmet = new Predmet();
        predmet.setId(resultSet.getLong("id"));
        predmet.setNazov(resultSet.getString("nazov"));
        return predmet;
    }
}
