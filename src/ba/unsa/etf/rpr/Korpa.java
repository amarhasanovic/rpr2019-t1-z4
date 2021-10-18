package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] korpa = new Artikl[50];

    public boolean dodajArtikl(Artikl artikl){
        for(int i=0; i<50; i++){
            if(korpa[i] == null){
                korpa[i] = artikl;
                break;
            }
        }
        if(korpa.length<=50)
            return true;
        return false;
    }

    public Artikl[] getArtikli(){ return korpa; }

    public Artikl izbaciArtiklSaKodom(String kod){

    }
}
