package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void dodajArtikl() {
        Artikl artikl = new Artikl("Biciklo", 1000, "10");
        Supermarket supermarket = new Supermarket();

        assertTrue(supermarket.dodajArtikl(artikl));
    }

    @Test
    void izbaciArtiklSaKodom() {
        Artikl artikl1 = new Artikl("Biciklo", 1000, "1");
        Artikl artikl2 = new Artikl("Motor", 2500, "2");
        Artikl artikl3 = new Artikl("Auto", 3000, "3");
        Supermarket supermarket = new Supermarket();
        supermarket.dodajArtikl(artikl1);
        supermarket.dodajArtikl(artikl2);
        supermarket.dodajArtikl(artikl3);

        supermarket.izbaciArtiklSaKodom("2");
        assertEquals(2, supermarket.dajVelicinuSupermarketa());
    }
}