package org.example.UT02_ESTRUCTURAS_CONTROL.ifexercise;

import java.util.Scanner;

public class Compare { //EJER1
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        // Pedir el primer número entero
        System.out.print("Introduce el primer número entero: ");
        int num1 = scanner.nextInt();
        // Pedir el segundo número entero
        System.out.print("Introduce el segundo número entero: ");
        int num2 = scanner.nextInt();
        // Comparar los números y mostrar el resultado
        if (num1 > num2) {
            System.out.println("Es mayor");
        } else if (num1 < num2) {
            System.out.println("Es menor");
        } else {
            System.out.println("Son iguales");
        }
        // Cerrar el scanner
        scanner.close();
    }
}



//EJER1 CORREGIDO - SOLUCIÓN:
//package org.example.ifexercises;
//
//import java.util.Scanner;
//
//public class Compare {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(
//                System.in
//        );
//
//        System.out.println("Dime un número");
//        double number = scanner.nextDouble();
//        scanner.nextLine();
//
//        System.out.println("Dime otro número");
//        double number2 = scanner.nextDouble();
//        scanner.nextLine();
//        if (number > number2) {
//            System.out.println("Es mayor");
//        } else if (number < number2) {
//            System.out.println("Es menor");
//        } else {
//            System.out.println("Es igual");
//        }
//    }
//}