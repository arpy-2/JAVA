package org.example.apuntes.repaso;

import java.util.Scanner;

public class ejerfor {
    //EJER1 PRÁCTICA FOR
    /**public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Parte1: pide un num entero
        System.out.println("Introduce un número: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        //Parte2: pide al user un mensaje
        System.out.println("Escribe un mensaje: ");
        String menssage = scanner.nextLine();
        scanner.nextLine();

        //Parte3: saca el mensaje en pantalla
        for (int i = 0; i < num; i++){
            System.out.println(num);
        }
    }*/

    //EJER2 - PRÁCTICA
    /** public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Parte1: pide dos enteros
        //primeras variables
        System.out.println("Introduce el primer numero: ");
        int num1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduce el segundo numero: ");
        int num2 = sc.nextInt();
        sc.nextLine();

        //segundas variables
        int mayor;
        int menor;

        //Parte2: si los argumentos son o y 100 imprimirá del 0 al 100
        //condicion 2 - if, else if, else
        if (num1 > num2) {
            mayor = num1;
            menor = num2;
        } else {
            mayor = num2;
            menor = num1;
        }

        //condicion 2 (bucle) - for
        for (int i = menor; i <= mayor; i++) {
            System.out.println(i);
        }
    }*/

    //EJER3 - PRACTICA
   /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Parte1 - pide entero
        System.out.println("Introduce un numero: ");
        int num = sc.nextInt();
        sc.nextLine();

        int result = 1;

        //Parte2 - calcule la multiplicacion
        for (int i = 1; i <= num; i++) {
            result = result * i;
        }
        System.out.println("resultado: " + result);
    }**/
}
