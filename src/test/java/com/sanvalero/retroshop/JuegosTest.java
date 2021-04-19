package com.sanvalero.retroshop;

import com.sanvalero.retroshop.domain.Juegos;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class JuegosTest {

    @Test
    public void registrarJuegosTest(){

        Juegos testJuegos = new Juegos("Sonic The Hedgehog","Sega","Aventura",1991,29.99f);

        assertNotEquals("Metroid", testJuegos.getTitulo());
        assertEquals("Sega", testJuegos.getPlataforma());
        assertNotEquals("Plataforma", testJuegos.getGenero());
        assertEquals(1991, testJuegos.getAno_lanzamiento());
        assertEquals(29.99f, testJuegos.getPrecio());
    }

    @Test
    public void equalsJuegosTest(){
        Juegos juego1 = new Juegos("Super Mario Bros","Nintendo","Plataforma",1989,29.99f);
        Juegos juego2 = new Juegos("The Secret of Monkey Island","PC","Aventura Gráfica",1990,19.99f);
        Juegos juego3 = new Juegos("Pang","PC","Shooter",1995,9.99f);
        Juegos juego4 = new Juegos("Maniac Mansion","PC","Aventura Gráfica",1989,19.99f);
        Juegos juego5 = new Juegos("Sonic 3 & Knuckles","Sega","Plataforma",1993,29.99f);
        Juegos juego6 = new Juegos("Crash Bandicoot","Sony Playstation","Plataforma",1995,39.99f);

        assertEquals(juego2, juego3);
        assertNotEquals(juego1, juego4);
        assertNotEquals(juego5, juego6);
    }
}
