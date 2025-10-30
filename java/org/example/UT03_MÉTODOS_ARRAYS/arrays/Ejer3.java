package org.example.UT03_MÉTODOS_ARRAYS.arrays;

public class Ejer3 {
    public static void main(String[] args) {

        int[] numeros = {4, 8, 9, 1};
        int sum = 0;

        for (int numero : numeros) {
            sum += numero;
        }
        System.out.println("La suma es: " + sum);
    }
}

//EJER3 CORREGIDO - SOLUCIÓN:
/*package org.ies.tierno.arrays;

public class Ej3 {
    public static void main(String[] args) {
        int[] numbers = {4, 8, 9, 1};
        int sum = 0;
        for (int number : numbers) {
            // sum = sum + number;
            sum += number;
        }
        System.out.println(sum);
    }
}**/
