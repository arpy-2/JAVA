package org.example.UT01_INTRODUCCIÓN_PROGRAMACIÓN.variables;

import java.util.Scanner;

public class AreEqual { //EJER4
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Pido al usuario que ingrese un número int (number1)
        System.out.println("Por favor, ingresa el primer número:");
        int number1 = scanner.nextInt();
        //Pido al usuario que ingrese otro número int (number2)
        System.out.println("Por favor, ingresa el segundo número:");
        int number2 = scanner.nextInt();
        scanner.close();
        // Muestro true si son iguales, false si no lo son
        System.out.println(number1 == number2);
    }
}


//EJER4 CORREGIDO - SOLUCIÓN:
//package org.example.variablexercise;
//
//import java.util.Scanner;
// public class AreEqual {
//    public static void main(String[] args) {
//        // Creamos la utilidad scanner con la que después solicitamos datos al usuario
//        Scanner scanner = new Scanner(System.in);
//        // Pedimos al usuario el primer número a comparar
//        System.out.println("Introduce el primer número a comparar");
//        int num1 = scanner.nextInt();
//        scanner.nextLine();
//        // Pedimos al usuario el segundo número a comparar
//        System.out.println("Introduce el segundo número a comparar");
//        int num2 = scanner.nextInt();
//        scanner.nextLine();
//        // Comparamos los dos números para comprobar si son iguales y mostramos en pantalla si lo es o no
//        boolean areEquals = num1 == num2;
//        System.out.println("¿Son iguales? " + areEquals);
//    }
//}
