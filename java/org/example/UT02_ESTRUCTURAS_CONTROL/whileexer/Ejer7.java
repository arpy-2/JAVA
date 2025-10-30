package org.example.UT02_ESTRUCTURAS_CONTROL.whileexer;

import java.util.Scanner;

public class  Ejer7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //variables
        int suma = 0;
        int numero = -1;  // Inicializamos distinto de 0 para entrar al bucle
        while (numero != 0) {
            System.out.print("Introduce un número (0 para terminar): "); //0 para terminar
            numero = scanner.nextInt();
            scanner.nextLine();
            suma += numero; //"+=" suma
        }
        //resultado
        System.out.println("Suma total: " + suma);
        scanner.close();
    }
}

//EJER7 CORREGIDO - SOLUCIÓN:
/*package org.example.whilexercices;

import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int numero = -1;
        while (numero != 0) {
            System.out.print("Introduce un número (0 para terminar): ");
            numero = scanner.nextInt();
            scanner.nextLine();
            suma += numero;
        }
        System.out.println("Suma total: " + suma);
        scanner.close();
    }
}*/
