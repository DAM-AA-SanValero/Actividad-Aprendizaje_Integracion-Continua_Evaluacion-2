package com.sanvalero.retroshop;

import com.sanvalero.retroshop.domain.Merchandising;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MerchandisingTest {

    @Test
    public void registrarMerchandisingTest(){

        Merchandising testMerchandising = new Merchandising("Poster Sonic","Sega","UK",2018,9.99f);

        assertNotEquals("Poster Zelda", testMerchandising.getNombre());
        assertEquals("Sega", testMerchandising.getMarca());
        assertEquals("UK", testMerchandising.getProcedencia());
        assertNotEquals(1991, testMerchandising.getAno_fabricacion());
        assertNotEquals(99.99f, testMerchandising.getPrecio());
    }
}
