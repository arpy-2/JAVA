package org.example.UT01_INTRODUCCIÓN_PROGRAMACIÓN.variables;

import java.util.Scanner;

public class Division { //EJER2
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Pido al usuario que ingrese un número double(numerator)
        System.out.println("Por favor, ingresa el numerador:");
        double numerator = scanner.nextDouble();
        //Pido al usuario que ingrese otro número double (denominator)
        System.out.println("Por favor, ingresa el denominador:");
        double denominator = scanner.nextDouble();
        //Muestra el resultado
        double result = numerator / denominator;
        System.out.println("El resultado de la división es " + result);
    }
}


//EJER2 CORREGIDO - SOLUCIÓN:
//package org.example.variablexercise;
//
//import java.util.Scanner;
//public class Division {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Introduce el numerador");
//        double numerator = scanner.nextDouble();
//        scanner.nextLine();
//        System.out.println("Introduce el denominador");
//        double denominator = scanner.nextDouble();
//        scanner.nextLine();
//        double division = numerator / denominator;
//        System.out.println("El resultado es " + division);
//    }
//}

