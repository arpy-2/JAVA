package org.ies.tierno.For;

import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántos números vas a introducir? ");
        //variables
        int num = scanner.nextInt();
        int negativos = 0;

        //i en el bucle for es un contador que se usa para repetir una acción (varias veces)
        for (int i = 1; i <= num; i++) {
            System.out.print("Escribe el número " + i + ": ");
            int numero = scanner.nextInt();
            if (numero < 0) {
                //negativo = negativo + 1; (otra forma de aumentar el valor (+1) de la variable negativo)
                negativos++;
            }
        }
        //resultado
        System.out.println("Escribiste " + negativos + " número/s negativo/s.");
        scanner.close();
    }
}

//EJER6 CORREGIDO - SOLUCIÓN:
/*package org.example.forexercises;

import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Preguntar cuántos números se van a introducir
        System.out.print("¿Cuántos números vas a introducir? ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        if (cantidad >= 0) {
            int negativos = 0;

            //Pedir los números uno a uno
            for (int i = 1; i <= cantidad; i++) {
                System.out.print("Introduce el número " + i + ": ");
                int num = sc.nextInt();
                sc.nextLine();

                if (num < 0) {
                    negativos++;
                }
            }
            System.out.println("Se han introducido " + negativos + " números negativos.");
        } else {
            System.out.print("El numero debe ser positivo");
        }
    }
}*/