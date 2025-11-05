package org.ies.tierno.Metodos;

import java.util.Scanner;

public class Ejer1 {
    //Método que suma dos números enteros y devuelve el resultado
   public static int sumar(int numero1, int numero2) {
       int resultado = numero1 + numero2;
       return resultado;
   }

   //Método que muestra el resultado recibido
   public static void mostrarResultado(int valor) {
       System.out.println("El resultado es: " + valor);
   }

   //Método principal
   public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);

       //Pedir dos números al usuario
       System.out.print("Introduce el primer número: ");
       int a = entrada.nextInt();

       System.out.print("Introduce el segundo número: ");
       int b = entrada.nextInt();

       //Invocar el método sumar
       int suma = sumar(a, b);

       //Invocar el método mostrarResultado con el resultado
       mostrarResultado(suma);
   }
}

//EJER1 CORREGIDO - SOLUCIÓN:
/*package org.ies.tierno;

import java.util.Scanner;

public class Ej1 {
    //Llamamos al scanner
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n1 = askNumber();
        int n2 = askNumber();
        int res = addition(n1, n2);
        print(res);
    }

    public static int askNumber() {
        System.out.println("Introduce un número entero");
        int n = scanner.nextInt();
        scanner.nextLine();
        return n;
    }

    public static int addition(int n1, int n2) {
        int res = n1 + n2;
        return res;
    }

    public static void print(int res) {
        System.out.println("El resultado es: " + res);
    }
}**/

