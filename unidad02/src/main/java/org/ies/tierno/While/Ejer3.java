package org.ies.tierno.While;

import java.util.Scanner;

public class Ejer3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Pregunta1
        System.out.println("Introduce numero: ");
        int num1 = scanner.nextInt();
        scanner.nextLine();
        //Pregunta2
        System.out.println("¿Quieres seguir?");
        //variable de respuesta user
        String respuesta = "S"; // Limpiar el buffer después de nextInt()
        scanner.nextLine();

        while (respuesta.equalsIgnoreCase("s")) {
            System.out.print("Introduce número: ");
            int numero = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer
            System.out.print("¿Quieres seguir? "); //(S/s)
            respuesta = scanner.nextLine();
        }
        scanner.close();
    }
}

//EJER3 CORREGIDO - SOLUCIÓN:
/*package org.example.whilexercices;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        var askNumber = true;

        while(askNumber){
            System.out.print("Introduzca un número: ");
            var num = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("¿Desea continuar? ");
            var response = scanner.nextLine();

            askNumber = response.equalsIgnoreCase("S");
        }
    }
}*/