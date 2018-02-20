package rowmapper;

import entity.Predmet;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

public class PredmetRowMapper implements RowMapper<Predmet> {

    public Predmet mapRow(ResultSet resultSet, int i) throws SQLException {
        Predmet predmet = new Predmet();
        predmet.setId(UUID.fromString(resultSet.getString("id")));
        predmet.setNazov(resultSet.getString("nazov"));
        return predmet;
    }
}
