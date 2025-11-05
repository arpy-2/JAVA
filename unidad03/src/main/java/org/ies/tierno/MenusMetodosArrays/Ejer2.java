package org.ies.tierno.MenusMetodosArrays;

import java.util.Scanner;

public class Ejer2 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int option;
        do {
            System.out.println("1. Suma");
            System.out.println("2. Duplicar");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    optionSuma();
                    break;
                case 2:
                    optionDuplicar();
                    break;
                case 3:
                    System.out.print("Bye");
                    break;
            }
        } while (option != 4);
    }

    //METODO 1 - Suma
    public static void optionSuma() {
        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();
        scanner.nextLine();
        int suma = num1 + num2;
        System.out.println("La suma es: " + suma);
    }

    //METODO 2 - Duplicar Array
    public static void optionDuplicar() {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] numDuplicado = new int[numbers.length * 2];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numDuplicado[i];
            numDuplicado[i + numbers.length] = numDuplicado[i];
        }
        System.out.print("Array duplicado: ");
        for (int num : numDuplicado) { //recorre
            System.out.print(num + " ");
        }
    }
}

//EJER2 CORREGIDO - SOLUCIÓN:
/*package org.ies.tierno.menuarrays;

import java.util.Scanner;

public class Ej2 {
    private final static Scanner scanner = new Scanner(System.in);

    public static void menu() {
        int option;
        do {
            option = chooseOption();
            if (option == 1) {
                runOpt1();
            } else if (option == 2) {
                runOpt2();
            } else if (option == 3) {
                System.out.println("Saliendo...");
            } else {
                System.out.println("Opción inválida");
            }
        } while (option != 3);
    }

    private static void runOpt2() {
        var numbers = askNumbers();
        var result = multiply(numbers);
        printNumbers(result);
    }

    private static void printNumbers(int[] numbers) {
        for (var number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    private static int[] multiply(int[] numbers) {
        int[] result = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            result[i] = numbers[i] * 2;
        }
        return result;
    }

    private static void runOpt1() {
        int[] numbers = askNumbers();
        int sum = sum(numbers);
        System.out.println("La suma es " + sum);
    }

    private static int sum(int[] numbers) {
        int sum = 0;
        for (var number : numbers) {
            // Es lo mismo que sum = sum + number;
            sum += number;
        }
        return sum;
    }

    private static int askSize() {
        int size;
        do {
            System.out.println("Introduce el tamaño del array");
            size = scanner.nextInt();
            scanner.nextLine();
            if (size < 1) {
                System.out.println("El tamaño debe ser mayor que cero");
            }
        } while (size < 1);
        return size;
    }

    private static int[] askNumbers() {
        int size = askSize();
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Introduce un número");
            numbers[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return numbers;
    }

    private static int chooseOption() {
        int option;
        System.out.println("Elige una opción:");
        System.out.println("1. Sumar array");
        System.out.println("2. Multiplicar array por dos");
        System.out.println("3. Salir");
        option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }
}**/
