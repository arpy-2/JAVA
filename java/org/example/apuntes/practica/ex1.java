package org.example.apuntes.practica;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introducca el primer numero: ");
        double num1  = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Introducca el segundo numero: ");
        double num2 = scanner.nextDouble();
        scanner.nextLine();

        if  (num1 > num2) { //primera condición if {}
            System.out.println("El primer numero es mayor");
        }
        else if (num1 == num2) { //Para usar en caso de tener 3 opciones else if {}
            System.out.println("Los dos numeros son iguales");
        }
        else { //final de la condición o última opción else {}
            System.out.println("El segundo numero es menor");
        }
        scanner.close();
    }
}
