package dao;

import entity.Prezencka;
import entity.Ucastnik;
import exception.InvalidEntryDataException;
import exception.PrezenckaNotFoundException;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;

public interface IPrezenckaDao {

    @Transactional(rollbackFor={Exception.class})
    public Long pridajPrezencku(Prezencka prezencka, List<Long> ucastnici) throws InvalidEntryDataException;

    public Prezencka dajPrezencku(long id);

    public List<Prezencka> dajPrezencky();

    public List<Prezencka> dajPrezenckyUcastnika(Ucastnik ucastnik);
    
    public void vymazPrezencku(long id);
}
