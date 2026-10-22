public class Polaznik {
    private String ime;
    private String prezime;
    private String emailAdresa;

    public Polaznik(String ime, String prezime, String emailAdresa) {
        this.ime = ime;
        this.prezime = prezime;
        this.emailAdresa = emailAdresa;
    }

    public String getEmailAdresa() {
        return emailAdresa;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setEmailAdresa(String emailAdresa) {
        this.emailAdresa = emailAdresa;
    }

    public void ispis(){
       System.out.println("ime: "+ime+"\nprezime: "+prezime+"\ne-mail: "+emailAdresa);
   }
}
