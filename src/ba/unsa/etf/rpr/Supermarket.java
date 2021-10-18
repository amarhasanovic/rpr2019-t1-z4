package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] supermarket = new Artikl[1000];

    public void dodajArtikl(Artikl artikl){
        for(int i=0; i<1000; i++){
            if(supermarket[i] == null){
                supermarket[i] = artikl;
                break;
            }
        }
    }

    public Artikl[] getArtikli(){ return supermarket; }

    public Artikl izbaciArtiklSaKodom(String kod){
        Artikl izbaceniArtikl = null;
        for(int i=0; i<1000; i++){
            if(supermarket[i] != null && supermarket[i].getKod().equals(kod)){
                izbaceniArtikl = supermarket[i];
                supermarket[i] = null;
            }
        }

        return izbaceniArtikl;
    }
}
