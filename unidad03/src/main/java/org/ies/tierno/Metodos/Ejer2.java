package org.ies.tierno.Metodos;

import java.util.Scanner;

public class Ejer2 {

    public static Scanner sc = new Scanner(System.in);

    //Metodo que calcula la multiplicación de dos enteros y devuelve el resultado
    public static int multi(int numero1, int numero2) {
        int result = numero1 * numero2;
        return result;
    }

    //Metodo que imprime el resultado recibido
    public static void Resul(int valor) {
        System.out.println("El resultado es: " + valor);
    }

    //Metodo principal
    public static void main(String[] args) {
        //Pedir dos números al usuario
        System.out.print("Introduce el primer número: ");
        int a = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        int b = sc.nextInt();
        //Invocar el metodo multiplicar
        int producto = multi(a, b);
        //Invocar el metodo mostrar Resul con el result
        Resul(producto);
    }

}

//EJER2 CORREGIDO - SOLUCIÓN:
/*package org.ies.tierno;

import java.util.Scanner;

public class Ej2 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n1 = askNumber();
        int n2 = askNumber();
        int res = multiply(n1, n2);
        print(res);
    }

    public static int askNumber() {
        System.out.println("Introduce un número entero");
        int n = scanner.nextInt();
        scanner.nextLine();
        return n;
    }

    public static int multiply(int n1, int n2) {
        return n1 * n2;
    }

    public static void print(int res) {
        System.out.println("El resultado es: " + res);
    }
}**/