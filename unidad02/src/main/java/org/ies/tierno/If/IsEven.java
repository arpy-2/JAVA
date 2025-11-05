package org.ies.tierno.If;

import java.util.Scanner;

public class IsEven { //EJER2
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        // Pedir un número entero
        System.out.print("Introduce un número entero: ");
        int n = scanner.nextInt();
        // Comprobar si el número es 0, par o impar
        if (n == 0) {
            System.out.println("No es ni par ni impar");
        } else if (n % 2 == 0) {
            System.out.println("Es par");
        } else if (n % 2 == 1 || n % 2 == -1) {
            // También consideramos el caso de números negativos impares
            System.out.println("Es impar");
        }
        // Cerrar el scanner
        scanner.close();
    }
}



//EJER2 CORREGIDO - SOLUCIÓN:
//package org.example.ifexercises;
//
//import java.util.Scanner;
//
//public class IsEven {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Introduce un número entero");
//        int num1 = scanner.nextInt();
//        scanner.nextLine();
//
//        if (num1 == 0) {
//            System.out.println("No es ni PAR ni IMPAR");
//        } else if (num1 % 2 == 0) {
//            System.out.println("Es PAR");
//        } else {
//            System.out.println("Es IMPAR");
//        }
//    }
//}