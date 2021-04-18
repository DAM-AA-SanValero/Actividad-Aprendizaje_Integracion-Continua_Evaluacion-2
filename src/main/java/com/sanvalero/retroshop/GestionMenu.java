package com.sanvalero.retroshop;

import com.sanvalero.retroshop.domain.Consolas;
import com.sanvalero.retroshop.domain.Juegos;
import com.sanvalero.retroshop.domain.Merchandising;
import java.util.ArrayList;
import java.util.Scanner;

public class GestionMenu {
    Scanner kb = new Scanner(System.in);

    private boolean salirMenu = false;

    ArrayList<Consolas> listadoConsolas = new ArrayList<>();
    ArrayList<Juegos> listadoJuegos = new ArrayList<>();
    ArrayList<Merchandising> listadoMerchandising = new ArrayList<>();

    public void ejecutarMenu() {
        do {
            System.out.println("Elige una opción:\n------------------------");
            System.out.println("1. Registrar productos");
            System.out.println("2. Visualizar productos");
            System.out.println("0. Salir del menú\n------------------------");
            int opcion = kb.nextInt();

            switch (opcion) {
                case 1:
                    registrarProductos();
                    break;
                case 2:
                    //VisualizarProductos();
                    break;
                case 0:
                    salirMenu = true;
                    System.out.println("---------------------\nSaliendo del programa...");
            }
        } while (!salirMenu);
    }

    public void registrarProductos() {
        do {
            System.out.println("Elige una opción:\n------------------------");
            System.out.println("1. Registrar una consola");
            System.out.println("2. Registrar un juego");
            System.out.println("3. Registrar un producto de merchandising");
            System.out.println("0. Salir del menú\n------------------------\n");

            int opcion = kb.nextInt();
            kb.nextLine();

            switch (opcion) {
                case 1:
                    registrarConsola();

                    break;
                case 2:
                    registrarJuego();
                    break;
                case 3:
                    registrarMerchandising();
                    break;
                case 0:
                    salirMenu = true;
                    System.out.println("---------------------\nSaliendo del programa...");
            }

        } while (!salirMenu);
    }

    public void registrarConsola() {

        System.out.println("Introduce el nombre de la consola: ");
        String nombre = kb.nextLine();

        System.out.println("Introduce su desarrollador: ");
        String desarrollador = kb.nextLine();

        System.out.println("Introduce el pais de fabricacion: ");
        String pais_fabricacion = kb.nextLine();

        System.out.println("Introduce el año de fabricación: ");
        int ano_fabricacion = kb.nextInt();

        System.out.println("Introduce el precio del producto: ");
        float precio = kb.nextFloat();

        Consolas consolas = new Consolas(nombre, desarrollador, pais_fabricacion, ano_fabricacion, precio);
        listadoConsolas.add(consolas);

        System.out.println("Consola registrada con éxito\n---------------------------");
    }

    public void registrarJuego() {

        System.out.println("Introduce el titulo del juego: ");
        String titulo = kb.nextLine();

        System.out.println("Introduce su plataforma: ");
        String plataforma = kb.nextLine();

        System.out.println("Introduce su genero: ");
        String genero = kb.nextLine();

        System.out.println("Introduce su año de lanzamiento: ");
        int ano_lanzamiento = kb.nextInt();

        System.out.println("Introduce su precio: ");
        float precio = kb.nextFloat();

        Juegos juegos = new Juegos(titulo, plataforma, genero, ano_lanzamiento, precio);
        listadoJuegos.add(juegos);

        System.out.println("Juego registrado con éxito\n---------------------------");
    }

    public void registrarMerchandising() {

        System.out.println("Introduce el nombre del producto: ");
        String nombre = kb.nextLine();

        System.out.println("Introduce su marca: ");
        String marca = kb.nextLine();

        System.out.println("Introduce su pais de procedencia: ");
        String procedencia = kb.nextLine();

        System.out.println("Introduce su año de fabricacion: ");
        int ano_fabricacion = kb.nextInt();

        System.out.println("Introduce su precio: ");
        float precio = kb.nextFloat();

        Merchandising merchandising = new Merchandising(nombre, marca, procedencia, ano_fabricacion, precio);
        listadoMerchandising.add(merchandising);

        System.out.println("Producto registrado con éxito\n---------------------------");
    }


}

