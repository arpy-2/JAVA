package org.example.UT02_ESTRUCTURAS_CONTROL.ifexercise;

import java.util.Scanner;

public class Calculator { //EJER6
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Pedir la operación
        System.out.print("Introduce la operación (+ o -): ");
        String operacion = scanner.nextLine();
        if (operacion.equals("+")) {
        // Si la operación es suma, pedimos dos números double
            System.out.print("Introduce un número decimal a: ");
            double a = scanner.nextDouble();
            System.out.print("Introduce otro número decimal b: ");
            double b = scanner.nextDouble();
            double resultado = a + b;
            System.out.println("El resultado de la suma es: " + resultado);
        } else if (operacion.equals("-")) {
        // Si la operación es resta, pedimos dos números enteros
            System.out.print("Introduce un número entero a: ");
            int a = scanner.nextInt();
            System.out.print("Introduce otro número entero b: ");
            int b = scanner.nextInt();
            int resultado = a - b;
            System.out.println("El resultado de la resta es: " + resultado);
        } else {
        System.out.println("Operación no válida. Solo se permiten '+' o '-'.");
    }
        scanner.close();
    }
}


//EJER6 CORREGIDO - SOLUCIÓN:
//
//public class Calculator {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Si quieres sumar pon + y si quieres restar pon -");
//        String ope = sc.nextLine();
//        if (ope.equals("+")) {
//            System.out.println("Dime un número");
//            double n1 = sc.nextDouble();
//            sc.nextLine();
//            System.out.println("Dame otro número");
//            double n2 = sc.nextDouble();
//            sc.nextLine();
//            double sum = n1 + n2;
//            System.out.println("Su suma es " + sum);
//        } else if (ope.equals("-")) {
//            System.out.println("Dame un número");
//            int n1 = sc.nextInt();
//            sc.nextLine();
//            System.out.println("Dame otro maás");
//            int n2 = sc.nextInt();
//            sc.nextLine();
//            int subs = n1 - n2;
//            System.out.println("El resultado es " + subs);
//        } else {
//            System.out.println("Operación inválida");
//        }
//    }
//}

