package com.sanvalero.retroshop;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import com.sanvalero.retroshop.domain.Consola;
import org.junit.jupiter.api.Test;

public class ConsolaTest {

    @Test
    public void registrarConsolasTest(){

        Consola testConsola = new Consola("NES","Nintendo","Japón",1989,59.99f);

        assertEquals("NES", testConsola.getNombre());
        assertEquals("Nintendo", testConsola.getDesarrollador());
        assertNotEquals("USA", testConsola.getPais_fabricacion());
        assertNotEquals(1990, testConsola.getAno_fabricacion());
        assertEquals(59.99f, testConsola.getPrecio());
    }
}
