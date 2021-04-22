package com.sanvalero.retroshop;

import com.sanvalero.retroshop.domain.Juego;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class JuegoTest {

    @Test
    public void registrarJuegosTest(){

        Juego testJuego = new Juego("Sonic The Hedgehog","Sega","Aventura",1991,29.99f);

        assertNotEquals("Metroid", testJuego.getTitulo());
        assertEquals("Sega", testJuego.getPlataforma());
        assertNotEquals("Plataforma", testJuego.getGenero());
        assertEquals(1991, testJuego.getAno_lanzamiento());
        assertEquals(29.99f, testJuego.getPrecio());
    }

    @Test
    public void equalsJuegosTest(){
        Juego juego1 = new Juego("Super Mario Bros","Nintendo","Plataforma",1989,29.99f);
        Juego juego2 = new Juego("The Secret of Monkey Island","PC","Aventura Gráfica",1990,19.99f);
        Juego juego3 = new Juego("Pang","PC","Shooter",1995,9.99f);
        Juego juego4 = new Juego("Maniac Mansion","PC","Aventura Gráfica",1989,19.99f);
        Juego juego5 = new Juego("Sonic 3 & Knuckles","Sega","Plataforma",1993,29.99f);
        Juego juego6 = new Juego("Crash Bandicoot","Sony Playstation","Plataforma",1995,39.99f);

        assertEquals(juego2, juego3);
        assertNotEquals(juego1, juego4);
        assertNotEquals(juego5, juego6);
    }
}
