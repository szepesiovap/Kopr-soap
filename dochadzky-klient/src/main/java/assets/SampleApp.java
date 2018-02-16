package assets;

import java.util.List;
import service.DochadzkyService;
import service.DochadzkyWebService;
import service.Prezencka;
import service.Ucastnik;

public class SampleApp {

    public static void main(String[] args) {

        DochadzkyWebService service = new DochadzkyWebService();
        DochadzkyService dochadzkyService = service.getDochadzkyServicePort();

        Ucastnik ucastnik = new Ucastnik();
        ucastnik.setId(3l);
        List<Prezencka> prezencky = dochadzkyService.dajPrezenckyUcastnika(ucastnik);

        for (Prezencka prezencka : prezencky) {
            System.out.println(prezencka.getId() + " " + prezencka.getDatum() + " " + " " + prezencka.getPredmet().getNazov());
        }
        
    }
}
