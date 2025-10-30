package org.example.UT03_MÉTODOS_ARRAYS.metodos_arrays;

import java.util.Scanner;

public class Ejer4 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array1 = pedirNum();
        int[] inverse1 = inverseNum(array1);
        printNum(inverse1);

        int[] array2 = pedirNum();
        int[] inverse2 = inverseNum(array2);
        printNum(inverse2);

        int[] together = togetherArrays(inverse1, inverse2);
        printNum(together);
    }

    // Pide user numbers
    public static int[] pedirNum() {
        System.out.print("Cuantos numeros quieres introducir? ");
        int number1 = scanner.nextInt();
        scanner.nextLine();
        //buble que devuelve el array
        int[] numbers = new int[number1];
        for (int i = 0; i < number1; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return numbers;
    }

    // Invierte un array
    public static int[] inverseNum(int[] array) {
        int number2 = array.length;
        int[] inverse = new int[number2];
        for (int i = 0; i < number2; i++) {
            inverse[i] = array[number2 - 1 - i];
        }
        return inverse;
    }

    // Une dos arrays
    public static int[] togetherArrays(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            result[a.length + i] = b[i];
        }
        return result;
    }

    // Imprime un array
    public static void printNum(int[] array) {
        System.out.print("Resultado union: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

//EJER4 CORREGIDO - SOLUCIÓN:
/*package org.ies.tierno.mehtodsarrays;

import java.util.Scanner;

public class Ej4 {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numbers1 = askNumbers();
        int[] numbers1Reverse = reverse(numbers1);
        print(numbers1Reverse);

        int[] numbers2 = askNumbers();
        int[] numbers2Reverse = reverse(numbers2);
        print(numbers2Reverse);

        int[] union = union(numbers1Reverse, numbers2Reverse);
        print(union);
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
            System.out.println("Introduce un número:");
            numbers[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return numbers;
    }

    private static int[] reverse(int[] numbers) {
        int[] reversed = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            // j = len - 1 -i
            int j = numbers.length - 1 - i;
            reversed[j] = numbers[i];
        }
        return reversed;
    }

    public static int[] union(int[] numbers1, int[] numbers2) {
        int[] union = new int[numbers1.length + numbers2.length];
        for (int i = 0; i < numbers1.length; i++) {
            union[i] = numbers1[i];
        }
        for (int i = 0; i < numbers2.length; i++) {
            union[i + numbers1.length] = numbers2[i];
        }
        return union;
    }

    private static void print(int[] numbers) {
        for (var number: numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}**/

