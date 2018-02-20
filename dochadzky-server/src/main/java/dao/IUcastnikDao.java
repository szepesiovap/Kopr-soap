package dao;

import entity.Prezencka;
import entity.Ucastnik;

import java.util.List;
import java.util.UUID;

public interface IUcastnikDao {

    public UUID pridajUcastnika(Ucastnik ucastnik);

    public Ucastnik dajUcastnika(UUID id);

    public List<Ucastnik> dajUcastnikov();

    public List<Ucastnik> dajUcastnikovNaPrezencke(Prezencka prezencka);
    
    public void vymazUcastnika(UUID id);


}
