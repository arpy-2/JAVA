package org.example.UT02_ESTRUCTURAS_CONTROL.whileexer;

import java.util.Scanner;

public class Ejer2 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduce el primer numero: ");
            int num1 = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Introduce el segundo numero: ");
            int num2 = scanner.nextInt();
            scanner.nextLine();

            while (num2 <= num1){ // a la inversa de lo que pide
                System.out.println("Introduce de nuevo segundo numero: ");
                num2 = scanner.nextInt();
                scanner.nextLine();
            }
            System.out.println( num1 + " y " + num2);
            scanner.close();
    }
}

//EJE2 CORREGIDO - SOLUCIÓN:
/*package org.example.whilexercices;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el primer numero");

        double num1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Introduce el segundo numero");

        double num2 = scanner.nextDouble();
        scanner.nextLine();

        while (num2 >= num1) {
            System.out.println("El segundo numero ha de ser menor que el primero");
            num2 = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println(num1 + " " + num2);
    }
}*/

