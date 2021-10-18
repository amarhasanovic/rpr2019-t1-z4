package ba.unsa.etf.rpr;

public class Artikl {
    private String naziv;
    private int cijena;
    private String kod;

    public Artikl(String naziv, int cijena, String kod){
        this.naziv = naziv;
        this.cijena = cijena;
        this.kod = kod;
    }
    public void postaviNaziv(String naziv){
        this.naziv = naziv;
    }
    public void postaviCijenu(int cijena){
        this.cijena = cijena;
    }
    public void postaviKod(String kod){
        this.kod = kod;
    }

    public String getNaziv(){ return naziv; }
    public int getCijena(){ return cijena; }
    public String getKod(){ return kod; }
}
