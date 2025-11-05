package org.ies.tierno.If;

import java.util.Scanner;

public class SumSubs { //EJER5
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Pedir el primer número entero (a)
            System.out.print("Introduce el número entero a: ");
            int a = scanner.nextInt();
        // Pedir el segundo número entero (b)
            System.out.print("Introduce el número entero b: ");
            int b = scanner.nextInt();
            if (a > b) {
            int suma = a + b;
            System.out.println("La suma de a y b es: " + suma);
            } else if (a == b) {
            int resta = a - b;
            System.out.println("La resta de a - b es: " + resta);
            } else {
        // a es menor que b, pedir otro número c
            System.out.print("Introduce otro número entero c: ");
            int c = scanner.nextInt();
            int suma = a + b;
            if (c > suma) {
            System.out.println("c es mayor que a + b");
            } else if (c < suma) {
            System.out.println("c es menor que a + b");
            } else {
            System.out.println("c es igual que a + b");
            }
        }
    }
}



//EJER5 CORREGIDO - SOLUCIÓN:
//package org.example.ifexercises;
//
//import java.util.Scanner;
//
//public class SumSubs {
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Introduzca un primer número: ");
//        var a = scanner.nextInt();
//        scanner.nextLine();
//
//        System.out.print("Introduzca un segundo número; ");
//        var b = scanner.nextInt();
//        scanner.nextLine();
//
//        if (b < a){
//            var sum = a+b;
//            System.out.print(sum);
//        } else if (a<b) {
//            var res = a - b;
//            System.out.print(res);
//        } else {
//            var sum = a+b;
//
//            System.out.print("Introduzca un tercer número: ");
//            var c = scanner.nextInt();
//            scanner.nextLine();
//
//            if (c < sum){
//                System.out.print("c es menor que a + b");
//            } else if (c > sum) {
//                System.out.print("c es mayor que a + b");
//
//            } else {
//                System.out.print("c es igual a a+b");
//            }
//        }
//
//    }
//}

