package org.example.apuntes.repaso.practica_switch;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número (Del 1 al 7): ");
        int numero = sc.nextInt();
        sc.nextLine();

        switch (numero) { //Devolver un valor
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default: System.out.println("Número invalido, por favor introduzca otro (1 al 7)");
        }
        System.out.println("Díme del día de la semana: " + numero);
        sc.close();
    }
}
