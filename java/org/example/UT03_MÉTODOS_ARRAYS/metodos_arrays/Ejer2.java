package org.example.UT03_MÉTODOS_ARRAYS.metodos_arrays;

public class Ejer2 {
    //Metodo que ejecuta los métodos anteriores
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 0}; //Creamos el array
        int result = suma(numbers); //guarda los numeros de suma y los devuelve en resultado
        printSuma(result); //print = imprime (para resultado final)
    }

    //Metodo que calcula la suma del array
    public static int suma(int[] numeros) {
        int result = 0;
        for (int numero : numeros) { //recorre
            result += numero;
        }
        return result; // Devolvemos la suma total
    }

    //Metodo que muestra el resultado recibido
    public static void printSuma(int resultado) {
        System.out.println("La suma es: " + resultado);
    }
}

//EJER2 CORREGIDO - SOLUCIÓN:
/*package org.ies.tierno.mehtodsarrays;

public class Ej2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        int sum = sum(numbers);
        print(sum);
    }

    public static int sum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static void print(int sum) {
        System.out.println("La suma es: " + sum);
    }
}**/