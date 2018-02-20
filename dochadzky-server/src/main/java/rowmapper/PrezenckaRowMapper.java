package rowmapper;

import entity.Predmet;
import entity.Prezencka;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;

public class PrezenckaRowMapper implements RowMapper<Prezencka> {

    public Prezencka mapRow(ResultSet resultSet, int i) throws SQLException {
        Predmet predmet = new Predmet();
        predmet.setId(UUID.fromString(resultSet.getString("predmet_id")));
        predmet.setNazov(resultSet.getString("predmet_nazov"));

        Prezencka prezencka = new Prezencka();
        prezencka.setId(UUID.fromString(resultSet.getString("prezencka_id")));
        Timestamp timestamp = resultSet.getTimestamp("prezencka_datum");
        if (timestamp != null)
        prezencka.setDatum(new Date(timestamp.getTime()));
        prezencka.setPredmet(predmet);
        return prezencka;
    }
}
