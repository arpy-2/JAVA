package org.ies.tierno.For;

import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántos números vas a ingresar? ");
        int num1 = scanner.nextInt();

        if (num1 <= 0) {
            System.out.println("No ingresaste ningún número.");
            scanner.close();
            return;
        }

        int mayor = -1000; // Usamos un número muy pequeño
        for (int i = 1; i <= num1; i++) {
            System.out.print("Escribe el número " + i + ": ");
            int num2 = scanner.nextInt();

            if (num2 > mayor) {
                mayor = num2;
            }
        }
        System.out.println("El número más grande que ingresaste es: " + mayor);
        scanner.close();
    }
}

//EJER7 CORREGIDO - SOLUCIÓN:
/*package org.example.forexercises;

import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Pregunta cuántos números se van a introducir
        System.out.println("¿Cuántos números vas a introducir?");
        int num = scanner.nextInt();
        scanner.nextLine();

        //La cantidad de números introducidos no puede ser negativa
        if (num > 0) {
            int max = Integer.MIN_VALUE;

            //Pide los números
            for (int i = 1; i <= num; i++) {
                System.out.println("Introduce el número " + i + ": ");
                int n = scanner.nextInt();
                scanner.nextLine();

                //Escribe cual es el número más grande
                if (n > max) {
                    max = n;
                }
            }
            System.out.println("El número más grande es " + max);
        } else {
            System.out.println("El número debe ser positivo");
        }
    }
}*/


