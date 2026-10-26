import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;

public class EvidencijaKorisnika {
    private Map<String,Polaznik> polaznici;

    public EvidencijaKorisnika(Map<String, Polaznik> polaznici) {
        this.polaznici = polaznici;
    }

    public void unosPolaznika(String ime, String prezime, String email) {

        if (polaznici.containsKey(email)) {
            System.out.println("Polaznik s ovim e-mailom već postoji!");
        } else {
            Polaznik novi = new Polaznik(ime, prezime, email);

            polaznici.put(email, novi);
            System.out.println("Polaznik uspješno dodan.");
        }
    }
    public void ispisiPolaznike() {
        System.out.println("\n--- Popis polaznika ---");
        // polaznici.values() nam daje sve objekte Polaznik unutar mape
        for (Polaznik p : polaznici.values()) {
            p.ispis();
            System.out.println("-----------------------");
        }
    }
    public void pretraziPoMailu(String email) {
        // Budući da je email ključ, ne moramo vrtjeti petlju (for), nego samo povučemo objekt
        Polaznik p = polaznici.get(email);

        if (p != null) {
            System.out.println("Pronađen polaznik:");
            p.ispis();
        } else {
            System.out.println("Polaznik s e-mailom " + email + " nije pronađen.");
        }

    }
    /*public int duplikati(){
        for(int i=0;i<this.polaznici;i++){

        }*/

}
