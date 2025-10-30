package org.example.UT02_ESTRUCTURAS_CONTROL.Switch;

import java.util.Scanner;

public class Ejer1 { //SOLUCIÓN EJER1:
    public static void main(String[] args) {
            System.out.println("¿Qué hora es?");
            Scanner scanner = new Scanner(System.in);
            int hora = scanner.nextInt();
            scanner.nextLine();

            switch (hora) {
                case 6, 7, 8, 9, 10, 11, 12:
                    System.out.println("¡Buenos días!");
                    break;
                case 13, 14, 15, 16, 17, 18, 19, 20:
                    System.out.println("¡Buenas tardes!");
                    break;
                case 0, 1, 2, 3, 4, 5, 21, 22, 23:
                    System.out.println("¡Buenas noches!");
                    break;
                default:
                    System.out.println("Hora Inválida.");
                    break;
            }
    }
}

//EJER1 CORREGIDO - SOLUCIÓN:
/*package org.example.switchexercices;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        System.out.println("¿Qué hora es?");
        Scanner scanner = new Scanner(System.in);
        int hora = scanner.nextInt();
        scanner.nextLine();

        switch (hora) {
            case 6, 7, 8, 9, 10, 11, 12:
                System.out.println("¡Buenos días!");
                break;
            case 13, 14, 15, 16, 17, 18, 19, 20:
                System.out.println("¡Buenas tardes!");
                break;
            case 0, 1, 2, 3, 4, 5, 21, 22, 23:
                System.out.println("¡Buenas noches!");
                break;
            default:
                System.out.println("Hora Inválida.");
                break;
        }
    }
}*/