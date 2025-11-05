package org.ies.tierno.Switch;

import java.util.Scanner;

public class Ejer3 { //SOLUCIÓN EJER3:
        public static void main(String[] args) {
            Scanner scanner=new Scanner(
                    System.in
            );
            System.out.println("Dime una palabra de 8 caracteres");
            String word=scanner.nextLine();
            switch (word.length()){
                case 8:
                    System.out.println("Es valido");
                    break;
                default:
                    System.out.println("No valido");
                    break;
            }
        }
}

//EJER3 CORREGIDO - SOLUCIÓN:
/*package org.example.switchexercices;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(
                System.in
        );
        System.out.println("Dime una palabra de 8 caracteres");
        String word=scanner.nextLine();
        switch (word.length()){
            case 8:
                System.out.println("Es valido");
                break;
            default:
                System.out.println("No valido");
                break;
        }
    }
}*/