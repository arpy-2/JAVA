package org.ies.tierno.Arrays;

public class Ejer1 {
    public static void main(String[] args) {
        // Creamos un array de enteros (int) con los valores que indica (4, 8, 9 y 1)
        int[] numeros = {4, 8, 9, 1}; //Tiene que ser siempre en plural - numero(s)!!

        //Este bucle "for (int i = 0; i < 0; i++)" Recorre el array y mostra cada valor
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]); //muestra el número
        }
    }
}

//EJER1 CORREGIDO - SOLUCIÓN:
/*package org.ies.tierno.arrays;

public class Ej1 {
    public static void main(String[] args) {
        int[] numbers = {4, 8, 9, 1};

        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}**/

