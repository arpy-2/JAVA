package org.example.UT02_ESTRUCTURAS_CONTROL.whileexer;
//Añadir el import con random y scanner para que funcione
import java.util.Random;
import java.util.Scanner;

public class Ejer5 {
    public static void main(String[] args) {
        //part1 - Inicio Scanner y Random
        Scanner scanner = new Scanner(System.in);
        Random r = new Random(); //generar números aleatorios.

        //part2 - Generar Número Secreto y Variable de Intento
        int secret = r.nextInt(100); // Genera un numero aleatorio del 0 al 10
        int intento = -1; //valor -1 indica que aún no ha intentado (ejemplo: "-1 != 42" no es igual (!=))

        //part3 - Bucle Principal (While = Repetir Intentos)
        while (intento != secret) { //while bucle que sifnifica mientras tal cosa...
            System.out.println("Adivina el número: ");
            intento = scanner.nextInt();
            scanner.nextLine();

            //part4 - Resultado que va dando depende del numero (If-Else)
            if (intento < secret) { //menor primero (inversa a lo que ponemos)
                System.out.println("mayor");
            } else if (intento > secret) { //mayor primero (inversa)
                System.out.println("menor");
            } else { // "==" (igual)
                System.out.println("Exacto!");
            }
        }
        scanner.close(); //Cierra Scanner (esencial para aplicaciones más grandes)
    }
}

//EJER5 CORREGIDO - SOLUCIÓN:
/*package org.example.whilexercices;

import java.util.Random;
import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Random r = new Random();
        int secret = r.nextInt(100);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adivina un número del 0 al 99");
        int guess = -1;
        while (guess != secret) {
            System.out.println("Introduce un número");
            guess = scanner.nextInt();
            scanner.nextLine();

            if (guess > secret) {
                System.out.println("Es menor");
            } else if (guess < secret) {
                System.out.println("es mayor");
            } else {
                System.out.println("¡¡¡Acertaste!!!");
            }
        }
    }
}*/

