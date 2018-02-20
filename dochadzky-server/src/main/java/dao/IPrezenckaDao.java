package dao;

import entity.Prezencka;
import entity.Ucastnik;
import exception.InvalidEntryDataException;

import java.util.List;
import java.util.UUID;

public interface IPrezenckaDao {

    public UUID pridajPrezencku(Prezencka prezencka, List<UUID> ucastnici) throws InvalidEntryDataException;

    public Prezencka dajPrezencku(UUID id);

    public List<Prezencka> dajPrezencky();

    public List<Prezencka> dajPrezenckyUcastnika(Ucastnik ucastnik);
    
    public void vymazPrezencku(UUID id);
}
