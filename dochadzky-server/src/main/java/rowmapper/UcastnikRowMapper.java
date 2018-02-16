package rowmapper;

import entity.Ucastnik;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UcastnikRowMapper implements RowMapper<Ucastnik> {

    public Ucastnik mapRow(ResultSet resultSet, int i) throws SQLException {
        Ucastnik ucastnik = new Ucastnik();
        ucastnik.setId(resultSet.getLong("ucastnik_id"));
        ucastnik.setMeno(resultSet.getString("ucastnik_meno"));
        ucastnik.setPriezvisko(resultSet.getString("ucastnik_priezvisko"));
        return ucastnik;
    }
}
