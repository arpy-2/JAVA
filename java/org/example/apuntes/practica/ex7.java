package org.example.apuntes.practica;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero: ");
        double num1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduce el exponente: ");
        double expo = sc.nextInt(); //exponente
        sc.nextLine();
        if (expo > 0) {
            double result = Math.pow(num1, expo);
            System.out.println("Resultado es: " + result);
        }
        else if (expo == 0) {
            System.out.println("Resultado es: 1");
        }
        else {
            double result2 = Math.pow(num1, expo) ;
            System.out.println("Resultado es: " + result2);
        }
        sc.close();
    }
}
