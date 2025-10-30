package org.example.apuntes.practica;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Llamamos al scanner

        System.out.println("Introduce una nota");
        int nota = scanner.nextInt();
        scanner.nextLine(); //cerramos scanner o línea de texto)

        System.out.println("Introduce una edad:");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Introduce un sexo: ");
        String sexo = scanner.nextLine();

        //Condiciones usadas despues del primer if {} serían if {} y else if {}, luego de eso cerramos con else {}
        if (nota >=5 && edad >= 18) { // && = AND
            if(sexo.equals("M")){
                System.out.println("POSIBLE");
            }
            else if(sexo.equals("F")){
                System.out.println("ACEPTADA");
            }
            else { //Extra que no pide el ejer, por si acaso el usuario no introduce ninguno de los valores indicados
                System.out.println("No válido");
            }
        }
        else {
            System.out.println("NO ACEPTADA");
        }
    }
}
