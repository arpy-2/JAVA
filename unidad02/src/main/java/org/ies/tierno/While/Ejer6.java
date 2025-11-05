package org.ies.tierno.While;

import java.util.Scanner;

public class Ejer6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidad = 0; //empieza en 0

        // Pedir cantidad hasta que sea >= 1
        while (cantidad < 1) {
            System.out.print("¿Cuántos números vas a introducir? ");
            cantidad = scanner.nextInt();
            scanner.nextLine();
        }

        double suma = 0.0; //variable números con decimales (3.5) y los int no tienen decimales
        //Bucle que repite un número fijo | Pedir los números y sumarlos
        for (int i = 1; i <= cantidad; i++) {  //"i++" suma 1 a i (i=1 → i=2 → i=3 → ...), contador
            System.out.print("Introduce número " + i + ": ");
            int numero = scanner.nextInt(); //Lee el numero y lo guarda
            scanner.nextLine();
            suma += numero; //agrega el numero a la suma
        }

        // Calcular y mostrar la media
        double media = suma / cantidad;
        System.out.println("La media es: " + media);
        scanner.close();
    }
}

//EJER6 CORREGIDO - SOLUCIÓN:
/*package org.example.whilexercices;

import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int amount = 0;
        while (amount < 1) {
            System.out.println("Introduce la cantidad de números (mayor que cero)");
            amount = scanner.nextInt();
            scanner.nextLine();
        }

        double sum = 0;
        int i = 0;
        while (i < amount) {
            System.out.println("Introduce un número");
            int num = scanner.nextInt();
            scanner.nextLine();
            sum = sum + num;
            i++;
        }

        double average = sum / amount;

        System.out.println("La media es " + average);
    }
}*/