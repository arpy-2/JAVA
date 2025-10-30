package org.example.UT01_INTRODUCCIÓN_PROGRAMACIÓN.variables;

import java.util.Scanner;

public class Increments { //EJER1
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Pedir al usuario que ingrese un número double (number)
        System.out.println("Por favor, ingresa un número decimal:");
        double number = scanner.nextDouble();
        //Incrementar el número en 1 dos veces
        number = number + 1;
        number = number + 1;
        scanner.nextLine();
        //Muestra el resultado
        System.out.println("El resultado es " + number);
    }
}


//EJER1 CORREGIDO - SOLUCIÓN:
//package org.example.variablexercise;
//
//import java.util.Scanner;
//
//public class Increments {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Introduce un número real: ");
//        double number = scanner.nextDouble();
//        scanner.nextLine();
//        System.out.println("Introduce tu nombre");
//        String nombre = scanner.nextLine();
//        number ++;
//        number ++;
//        System.out.println("Hola " + nombre + ", el resultado es " + number);
//    }
//}