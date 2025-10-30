package org.example.apuntes.repaso.metodos;

import java.util.Scanner;

public class ex1 {
    public static Scanner sc = new Scanner(System.in);

    public static int suma (int n1, int n2) {
        int sum = n1 + n2;
        return sum;
    }

    public static void main(String[] args) {
        int n1 = sc.nextInt();
        sc.nextLine();
        int n2 = sc.nextInt();
        sc.nextLine();

        int suma = suma(n1, n2);
        resultado(suma);
    }

    public static void resultado(int suma) {
        System.out.println(suma);
    }
}
