package org.ies.tierno.For;

import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero mayor que 1: ");
        int n = scanner.nextInt();

        if (n <= 1) {
            System.out.println("El número debe ser mayor que 1.");
            scanner.close();
            return;
        }

        boolean esPrimo = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                esPrimo = false;
                break;
            }
        }

        if (esPrimo) {
            System.out.println(n + " es un número primo.");
        } else {
            System.out.println(n + " no es un número primo.");
        }

        scanner.close();
    }
}

//EJER9 CORREGIDO - SOLUCIÓN:
/*package org.example.forexercises;


import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un número entero mayor que 1: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        boolean isPrime = true;

        if (number > 1) {
            for (int i = 2; i < number; i++) {
                if (number % i != 0) {
                    System.out.print(" [" + number + ": " + number + " % " + i + " == 0 ]; ");
                } else {
                    isPrime = false;
                    System.out.print(" [" + number + ": " + number + " % " + i + " != 0]; ");
                }
            }
            if (!isPrime) {
                System.out.print("--> NO ES PRIMO");
            } else {
                System.out.print(" TODO FALSO-->" + " ES PRIMO");
            }
        } else {
            System.out.println("Introduzca un número mayor que uno");
        }
    }
}*/
