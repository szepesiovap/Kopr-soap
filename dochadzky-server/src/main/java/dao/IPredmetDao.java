package dao;

import entity.Predmet;

import java.util.List;

public interface IPredmetDao {

    public Long pridajPredmet(Predmet predmet);

    public Predmet dajPredmet(long id);

    public List<Predmet> dajPredmety();
    
    public void vymazPredmet(long id);
}
