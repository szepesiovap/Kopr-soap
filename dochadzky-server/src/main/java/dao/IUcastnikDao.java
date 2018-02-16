package dao;

import entity.Prezencka;
import entity.Ucastnik;

import java.util.List;

public interface IUcastnikDao {

    public Long pridajUcastnika(Ucastnik ucastnik);

    public Ucastnik dajUcastnika(long id);

    public List<Ucastnik> dajUcastnikov();

    public List<Ucastnik> dajUcastnikovNaPrezencke(Prezencka prezencka);
    
    public void vymazUcastnika(long id);


}
