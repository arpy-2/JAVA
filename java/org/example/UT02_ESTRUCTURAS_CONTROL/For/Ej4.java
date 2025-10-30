package org.example.UT02_ESTRUCTURAS_CONTROL.For;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero positivo: ");
        int n = scanner.nextInt();
        System.out.println("Escribe un número: ");
        int numero = scanner.nextInt();
        int resul = 1;

        for (int i = 1; i <= numero; i++) {
            resul = resul * i;
        }
        System.out.println("El factorial de " + numero + " es: " + resul);
        scanner.close();
    }
}

//EJER4 CORREGIDO - SOLUCIÓN:
/*package org.example.forexercises;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dime un numero: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        System.out.println("Si multiplicas todos los numeros del 1 al " + num + " da de resultado: " + factorial);
    }
}*/

