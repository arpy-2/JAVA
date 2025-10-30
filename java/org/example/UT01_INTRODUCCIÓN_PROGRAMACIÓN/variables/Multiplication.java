package org.example.UT01_INTRODUCCIÓN_PROGRAMACIÓN.variables;

import java.util.Scanner;

public class Multiplication { //EJER3
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Pido al usuario que ingrese un número int (number1)
        System.out.println("Por favor, ingresa el primer número:");
        int number1 = scanner.nextInt();
        //Pido al usuario que ingrese otro número int (number2)
        System.out.println("Por favor, ingresa el segundo número:");
        int number2 = scanner.nextInt();
        //Calculo de la multiplicación
        int result = number1 * number2;
        //Muestra el resultado
        System.out.println("El resultado de la multiplicación es " + result);
    }
}


//EJER3 CORREGIDO - SOLUCIÓN:
//package org.example.variablexercise;
//
//import java.util.Scanner;
//public class Multiplication {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Introduce un entero");
//        int n1 = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("Introduce otro entero");
//        int n2 = scanner.nextInt();
//        scanner.nextLine();
//        int res = n1 * n2;
//        System.out.println("El resultado es " + res);
//    }
//}
