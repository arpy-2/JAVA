package org.example.UT02_ESTRUCTURAS_CONTROL.Switch;

import java.util.Scanner;

public class Ejer2 { //SOLUCIÓN EJER2: Continuo al Ifexercise-Ejer6-Calculator
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Si quieres sumar pon + y si quieres restar pon -");
        String ope = sc.nextLine();
        switch (ope) {
            case "+" :
                System.out.println("Dime un número");
                double n1 = sc.nextDouble();
                sc.nextLine();
                System.out.println("Dame otro número");
                double n2 = sc.nextDouble();
                sc.nextLine();
                double sum = n1 + n2;
                System.out.println("Su suma es " + sum);
                break;
            case "-":
                System.out.println("Dame un número");
                int num1 = sc.nextInt();
                sc.nextLine();
                System.out.println("Dame otro maás");
                int num2 = sc.nextInt();
                sc.nextLine();
                int subs = num1 - num2;
                System.out.println("El resultado es " + subs);
                break;
            default:
                System.out.println("Operación inválida");
        }

    }
}

//EJER2 CORREGIDO - SOLUCIÓN:
/*package org.example.switchexercices;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Si quieres sumar pon + y si quieres restar pon -");
        String ope = sc.nextLine();
        switch (ope) {
            case "+" :
                System.out.println("Dime un número");
                double n1 = sc.nextDouble();
                sc.nextLine();
                System.out.println("Dame otro número");
                double n2 = sc.nextDouble();
                sc.nextLine();
                double sum = n1 + n2;
                System.out.println("Su suma es " + sum);
                break;
            case "-":
                System.out.println("Dame un número");
                int num1 = sc.nextInt();
                sc.nextLine();
                System.out.println("Dame otro maás");
                int num2 = sc.nextInt();
                sc.nextLine();
                int subs = num1 - num2;
                System.out.println("El resultado es " + subs);
                break;
            default:
                System.out.println("Operación inválida");
        }

    }
}*/