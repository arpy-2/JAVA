package org.example.UT03_MÉTODOS_ARRAYS.arrays;

import java.util.Scanner;

public class Ejer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuántos nombres quieres introducir?");
        int cantidad = sc.nextInt();
        sc.nextLine();

        //array string para introducir texto
        String[] nombres = new String[cantidad];

        //array con los nombres
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Introduce el nombre " + (i+1) + ": ");
            nombres[i] = sc.nextLine();
            System.out.println(nombres[i]);
        }
    }
}

//EJER4 CORREGIDO - SOLUCIÓN:
/*package org.ies.tierno.arrays;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length;
        do {
            System.out.println("¿Cuántos nombres vas a introducir?");
            length = scanner.nextInt();
            scanner.nextLine();
            if (length < 1) {
                System.out.println("Debe ser mayor que cero");
            }
        } while (length < 1);


        String[] names = new String[length];
        for (int i = 0; i < names.length; i++) {
            System.out.println("Introduce un nombre: ");
            String name = scanner.nextLine();
            names[i] = name;
        }

        System.out.println("Nombres:");
        for (String name: names) {
            System.out.println(name);
        }
    }
}**/
