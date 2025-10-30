package org.example.UT02_ESTRUCTURAS_CONTROL.dowhile;

import java.util.Scanner;

public class Ejer2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int opcion;
        double num1, num2, resultado;

        // El programa se repite hasta que el usuario elija salir (opción 4)
        do {
            // Mostrar el menú
            System.out.println("\nSeleccione una operación:");
            System.out.println("1. Sumar dos números");
            System.out.println("2. Restar dos números");
            System.out.println("3. Multiplicar dos números");
            System.out.println("4. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            // Verificar la opción elegida
            if (opcion == 1) {
                // Sumar
                System.out.print("Ingrese el primer número: ");
                num1 = scanner.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                num2 = scanner.nextDouble();
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
            } else if (opcion == 2) {
                // Restar
                System.out.print("Ingrese el primer número: ");
                num1 = scanner.nextDouble();
                System.out.print("Ingrese el segundo número: ");num2 = scanner.nextDouble();
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
            } else if (opcion == 3) {
                // Multiplicar
                System.out.print("Ingrese el primer número: ");
                num1 = scanner.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                num2 = scanner.nextDouble();
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
            } else if (opcion == 4) {
                // Salir
                System.out.println("Saliendo del programa...");
            } else {
                // Opción inválida
                System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 4); // Repetir mientras no se elija salir
        scanner.close(); // Cerrar el scanner al final
    }
}

//EJER2 CORREGIDO - SOLUCIÓN:
/**/