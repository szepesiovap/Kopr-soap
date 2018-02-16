package entity;

import java.sql.Time;
import java.util.Date;

public class Prezencka {

    private Long id;
    private Date datum;
    private Predmet predmet;

    public Long getId() {
        return id;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public Predmet getPredmet() {
        return predmet;
    }

    public void setPredmet(Predmet predmet) {
        this.predmet = predmet;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
