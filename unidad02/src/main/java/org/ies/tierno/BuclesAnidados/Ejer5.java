package org.ies.tierno.BuclesAnidados;

public class Ejer5 {
}

//EJER5 CORREGIDO - SOLUCIÓN:
/*package org.example.nestedloops;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1;
        do {
            System.out.println("Introduce un número positivo");
            n1 = scanner.nextInt();
            scanner.nextLine();
        } while (n1 < 1);


        int n2;
        do {
            System.out.println("Introduce otro número mayor que " + n1);
            n2 = scanner.nextInt();
            scanner.nextLine();
        } while (n2 < n1);

        for (int i = n1; i <= n2; i++) {
            int sum = 0;
            for (int j = 1; j <= i; j++) {
                sum += j;
            }
            System.out.println("El sumatorio de " + i + " es: " + sum);
        }
    }
}**/