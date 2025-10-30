package org.example.UT02_ESTRUCTURAS_CONTROL.For;

import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos números se van a introducir? ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("No se introdujeron números.");
            scanner.close();
            return;
        }

        double suma = 0.0;
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            int num = scanner.nextInt();
            suma += num;
        }

        double media = suma / n;
        System.out.println("La media de los números introducidos es: " + media);

        scanner.close();
    }
}

//EJER8 CORREGIDO - SOLUCIÓN:
/*package org.example.forexercises;

import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe la cantidad de números a introducir.");
        int n = scanner.nextInt();
        scanner.nextLine();

        if (n > 0) {
            double sum = 0;

            for (int i = 0; i < n; i++) {
                System.out.println("Escribe un número");
                double number = scanner.nextInt();
                scanner.nextLine();
                sum = sum + number;
            }

            double average = sum / n;
            System.out.println("La media de todos los números introducidos es " + average);
        } else {
            System.out.println("La cantidad de números debe ser >0");
        }
    }
}*/

