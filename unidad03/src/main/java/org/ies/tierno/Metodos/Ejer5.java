package org.ies.tierno.Metodos;

import java.util.Scanner;

public class Ejer5 {
     //Método que devuelve el sumatorio de 0 hasta n
     public static int calcularSumatorio(int n) {
         int suma = 0;
         for (int i = 0; i <= n; i++) {
             suma += i;
         }
         return suma;
     }

     //Método que devuelve el factorial de n
     public static int calcularFactorial(int n) {
         int factorial = 1;
         for (int i = 1; i <= n; i++) {
             factorial *= i;
         }
         return factorial;
     }

     //Método que calcula la media de cuatro números
     public static double calcularMedia(int a, int b, int c, int d) {
         return (a + b + c + d) / 4.0;
     }

     //Método que muestra las opciones del menú
     public static void mostrarOpciones() {
         System.out.println("--- MENÚ ---");
         System.out.println("1. Sumatorio");
         System.out.println("2. Factorial");
         System.out.println("3. Media");
         System.out.println("4. Salir");
     }

        //Método que imprime el menú y devuelve la opción elegida
        public static int pedirOpcion() {
            Scanner entrada = new Scanner(System.in);
            System.out.print("Elige una opción (1-4): ");
            return entrada.nextInt();
        }

        // Método principal que implementa el menú interactivo
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            int opcion;

            do {
                mostrarOpciones();
                opcion = pedirOpcion();

                switch (opcion) {
                    case 1:
                        System.out.print("Introduce un número entero: ");
                        int numSumatorio = entrada.nextInt();
                        int resultadoSumatorio = calcularSumatorio(numSumatorio);
                        System.out.println("El sumatorio de 0 a " + numSumatorio + " es: " + resultadoSumatorio);
                        break;

                    case 2:
                        System.out.print("Introduce un número entero: ");
                        int numFactorial = entrada.nextInt();
                        int resultadoFactorial = calcularFactorial(numFactorial);
                        System.out.println("El factorial de " + numFactorial + " es: " + resultadoFactorial);
                        break;

                    case 3:
                        System.out.println("Introduce cuatro números enteros:");
                        int a = entrada.nextInt();
                        int b = entrada.nextInt();
                        int c = entrada.nextInt();
                        int d = entrada.nextInt();
                        double media = calcularMedia(a, b, c, d);
                        System.out.println("La media es: " + media);
                        break;

                    case 4:
                        System.out.println("¡Hasta luego!");
                        break;

                    default:
                        System.out.println("Opción no válida. Intenta de nuevo.");
                }
            } while (opcion != 4);
     }
}

//EJER5 CORREGIDO - SOLUCIÓN:
/*package org.ies.tierno;


import java.util.Scanner;

public class Ej5 {
    public static Scanner scanner = new Scanner(
            System.in
    );

    public static void main(String[] args) {
        int option;
        do {
            option = option();
            if (option == 1) {
                int sum = summation();
                System.out.println("=" + sum);
            } else if (option == 2) {
                int factorial = factorial();
                System.out.println("=" + factorial);
            } else if (option == 3) {
                double average = average();
                System.out.println("La media es " + average);
            } else if (option == 4) {
                System.out.println("Saliendo.....");
            } else {
                System.out.println("Opcion invalida");
            }
        } while (option != 4);
    }

    public static int summation() {
        System.out.println("Dime un numero");
        int num = scanner.nextInt();
        scanner.nextLine();
        int sum = 0;
        System.out.print(0);
        for (int i = 1; i <= num; i++) {
            System.out.print("+" + i);
            sum = sum + i;
        }
        return sum;
    }

    public static int factorial() {
        System.out.println("Dime un numero");
        int num = scanner.nextInt();
        scanner.nextLine();
        int factorial = 1;
        System.out.print(1);
        for (int i = 2; i <= num; i++) {
            System.out.print("*" + i);
            factorial = factorial * i;
        }
        return factorial;
    }

    public static double average() {
        double sum = 0;
        for (int i = 1; i <= 4; i++) {
            System.out.println("Dime el " + i + "º numero");
            int num = scanner.nextInt();
            scanner.nextLine();
            sum = sum + num;
        }
        double average = sum / 4;
        return average;
    }

    public static void menu() {
        System.out.println("Elige una opcion: ");
        System.out.println("1.Sumatorio");
        System.out.println("2.Factorial");
        System.out.println("3.Media ");
        System.out.println("4.Salir");
    }

    public static int option() {
        menu();
        int option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }
}**/

