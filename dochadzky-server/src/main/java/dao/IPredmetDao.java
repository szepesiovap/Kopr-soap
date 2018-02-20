package dao;

import entity.Predmet;

import java.util.List;
import java.util.UUID;

public interface IPredmetDao {

    public UUID pridajPredmet(Predmet predmet);

    public Predmet dajPredmet(UUID id);

    public List<Predmet> dajPredmety();
    
    public void vymazPredmet(UUID id);
}
