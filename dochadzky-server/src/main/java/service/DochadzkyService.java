package service;

import dao.impl.MySQLPredmetDao;
import dao.impl.MySQLPrezenckaDao;
import dao.impl.MySQLUcastnikDao;
import entity.Predmet;
import entity.Prezencka;
import entity.Ucastnik;
import exception.InvalidEntryDataException;
import exception.PredmetNotFoundException;
import exception.PrezenckaNotFoundException;
import exception.UcastnikNotFoundException;
import java.util.List;
import javax.jws.WebService;

@WebService(serviceName = "DochadzkyWebService")
public class DochadzkyService {

    private final MySQLUcastnikDao mySQLUcastnikDao;
    private final MySQLPrezenckaDao mySQLPrezenckaDao;
    private final MySQLPredmetDao mySQLPredmetDao;
    
    public DochadzkyService() {
        mySQLPredmetDao = new MySQLPredmetDao();
        mySQLUcastnikDao = new MySQLUcastnikDao();
        mySQLPrezenckaDao = new MySQLPrezenckaDao();
    }
    
    public Long pridajPredmet(Predmet predmet) {
        return mySQLPredmetDao.pridajPredmet(predmet);
    }
    
    public Predmet dajPredmet(long id) throws PredmetNotFoundException {
        return mySQLPredmetDao.dajPredmet(id);
    }
    
    public List<Predmet> dajPredmety() {
        return mySQLPredmetDao.dajPredmety();
    }
    
    public Long pridajPrezencku(Prezencka prezencka, List<Long> ucastnici) throws InvalidEntryDataException {
        return mySQLPrezenckaDao.pridajPrezencku(prezencka, ucastnici);
    }
    
    public Prezencka dajPrezencku(long id) throws PrezenckaNotFoundException {
        return mySQLPrezenckaDao.dajPrezencku(id);
    }
    
    public List<Prezencka> dajPrezencky() {
        return mySQLPrezenckaDao.dajPrezencky();
    }
    
    public List<Prezencka> dajPrezenckyUcastnika(Ucastnik ucastnik) {
        return mySQLPrezenckaDao.dajPrezenckyUcastnika(ucastnik);
    }
    
    public Long pridajUcastnika(Ucastnik ucastnik) {
        return mySQLUcastnikDao.pridajUcastnika(ucastnik);
    }
    
    public Ucastnik dajUcastnika(long id) throws UcastnikNotFoundException {
        return mySQLUcastnikDao.dajUcastnika(id);
    }
    
    public List<Ucastnik> dajUcastnikov() {
        return mySQLUcastnikDao.dajUcastnikov();
    }
    
    public List<Ucastnik> dajUcastnikovNaPrezencke(Prezencka prezencka) {
        return mySQLUcastnikDao.dajUcastnikovNaPrezencke(prezencka);
    }
    
    public void vymazPredmet(long id) {
        mySQLPredmetDao.vymazPredmet(id);
    }
    
    public void vymazPrezencku(long id) {
        mySQLPrezenckaDao.vymazPrezencku(id);
    }
    
    public void vymazUcastnika(long id) {
        mySQLUcastnikDao.vymazUcastnika(id);
    }
}
