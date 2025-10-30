package org.example.apuntes.practica;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // sc es otra forma de poner scanner
        System.out.println("introduce un número");
        int numero1 = sc.nextInt();
        sc.nextLine();

        if (numero1 % 2 == 0) {
            System.out.println("es par");

        } else {
            System.out.println("es impar");
        }
        sc.close();
    }
}
