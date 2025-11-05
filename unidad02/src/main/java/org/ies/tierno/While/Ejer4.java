package org.ies.tierno.While;

import java.util.Scanner;

public class Ejer4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //variables
        int contador = 0;
        int numero = 0;

        //mientras se cumpla la condicion
        while (numero >= 0) {
            System.out.print("Introduce número: ");
            numero = scanner.nextInt();
            //si el numero...
            if (numero >= 0) {
                contador++; //incremento 1
            }
        }
        //resultado
        System.out.println("Números introducidos: " + contador);
        scanner.close();
    }
}

//EJER4 CORREGIDO - SOLUCIÓN:
/*package org.example.whilexercices;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        int contador = 0;

        while (numero >= 0) {
            System.out.print("Introduce un número (negativo para salir): ");
            numero = scanner.nextInt();
            scanner.nextLine();

            if (numero >= 0) {
                contador++;
            }
        }
        System.out.println("Has introducido " + contador + " números no negativos.");
    }
}*/








