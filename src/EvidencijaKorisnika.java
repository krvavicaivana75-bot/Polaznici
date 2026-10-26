import java.util.ArrayList;
import java.util.HashSet;

public class EvidencijaKorisnika {
    private HashSet<Polaznik> polaznici;

    public EvidencijaKorisnika(HashSet<Polaznik> polaznici) {
        this.polaznici = polaznici;
    }

    public void unosPolaznika(HashSet<Polaznik> p,String ime,String prezime,String email){
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
    /*public int duplikati(){
        for(int i=0;i<this.polaznici;i++){

        }*/

}
