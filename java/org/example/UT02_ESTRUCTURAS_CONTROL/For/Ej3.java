package org.example.UT02_ESTRUCTURAS_CONTROL.For;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        int suma = 0;
        System.out.print("El sumatorio de 0 a " + n + " es: ");
        for (int i = 0; i <= n; i++) { //bucle
            suma += i;
            if (i > 0) {
                System.out.print(" + ");
            }
            System.out.print(i);
        } //se cierra la interacción
        System.out.print(" = " + suma);
        System.out.println(); // Nueva línea al final

        scanner.close();
    }
}

//EJER3 CORREGIDO - SOLUCIÓN:
/*package org.example.forexercises;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un entero positivo");
        int num = scanner.nextInt();
        scanner.nextLine();

        if (num > 0) {
            int sum = 0;
            for (int i = 0; i <= num; i++) {
                sum = sum + i;
            }
            System.out.println(sum);
        } else {
            System.out.println("El número introducido no es positivo");
        }
    }
}*/



