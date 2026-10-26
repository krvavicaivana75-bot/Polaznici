import java.util.*;

public class Main {
    public static void main(String...args){
        Scanner ulaz=new Scanner(System.in);
        boolean uvjet=true;
        /*List<Polaznik> listaPolaznika = new ArrayList<>();*/
        /*HashSet<Polaznik> listaPolaznika = new HashSet<>();*/
        Map<String, Polaznik> mapaPolaznika = new HashMap<>();
        EvidencijaKorisnika evidencijaKorisnika = new EvidencijaKorisnika(mapaPolaznika);
        while(uvjet) {
            System.out.println("Unesite ime, prezime i e-mail adresu odvojeno razmakom");
            String pol = ulaz.nextLine();
            String[] dijelovi = pol.split(" ");
            if(dijelovi.length==3){
                evidencijaKorisnika.unosPolaznika(dijelovi[0],dijelovi[1],dijelovi[2]);


            }else{
                System.out.println("Nepravilno unijeti podaci");
                uvjet=false;
            }

        }evidencijaKorisnika.ispisiPolaznike();
        System.out.println("Koji email tražiš");



        String navediEmail=ulaz.nextLine();
        evidencijaKorisnika.pretraziPoMailu(navediEmail);
        ulaz.close();
    }
}
