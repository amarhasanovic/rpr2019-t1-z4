package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void dodajArtikl() {
        Artikl artikl = new Artikl("Biciklo", 1000, "10");
        Korpa korpa = new Korpa();
        //korpa.dodajArtikl(artikl);
        //assertEquals(1, korpa.dajVelicinuKorpe());
        assertTrue(korpa.dodajArtikl(artikl));
    }

    @Test
    void izbaciArtiklSaKodom() {
        Artikl artikl1 = new Artikl("Biciklo", 1000, "1");
        Artikl artikl2 = new Artikl("Motor", 2500, "2");
        Artikl artikl3 = new Artikl("Auto", 3000, "3");
        Korpa korpa = new Korpa();
        korpa.dodajArtikl(artikl1);
        korpa.dodajArtikl(artikl2);
        korpa.dodajArtikl(artikl3);

        korpa.izbaciArtiklSaKodom("2");
        assertEquals(2, korpa.dajVelicinuKorpe());
    }

    @Test
    void dajUkupnuCijenuArtikala() {
        Artikl artikl1 = new Artikl("Biciklo", 1000, "1");
        Artikl artikl2 = new Artikl("Motor", 2500, "2");
        Artikl artikl3 = new Artikl("Auto", 3000, "3");
        Korpa korpa = new Korpa();
        korpa.dodajArtikl(artikl1);
        korpa.dodajArtikl(artikl2);
        korpa.dodajArtikl(artikl3);

        int ukupnaCijena = korpa.dajUkupnuCijenuArtikala();
        assertEquals(6500, ukupnaCijena);
    }
}