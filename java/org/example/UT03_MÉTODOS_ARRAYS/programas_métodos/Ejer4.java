package org.example.UT03_MÉTODOS_ARRAYS.programas_métodos;

import java.util.Scanner;

public class Ejer4 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion;
        do {
            //Mostrar menú
            System.out.println("Elige una opción");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Salir");
            opcion = sc.nextInt();
            sc.nextLine(); //limpia

            switch (opcion) { //distintas opciones
                case 1: //opcion 1
                    sum();
                    break; //romper = no se ejecutan los otros casos
                case 2: //opcion 2
                    rest();
                    break;
                case 3: //opcion 3
                    multi();
                    break;
                case 4: //opcion 4
                    System.out.println("¡Adiós!");
                    break;
                default:
                    //imprime mensaje error
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);
    }

    //metodo numero
    public static int num(){
        System.out.print("Introduce un número: ");
        int n1 = sc.nextInt();
        sc.nextLine();
        return n1;
    }
    //metodo suma
    public static void sum() {
        int n1 = num();
        int n2 = num();
        int result = n1 + n2;
        System.out.println("Resultado: " + result);
    }
    //metodo resta
    public static void rest() {
        int n1 = num();
        int n2 = num();
        int result = n1 - n2;
        System.out.println("Resultado: " + result);
    }
    //metodo multiplicacion
    public static void multi() {
        int n1 = num();
        int n2 = num();
        int result = n1 * n2;
        System.out.println("Resultado: " + result);
    }
}

//EJER4 CORREGIDO - SOLUCIÓN:
/*package org.ies.tierno;

import java.util.Scanner;

public class Ej4 {
    private static Scanner scanner = new Scanner(System.in);

    public static void menu() {
        int option;
        do {
            System.out.println("Elige una opción:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Salir");
            option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {
                sum();
            } else if (option == 2) {
                substract();
            } else if (option == 3) {
                multiply();
            } else if (option == 4) {
                System.out.println("Saliendo...");
            } else {
                System.out.println("Opción inválida");
            }
        } while (option != 4);
    }

    public static void multiply() {
        int n1 = askNumber();
        int n2 = askNumber();

        int res = mult(n1, n2);

        System.out.println(res);
    }

    public static void substract() {
        int n1 = askNumber();
        int n2 = askNumber();

        int res = subs(n1, n2);

        System.out.println(res);
    }

    public static void sum() {
        int n1 = askNumber();
        int n2 = askNumber();

        int res = add(n1, n2);

        System.out.println(res);
    }

    public static int add(int n1, int n2) {
        return n1 + n2;
    }

    public static int subs(int n1, int n2) {
        return n1 - n2;
    }

    public static int mult(int n1, int n2) {
        return n1 * n2;
    }

    public static int askNumber() {
        System.out.println("Introduce un número:");
        int n = scanner.nextInt();
        scanner.nextLine();
        return n;
    }
}**/


