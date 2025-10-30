package org.example.apuntes.repaso.prac_trabajo;

import java.util.Scanner;

public class ex1 {
    public static Scanner sc = new Scanner(System.in);

    static void main(String[] args) {

        int n1 = sc.nextInt();
        sc.nextLine();
        int n2 = sc.nextInt();
        sc.nextLine();

        int restar = restar(n1, n2);
        System.out.println(restar);

        int suma = sumar(n1, n2);
        System.out.println(suma);


    }

    public static int sumar(int n1, int n2) {
        return n1+n2;
    }

    public static int restar(int n1, int n2){
        return n1-n2;

    }

}
