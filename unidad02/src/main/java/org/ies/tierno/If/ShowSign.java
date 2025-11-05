package org.ies.tierno.If;

import java.util.Scanner;

public class ShowSign { //EJER3
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        // Pedir un número entero
        System.out.print("Introduce un número entero: ");
        int n = scanner.nextInt();
        // Comprobar si el número es negativo, positivo o cero
        if (n < 0) {
            System.out.println("Es negativo");
        } else if (n > 0) {
            System.out.println("Es positivo");
        } else {
            System.out.println("No es positivo ni negativo");
        }
        // Cerrar el scanner
        scanner.close();
    }
}



//EJER3 CORREGIDO - SOLUCIÓN:
//package org.example.ifexercises;
//
//import java.util.Scanner;
//
//public class ShowSign {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Dime un numero entero: ");
//        int num1 = scanner.nextInt();
//        scanner.nextLine();
//
//        if (num1 == 0) {
//            System.out.println(num1 + " no es ni positivo ni negativo");
//        } else if (num1 > 0) {
//            System.out.println(num1 + " es un numero positivo");
//        } else {
//            System.out.println(num1 + " es un numero negativo");
//        }
//    }
//}