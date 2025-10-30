package org.example.UT02_ESTRUCTURAS_CONTROL.For;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir los dos años
        System.out.print("Escribe el primer año: ");
        int a1 = scanner.nextInt();
        System.out.print("Escribe el segundo año: ");
        int a2 = scanner.nextInt();

        // Mostrar los años bisiestos entre los dos
        System.out.println("Años bisiestos entre " + a1 + " y " + a2 + ":");

        int menor = a1;
        int mayor = a2;
        if (a1 > a2) {
            menor = a2;
            mayor = a1;
        }

        for (int a = menor; a <= mayor; a++) {
            if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)) {
                System.out.println(a);
            }
        }
        scanner.close();
    }
}

//EJER5 CORREGIDO - SOLUCIÓN:
/*package org.example.forexercises;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un año");
        int y1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Introduce otro año");
        int y2 = scanner.nextInt();
        scanner.nextLine();

        if(y1 > y2) {
            int temp = y1;
            y1 = y2;
            y2 = temp;
        }

        for (int i= y1; i <= y2; i++) {
            if(i % 4 == 0 && i % 100 != 0 ) {
                System.out.println(i + " es año bisiesto");
            }
        }
    }
}*/


