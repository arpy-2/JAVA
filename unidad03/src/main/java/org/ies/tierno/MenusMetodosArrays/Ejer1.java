package org.ies.tierno.MenusMetodosArrays;

import java.util.Scanner;

public class Ejer1 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int option;
        do {
            System.out.println("*MENÚ");
            System.out.println("1. Máximo");
            System.out.println("2. Mínimo");
            System.out.println("3. Calculo Media");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    optionMax();
                    break;
                case 2:
                    optionMin();
                    break;
                case 3:
                    optionMedia();
                    break;
                case 4:
                    System.out.print("Bye");
                    break;
            }
        } while (option != 4);
    }

    //Metodo max numbers
    public static void optionMax() {
        System.out.print("¿Cuántos números vas a introducir? ");
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            scanner.nextLine();
        }
        int maximo = numbers[0];
        for (int i = 1; i < n; i++) {
            if (numbers[i] > maximo) {
                maximo = numbers[i];
            }
        }
        System.out.println("El número máximo es: " + maximo);
    }
    //Metodo min numbers
    public static void optionMin() {
        System.out.print("¿Cuántos números vas a introducir? ");
        int numbers2 = scanner.nextInt();
        scanner.nextLine();
        int[] numeros = new int[numbers2];
        for (int i = 0; i < numbers2; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            scanner.nextLine();
        }
        int minimo = numeros[0];
        for (int i = 1; i < numbers2; i++) {
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }
        System.out.println("El número mínimo es: " + minimo);
    }
    //Metodo media numbers
    public static void optionMedia() {
        System.out.print("¿Cuántos números vas a introducir? ");
        int numbers3 = scanner.nextInt();
        scanner.nextLine();
        int[] numeros = new int[numbers3];
        for (int i = 0; i < numbers3; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            scanner.nextLine();
        }
        int suma = 0;
        for (int i = 0; i < numbers3; i++) {
            suma += numeros[i];
    }
        double media = (double) suma / numbers3;
        System.out.println("La media es: " + media);
    }
}

//EJER1 CORREGIDO - SOLUCIÓN:
/*package org.ies.tierno.menuarrays;

import java.util.Scanner;

public class Ej1 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int option;
        do {
            option = chooseOption();
            if (option == 1) {
                runOpt1();
            } else if (option == 2) {
                runOpt2();
            } else if (option == 3) {
                runOpt3();
            }
        } while (option != 4);
    }

    private static int chooseOption() {
        int option;
        System.out.println("Elige una opción: ");
        System.out.println("1. Maximo");
        System.out.println("2. Mínimo");
        System.out.println("3. Media");
        System.out.println("4. Salir");
        option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }

    public static void runOpt1() {
        int[] numbers = askNumbersArrays();
        int max = max(numbers);
        System.out.println("El max es: " + max);
    }

    public static void runOpt2() {
        int[] numbers = askNumbersArrays();
        int min = min(numbers);
        System.out.println("El min es: " + min);
    }

    public static void runOpt3() {
        int[] numbers = askNumbersArrays();
        double media = media(numbers);
        System.out.println("La media es: " + media);
    }

    public static int askSize() {
        System.out.println("Introduzca el tamaño del array: ");
        int size = scanner.nextInt();
        scanner.nextLine();
        while (size < 0) {
            System.out.println("El array debe ser positivo.");
            size = scanner.nextInt();
            scanner.nextLine();
        }
        return size;
    }

    public static int[] askNumbersArrays() {
        int size = askSize();
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Introduce el " + (i + 1) + "número");
            numbers[i] = scanner.nextInt();
            scanner.nextLine();

        }
        return numbers;
    }

    public static int max(int[] numbers) {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static int min(int[] numbers) {
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    public static double media(int[] numbers) {
        double suma = 0;
        for (int number : numbers) {
            suma += number;
        }
        return suma / numbers.length;
    }
}**/
