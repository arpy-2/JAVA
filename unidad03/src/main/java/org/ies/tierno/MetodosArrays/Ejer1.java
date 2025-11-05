package org.ies.tierno.MetodosArrays;

public class Ejer1 {
    // Metodo 1: Busca el máximo
    public static int max(int[] numeros) {
        int max = numeros[0]; // Empezamos suponiendo que el primero es el mayor
        for (int numero : numeros) { //Los ":" significan “recorrer” o “para cada uno en”
            if (numero > max) {
                max = numero; // Si encontramos uno más grande, lo guardamos
            }
        }
        return max; // Devolvemos el número más grande
    }
    // Metodo 2: Muestra el número recibido por la variable numero
    public static void printMax(int numero) {
        System.out.println("El máximo es: " + numero);
    }

    //Metodo principal: empieza el programa desde el metodo max y dura se ejecutan las ordenes hasta printMax
    public static void main(String[] args) {
        int[] numeros = {1, 3, 5, 0}; // Creamos un array de números
        int max = max(numeros); // Usamos el primer metodo
        printMax(max); // Usamos el segundo metodo
    }
}

//EJER1 CORREGIDO - SOLUCIÓN:
/*package org.ies.tierno.mehtodsarrays;

public class Ej1 {
    public static int max(int[] numbers) {
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static void printMax(int max) {
        System.out.println("El máximo es " + max);
    }

    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 0};
        int max = max(numbers);
        printMax(max);
    }
}**/
