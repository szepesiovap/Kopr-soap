package service;

import entity.Predmet;
import entity.Prezencka;
import entity.Ucastnik;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class DochadzkyServiceTest {

    private final DochadzkyService dochadzkyService;

    public DochadzkyServiceTest() {
        dochadzkyService = new DochadzkyService();
    }

    /**
     * Test of pridajPredmet method, of class DochadzkyService.
     */
    @Test
    public void testPridajAVymazPredmet() {
        int povodnyPocetPredmetov = dochadzkyService.dajPredmety().size();

        Predmet novyPredmet = new Predmet();
        novyPredmet.setNazov("Systémové programovanie");

        long idNovehoPredmetu = dochadzkyService.pridajPredmet(novyPredmet);
        int pocetPredmetovPoPridani = dochadzkyService.dajPredmety().size();
        Predmet predmetVDatabaze = dochadzkyService.dajPredmet(idNovehoPredmetu);

        Assert.assertTrue(idNovehoPredmetu == predmetVDatabaze.getId());
        Assert.assertEquals("Systémové programovanie", predmetVDatabaze.getNazov());
        Assert.assertEquals(povodnyPocetPredmetov + 1, pocetPredmetovPoPridani);

        dochadzkyService.vymazPredmet(idNovehoPredmetu);
        int pocetPredmetovPoVymazani = dochadzkyService.dajPredmety().size();

        try {
            Predmet vymazanyPredmet = dochadzkyService.dajPredmet(idNovehoPredmetu);
            Assert.fail("Vyhladavanie vymazaneho predmetu nevyhodilo vynimku.");
        } catch (Exception e) {
            //
        }
        Assert.assertEquals(povodnyPocetPredmetov, pocetPredmetovPoVymazani);
    }

    /**
     * Test of dajPredmet method, of class DochadzkyService.
     */
    @Test
    public void testDajPredmet() {
        long id = 1L;
        Predmet predmet = dochadzkyService.dajPredmet(id);
        assertTrue(predmet.getId() == id && predmet.getNazov().equals("Matematická analýza"));
    }

    /**
     * Test of dajPredmety method, of class DochadzkyService.
     */
    @Test
    public void testDajPredmety() {
        List<Predmet> predmety = dochadzkyService.dajPredmety();
        assertTrue(predmety.size() > 0);
    }

    /**
     * Test of pridajPrezencku method, of class DochadzkyService.
     */
    @Test
    public void testPridajAVymazPrezencku() {
        int povodnyPocetPrezenciek = dochadzkyService.dajPrezencky().size();

        long idPredmetu = 1L;
        Predmet predmet = new Predmet();
        predmet.setId(idPredmetu);

        Prezencka novaPrezencka = new Prezencka();
        novaPrezencka.setPredmet(predmet);

        int rok = 2018;
        int mesiac = 3;
        int den = 24;
        int hod = 12;
        int min = 30;

        GregorianCalendar calendar = new GregorianCalendar(rok, mesiac - 1, den, hod, min);
        Date datum = new Date(calendar.getTime().getTime());
        novaPrezencka.setDatum(datum);

        List<Long> listUcastnikov = new ArrayList<Long>();
        listUcastnikov.add(1L);
        listUcastnikov.add(3L);
        listUcastnikov.add(5L);

        long idNovejPrezencky = dochadzkyService.pridajPrezencku(novaPrezencka, listUcastnikov);
        int pocetPrezenciekPoPridani = dochadzkyService.dajPrezencky().size();
        Prezencka prezenckaVDatabaze = dochadzkyService.dajPrezencku(idNovejPrezencky);

        Assert.assertTrue(idNovejPrezencky == prezenckaVDatabaze.getId());
        Assert.assertEquals("Matematická analýza", prezenckaVDatabaze.getPredmet().getNazov());
        Assert.assertEquals(datum, prezenckaVDatabaze.getDatum());
        Assert.assertEquals(povodnyPocetPrezenciek + 1, pocetPrezenciekPoPridani);
        Assert.assertEquals(3, dochadzkyService.dajUcastnikovNaPrezencke(prezenckaVDatabaze).size());

        dochadzkyService.vymazPrezencku(idNovejPrezencky);

        int pocetPrezenciekPoVymazani = dochadzkyService.dajPrezencky().size();
        try {
            Prezencka vymazanaPrezencka = dochadzkyService.dajPrezencku(idNovejPrezencky);
            Assert.fail("Vyhladavanie vymazanej prezencky nevyhodilo vynimku.");
        } catch (Exception e) {
            //
        }
        Assert.assertEquals(povodnyPocetPrezenciek, pocetPrezenciekPoVymazani);
    }

    /**
     * Test of dajPrezencku method, of class DochadzkyService.
     */
    @Test
    public void testDajPrezencku() {
        Long id = 2L;
        Prezencka prezencka = dochadzkyService.dajPrezencku(id);

        Assert.assertTrue(id == prezencka.getId());

        int rok = 2018;
        int mesiac = 1;
        int den = 8;
        int hod = 9;
        int min = 30;

        GregorianCalendar calendar = new GregorianCalendar(rok, mesiac - 1, den, hod, min);
        Date datum = new Date(calendar.getTime().getTime());

        Assert.assertEquals("Algebra", prezencka.getPredmet().getNazov());
        Assert.assertEquals(datum, prezencka.getDatum());
    }

    /**
     * Test of dajPrezencky method, of class DochadzkyService.
     */
    @Test
    public void testDajPrezencky() {
        int ocakavnyPocetPrezenciek = 11;

        List<Prezencka> vsetkyPreznecky = dochadzkyService.dajPrezencky();
        int realnyPocetPrezenciek = vsetkyPreznecky.size();

        assertEquals(ocakavnyPocetPrezenciek, realnyPocetPrezenciek);
    }

    /**
     * Test of dajPrezenckyUcastnika method, of class DochadzkyService.
     */
    @Test
    public void testDajPrezenckyUcastnika() {
        long id = 2l;
        Ucastnik ucastnik = new Ucastnik();
        ucastnik.setId(id);

        List<Prezencka> prezenckyUcasnika = dochadzkyService.dajPrezenckyUcastnika(ucastnik);

        int ocakavanyPocetPrezenciek = 4;
        int realnyPocetPrezenciek = prezenckyUcasnika.size();

        assertEquals(ocakavanyPocetPrezenciek, realnyPocetPrezenciek);
    }

    /**
     * Test of pridajUcastnika method, of class DochadzkyService.
     */
    @Test
    public void testPridajAVymazUcastnika() {
        int povodnyPocetUcastnikov = dochadzkyService.dajUcastnikov().size();

        Ucastnik novyUcastnik = new Ucastnik();
        novyUcastnik.setMeno("Harry");
        novyUcastnik.setPriezvisko("Potter");
        long idNovehoUcastnika = dochadzkyService.pridajUcastnika(novyUcastnik);
        int pocetUcastnikovPoPridani = dochadzkyService.dajUcastnikov().size();
        Ucastnik ucastnikVDatabaze = dochadzkyService.dajUcastnika(idNovehoUcastnika);

        Assert.assertTrue(idNovehoUcastnika == ucastnikVDatabaze.getId());
        Assert.assertEquals("Harry", ucastnikVDatabaze.getMeno());
        Assert.assertEquals("Potter", ucastnikVDatabaze.getPriezvisko());
        Assert.assertEquals(povodnyPocetUcastnikov + 1, pocetUcastnikovPoPridani);

        dochadzkyService.vymazUcastnika(idNovehoUcastnika);

        int pocetUcastnikovPoVymazani = dochadzkyService.dajUcastnikov().size();

        try {
            Ucastnik vymazanyUcastnik = dochadzkyService.dajUcastnika(idNovehoUcastnika);
            Assert.fail("Vyhladavanie vymazaneho ucastnika nevyhodilo vynimku.");
        } catch (Exception e) {
            //
        }
        Assert.assertEquals(povodnyPocetUcastnikov, pocetUcastnikovPoVymazani);
    }

    /**
     * Test of dajUcastnika method, of class DochadzkyService.
     */
    @Test
    public void testDajUcastnika() {
        long id = 1L;
        Ucastnik ucastnik = dochadzkyService.dajUcastnika(id);

        Assert.assertTrue(id == ucastnik.getId());
        Assert.assertEquals("Jozko", ucastnik.getMeno());
        Assert.assertEquals("Mrkvicka", ucastnik.getPriezvisko());
    }

    /**
     * Test of dajUcastnikov method, of class DochadzkyService.
     */
    @Test
    public void testDajUcastnikov() {
        int ocakavnyPocetUcastnikov = 11;

        List<Ucastnik> vsetciUcastnici = dochadzkyService.dajUcastnikov();
        int realnyPocetUcastnikov = vsetciUcastnici.size();

        assertEquals(ocakavnyPocetUcastnikov, realnyPocetUcastnikov);
    }

    /**
     * Test of dajUcastnikovNaPrezencke method, of class DochadzkyService.
     */
    @Test
    public void testDajUcastnikovNaPrezencke() {
        long id = 3l;
        Prezencka prezencka = new Prezencka();
        prezencka.setId(id);

        List<Ucastnik> ucastniciNaPrezencke = dochadzkyService.dajUcastnikovNaPrezencke(prezencka);

        int ocakavanyPocetUcastnikov = 5;
        int realnyPocetUcastnikov = ucastniciNaPrezencke.size();

        assertEquals(ocakavanyPocetUcastnikov, realnyPocetUcastnikov);
    }

}
