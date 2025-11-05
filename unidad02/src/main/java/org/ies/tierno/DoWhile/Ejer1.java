package org.ies.tierno.DoWhile;

import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            // Mostrar el menú
            System.out.println("Menú:");
            System.out.println("1. Saluda");
            System.out.println("2. Grita");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción (1-3): ");
            opcion = scanner.nextInt(); // Lee la opción
            scanner.nextLine(); // Limpiar el buffer después de nextInt()

            // Condición
            if (opcion == 1) {
                System.out.print("Introduce tu nombre: ");
                String nombre = scanner.nextLine();
                System.out.println("Hola, " + nombre);
            } else if (opcion == 2) {
                System.out.print("Introduce tu nombre: ");
                String nombre = scanner.nextLine();
                System.out.println("Cuidado, " + nombre + "!");
            } else if (opcion == 3) {
                System.out.println("¡Hasta luego!");
            } else {
                System.out.println("Opción no válida, por favor intenta de nuevo.");
            }
            System.out.println(); // Línea en blanco para separar iteraciones
        } while (opcion != 3);
        scanner.close(); // Cerrar el scanner
    }
}

//EJER1 CORREGIDO - SOLUCIÓN:
/*package org.example.dowhile;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("Elige una opción: ");
            System.out.println("1. Saluda");
            System.out.println("2. Grita");
            System.out.println("3. Salir");
            option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {
                System.out.println("Introduce tu nombre");
                String name = scanner.nextLine();
                System.out.println("Hola, " + name);
            } else if (option == 2) {
                System.out.println("Introduce tu nombre");
                String name = scanner.nextLine();
                System.out.println("Cuidado, " + name + "!");
            } else if (option == 3) {
                System.out.println("Saliendo del menú");
            } else {
                System.out.println("Opción inválida");
            }
        } while (option != 3);
    }
}*/

