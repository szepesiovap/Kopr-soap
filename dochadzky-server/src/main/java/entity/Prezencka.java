package entity;

import java.util.Date;
import java.util.UUID;

public class Prezencka {

    private UUID id;
    private Date datum;
    private Predmet predmet;

    public UUID getId() {
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

    public void setId(UUID id) {
        this.id = id;
    }
}
