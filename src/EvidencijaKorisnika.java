import java.util.ArrayList;

public class EvidencijaKorisnika {
    private ArrayList<Polaznik> polaznici;

    public EvidencijaKorisnika(ArrayList<Polaznik> polaznici) {
        this.polaznici = polaznici;
    }

    public void unosPolaznika(ArrayList<Polaznik> p,String ime,String prezime,String email){
        p.add(new Polaznik(ime,prezime,email));


    }
    public void ispisiPolaznike(){
        for (Polaznik p:this.polaznici){
            p.ispis();
        }
    }
    public void pretraziPoMailu(String email){
        for(Polaznik p:this.polaznici){
            if(email.equals(p.getEmailAdresa())){
                p.ispis();
            }
        }
    }
}
