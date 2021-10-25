package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] korpa = new Artikl[50];

    public boolean dodajArtikl(Artikl artikl){
        for(int i=0; i<50; i++){
            if(korpa[i] == null){
                korpa[i] = artikl;
                return true;
            }
        }
        return false;
    }

    public Artikl[] getArtikli(){ return korpa; }

    public Artikl izbaciArtiklSaKodom(String kod){
        Artikl izbaceniArtikl = null;

        for(int i=0; i<50; i++){
            if(korpa[i] != null && korpa[i].getKod().equals(kod)){
                izbaceniArtikl = korpa[i];
                korpa[i] = null;
                break;
            }
        }
        return izbaceniArtikl;
    }

    public int dajUkupnuCijenuArtikala(){
        int ukupnaCijenaArtikala = 0;
        for(Artikl artikl : korpa){
            if(artikl != null){
                ukupnaCijenaArtikala = ukupnaCijenaArtikala + artikl.getCijena();
            }
        }
        return ukupnaCijenaArtikala;
    }

    public int dajVelicinuKorpe(){
        int velicinaKorpe = 0;
        for(Artikl artikl : korpa){
            if(artikl != null)
                velicinaKorpe++;
        }

        return velicinaKorpe;
    }
}
