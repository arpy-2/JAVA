package org.example.UT03_MÉTODOS_ARRAYS.arrays;

public class Ejer2 {
    public static void main(String[] args) {
        //array
        double[] numeros = {3.4, 5.2, 4.7};
        //variable para el ultimo numero del array
        double ultimo = numeros[numeros.length - 1]; //"numeros.length" la cantidad de elementos que hay en el array

        for (int i = 0; i < numeros.length; i++) {
            if (i == numeros.length - 1){ //accede al 4.7
                System.out.println("El último valor es: " + numeros[i]); //accede al ultimo numero del array
            }
        }
    }
}

//EJER2 CORREGIDO - SOLUCIÓN:
/* package org.ies.tierno.arrays;

public class Ej2 {
    public static void main(String[] args) {
        double[] nums = new double[4];
        nums[0] = 3.4;
        nums[1] = 5.2;
        nums[2] = 4.7;

        int lastI = nums.length - 1;
        System.out.println(nums[lastI]);
    }
}**/
