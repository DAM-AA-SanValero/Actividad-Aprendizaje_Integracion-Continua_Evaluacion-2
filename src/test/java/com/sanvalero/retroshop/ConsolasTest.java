package com.sanvalero.retroshop;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import com.sanvalero.retroshop.domain.Consolas;
import org.junit.jupiter.api.Test;

public class ConsolasTest {

    @Test
    public void registrarConsolasTest(){

        Consolas testConsolas = new Consolas("NES","Nintendo","Japón",1989,59.99f);

        assertEquals("NES", testConsolas.getNombre());
        assertEquals("Nintendo", testConsolas.getDesarrollador());
        assertNotEquals("USA", testConsolas.getPais_fabricacion());
        assertNotEquals(1990, testConsolas.getAno_fabricacion());
        assertEquals(59.99f, testConsolas.getPrecio());
    }
}
