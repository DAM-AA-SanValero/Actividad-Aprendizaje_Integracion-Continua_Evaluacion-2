package com.sanvalero.retroshop;

import java.util.Scanner;

public class GestionMenu {
    Scanner kb = new Scanner(System.in);

    private boolean salirMenu = false;

    public void ejecutarMenu() {
        do {
            System.out.println("Elige una opción:\n------------------------");
            System.out.println("1. Registrar productos");
            System.out.println("2. Visualizar productos");
            System.out.println("0. Salir del menú\n------------------------");
            int opcion = kb.nextInt();

            switch (opcion) {
                case 1:
                    //registrarProductos();
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
}

