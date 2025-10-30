package org.example.UT03_MÉTODOS_ARRAYS.programas_métodos;

import java.util.Scanner;

public class Ejer3 {
    //metodo principal para ejecucion
    public static void main(String[] args) {
        ejecuMenu();
    }

    //metodo llama al scanner
    public static Scanner sc = new Scanner(System.in);

   // Metodo imprime el menú y devuelve opción elegida
   public static int mostraMenu() {
       System.out.println("--- MENÚ ---");
       System.out.println("1. Saluda");
       System.out.println("2. Grita");
       System.out.println("3. Salir");
       System.out.print("Elige una opción (1-3): ");
       int opcion = sc.nextInt();
       sc.nextLine(); //Limpia
       return opcion;
   }

   //Metodo Saluda
   public static void salu() {
       System.out.print("Introduce tu nombre: ");
       String nombre = sc.nextLine();
       System.out.println("Hola, " + nombre);
   }
   //Metodo Grita
   public static void gri() {
       System.out.print("Introduce tu nombre: ");
       String nombre = sc.nextLine();
       System.out.println("¡Cuidado, " + nombre + "!");
   }

   //Metodo implementa bucle del menú interactivo
   public static void ejecuMenu() {
            int opcion;
            do {
                opcion = mostraMenu();
                switch (opcion) {
                    case 1:
                        salu();
                        break;
                    case 2:
                        gri();
                        break;
                    case 3:
                        System.out.println("¡Hasta luego!");
                        break;
                    default:
                        System.out.println("Opción no válida, intenta de nuevo.");
                }
            } while (opcion != 3);


   }
}

//EJER3 CORREGIDO - SOLUCIÓN:
/*package org.ies.tierno;

import java.util.Scanner;

public class Ej3 {
    public static Scanner scanner = new Scanner(System.in);

    public static int menu() {
        int option;
        do {
            option = askOption();

            if (option == 1) {
                hello();
            } else if (option == 2) {
                shout();
            } else {
                exit();
            }

        } while (option != 3);
        return option;
    }

    public static String askName(Scanner scanner) {
        System.out.println("Escribe tu nombre");
        return scanner.nextLine();
    }

    public static void hello() {
        String name = askName(scanner);
        System.out.println("Hola , " + name);
    }

    public static void shout() {
        String name = askName(scanner);
        System.out.println("Cuidado, " + name + "!!!");
    }

    public static void exit() {
        System.out.println("adiós");
    }

    public static void main(String[] args) {
        menu();
    }

    public static int askOption() {
        System.out.println("1. Saluda");
        System.out.println("2. Grita ");
        System.out.println("3. Salir ");

        int option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }
}**/



