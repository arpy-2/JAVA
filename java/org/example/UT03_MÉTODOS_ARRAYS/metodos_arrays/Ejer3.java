package org.example.UT03_MÉTODOS_ARRAYS.metodos_arrays;

import java.util.Scanner;

public class Ejer3 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] numbers = Array();
        double media = calculoMedia(numbers);
        Media(media);
    }

    // Metodo que pide num
    public static int pedirNum1() {
        int num = -1;
        while (num < 0) {
            System.out.print("Introduce un número entero positivo: ");
            num = sc.nextInt();
        }
        return num;
    }

    // Metodo array
    public static int[] Array() {
        int tamaño = pedirNum1();
        int[] numbers = new int[tamaño];

        for (int i = 0; i < tamaño; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        return numbers;
    }

    // Metodo calculo media
    public static double calculoMedia(int[] numbers2) {
        int suma = 0;
        for (int num : numbers2) {
            suma += num;
        }
        return (double) suma / numbers2.length;
    }

    // Metodo muestra la media
    public static void Media(double media) {
        System.out.println("La media es: " + media);
    }
}

//EJER3 CORREGIDO - SOLUCIÓN:
/*package org.ies.tierno.mehtodsarrays;

import java.util.Scanner;

public class Ej3 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numbers = askNumbers();
        double average = average(numbers);
        messageAverage(average);
    }

    public static int askSize() {
        System.out.println("Por favor introduce el tamaño del array");
        int size = scanner.nextInt();
        scanner.nextLine();
        while (size < 0) {
            System.out.println("El numero ha de ser POSTIVO");
            size = scanner.nextInt();
            scanner.nextLine();
        }
        return size;
    }

    public static int[] askNumbers() {
        int size = askSize();
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Introduce el " + (i + 1) + "º numero");
            numbers[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return numbers;
    }

    public static double average(int[] numbers) {
        double sum = 0;
        for (int number : numbers) {
            sum = sum + number;
        }
        return sum / numbers.length;
    }

    public static void messageAverage(double average) {
        System.out.println("La media es: " + average);
    }
}**/
