package org.ies.tierno.If;

import java.util.Scanner;

public class StringSizeCheck { //EJER4
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        // Pedir un String al usuario
        System.out.print("Introduce un texto de 8 caracteres: ");
        String texto = scanner.nextLine();
        // Comprobar la longitud del String
        if (texto.length() < 8) {
            System.out.println("Demasiado pequeño");
        } else if (texto.length() > 8) {
            System.out.println("Demasiado grande");
        } else {
            System.out.println("Es valido");
        }
        // Cerrar el scanner
        scanner.close();
    }
}



//EJER4 CORREGIDO - SOLUCIÓN:
//package org.example.ifexercises;
//
//import java.util.Scanner;
//
//public class StringSizeCheck {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Introduzca una contraseña de 8 digitos");
//        String password = scanner.nextLine();
//
//        if (password.length() < 8) {
//            System.out.println("Demasiado pequeño");
//        } else if (password.length() > 8) {
//            System.out.println("Demasiado grande");
//        } else {
//            System.out.println("Es valida");
//        }
//    }
//}