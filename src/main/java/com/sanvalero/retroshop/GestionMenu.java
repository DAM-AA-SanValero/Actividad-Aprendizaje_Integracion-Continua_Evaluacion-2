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
                    visualizarProductos();
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
            System.out.println("3. Registrar merchandising");
            System.out.println("4. Volver al menú");
            System.out.println("0. Salir del menú\n------------------------");

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
                case 4:
                    ejecutarMenu();
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

    public void visualizarProductos() {
        do {
            System.out.println("Elige una opción:\n------------------------");
            System.out.println("1. Visualizar consolas registradas");
            System.out.println("2. Visualizar juegos registrados");
            System.out.println("3. Visualizar merchandising registrado");
            System.out.println("4. Volver al menú principal");
            System.out.println("0. Salir del menú\n------------------------");

            int opcion = kb.nextInt();
            kb.nextLine();

            switch (opcion) {
                case 1:
                    visualizarConsolas();
                    break;
                case 2:
                    visualizarJuegos();
                    break;
                case 3:
                    visualizarMerchandising();
                    break;
                case 4:
                    ejecutarMenu();
                    break;
                case 0:
                    salirMenu = true;
                    System.out.println("---------------------\nSaliendo del programa...");
            }

        } while (!salirMenu);
    }

    public void visualizarConsolas() {
        System.out.println("Consolas registradas\n----------------------");
        for (Consolas consola : listadoConsolas) {
            System.out.println("PRODUCTO: " + consola.getNombre());
            System.out.println("DESARROLLADOR: " + consola.getDesarrollador());
            System.out.println("PAIS DE FABRICACIÓN: " + consola.getPais_fabricacion());
            System.out.println("AÑO DE FABRICACIÓN: " + consola.getAno_fabricacion());
            System.out.println("PRECIO (€): " + consola.getPrecio());
            System.out.println("-----------------------------");

        }

    }

    public void visualizarJuegos() {

        System.out.println("Juegos registrados\n----------------------");
        for (Juegos juego : listadoJuegos) {
            System.out.println("TITULO: " + juego.getTitulo());
            System.out.println("PLATAFORMA: " + juego.getPlataforma());
            System.out.println("GÉNERO: " + juego.getGenero());
            System.out.println("AÑO DE LANZAMIENTO: " + juego.getAno_lanzamiento());
            System.out.println("PRECIO (€): " + juego.getPrecio());
            System.out.println("-----------------------------");
        }
    }

    public void visualizarMerchandising() {

        System.out.println("Merchandising registrado\n----------------------");
        for (Merchandising producto : listadoMerchandising) {
            System.out.println("PRODUCTO: " + producto.getNombre());
            System.out.println("MARCA: " + producto.getMarca());
            System.out.println("PROCEDENCIA: " + producto.getProcedencia());
            System.out.println("AÑO FABRICACIÓN: " + producto.getAno_fabricacion());
            System.out.println("PRECIO (€): " + producto.getPrecio());

            System.out.println("-----------------------------");
        }
    }
}

