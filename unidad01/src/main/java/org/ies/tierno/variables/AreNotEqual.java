package org.ies.tierno.variables;

import java.util.Scanner;

public class AreNotEqual { //EJER5
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        // Pedir el primer número entero
        System.out.print("Introduce el primer número entero (number1): ");
        int number1 = scanner.nextInt();
        // Pedir el segundo número entero
        System.out.print("Introduce el segundo número entero (number2): ");
        int number2 = scanner.nextInt();
        // Comparar si no son iguales y mostrar true o false
        boolean resultado = (number1 != number2);
        System.out.println(resultado);
        // Cerrar el scanner
        scanner.close();
    }
}


//EJER5 CORREGIDO - SOLUCIÓN:
//package org.example.variablexercise;
//
//import java.util.Scanner;
//public class NotEquals {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Introduce un número: ");
//        int n1 = sc.nextInt();
//        sc.nextLine();
//        System.out.print("Introduce otro número: ");
//        int n2 = sc.nextInt();
//        boolean notEquals = n1 != n2;
//        System.out.println("¿Es tu número diferente? " + notEquals);
//    }
//}
