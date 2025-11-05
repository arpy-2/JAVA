package org.ies.tierno.For;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero: ");
        int a = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int b = scanner.nextInt();

        int min = Math.min(a, b);
        int max = Math.max(a, b);

        System.out.println("Los números entre " + min + " y " + max + " son:");
        for (int i = min; i <= max; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); // Nueva línea al final

        scanner.close();
    }
}

//EJER2 CORREGIDO - SOLUCIÓN:
/*package org.example.forexercises;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número entero");
        int n1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Introduce otro número entero");
        int n2 = scanner.nextInt();
        scanner.nextLine();

        int min;
        int max;
        if (n1 > n2) {
            min = n2;
            max = n1;
        } else {
            min = n1;
            max = n2;
        }

        for (int i = min; i <= max; i++) {
            System.out.println(i);
        }
    }
}*/
