package org.ies.tierno.While;

import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //while: mientras - condicion
        System.out.println("Introduce el primer numero: ");
        int num1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduce el segundo numero: ");
        int num2 = scanner.nextInt();
        scanner.nextLine();

        //Instrucción de bucle (repite un bloque)
        while (num2 <= num1){ // a la inversa de lo que pide
            System.out.println("Introduce de nuevo segundo numero: ");
            num2 = scanner.nextInt();
            scanner.nextLine();
        }
        //resultado
        System.out.println( num1 + " y " + num2);
        scanner.close();
    }
}

//EJER1 CORREGIDO - SOLUCIÓN:
/*package org.example.whilexercices;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el primer numero");

        int num1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Introduce el segundo numero");

        int num2 = scanner.nextInt();
        scanner.nextLine();

        while (num2 <= num1) {
            System.out.println("El segundo numero ha de ser mayor al primero");
            num2 = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println(num1 + " " + num2);
    }
}*/
