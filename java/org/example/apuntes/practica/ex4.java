package org.example.apuntes.practica;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        int number1 = scanner.nextInt();

        System.out.println("Introduce el segundo numero: ");
        int number2 = scanner.nextInt();

        if (number2 == 0){
            System.out.println("error");
        }
        else {
            double result = number1 / number2;
            System.out.println("El resultado es: " + result);
        }
        scanner.close();
    }
}
