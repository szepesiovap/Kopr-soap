package assets;

import java.util.Scanner;
import service.DochadzkyService;

import javax.xml.ws.Endpoint;

public class Server {

        public static void main(String[] args) {
            
            Endpoint dochadzkyEndpoint = Endpoint.publish("http://localhost:8888/dochadzky",
                    new DochadzkyService());
            System.out.println("Na ukončenie zadaj do konzoly EXIT a stlač ENTER.");
            Scanner sc = new Scanner(System.in);
        while (!("EXIT").equals(sc.next())) {
            //
        }
            dochadzkyEndpoint.stop();
        }
        
        

}
