package org.example.UT02_ESTRUCTURAS_CONTROL.For;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pide al usuario un número entero (n)
        System.out.print("Introduce un número entero (n): ");
        int n = sc.nextInt();

        // Consume la línea nueva después de leer el entero
        sc.nextLine();

        // Pide al usuario un mensaje
        System.out.print("Introduce un mensaje: ");
        String message = sc.nextLine();

        // Imprime el mensaje n veces
        for (int i = 0; i < n; i++) {
            System.out.println(message);
        }

        sc.close();
    }
}

//EJER1 CORREGIDO - SOLUCIÓN:
/*package org.example.forexercises;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un mensaje");
        String mensaje = sc.nextLine();

        System.out.println("Introduce el número de veces que quieres que se repita el mensaje");
        int num = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < num; i++) {
            System.out.println(mensaje);
        }
    }
}*/
