package org.ies.tierno.While;

import java.util.Scanner;

public class Ejer8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1 - Variables
        int sumaP = 0;      //suma positivos
        int cantidadP = 0;  //cantidad de num positivos
        int sumaN = 0;      //suma negativos
        int cantidadN = 0;  //cantidad de num negativos
        int cantidadC = 0;  //cantidad de ceros
        int i = 1;          //contador para los 10 números

        //otra manera "int sumaP = 0, cantidadP = 0;"
        //otra manera "int sumaN = 0, cantidadN = 0;"

        //2 - Bucle para pedir 10 números
        while (i <= 10) {
            System.out.print("Introduce número " + i + ": ");
            int num = scanner.nextInt();
            if (num > 0) {
                sumaP += num;
                cantidadP++;
            } else if (num < 0) {
                sumaN += num;
                cantidadN++;
            } else {
                cantidadC++;
            }
            i++;
        }

        //3 - Condición if, else if para mostrar medias
        if (cantidadP > 0) {
            System.out.println("Media de positivos: " + (double) sumaP / cantidadP);
        } else if (cantidadN > 0) {
            System.out.println("Media de negativos: " + (double) sumaN / cantidadN);
        }

        //4 - Resultado (cantidad ceros)
        System.out.println("Cantidad de ceros: " + cantidadC);
        scanner.close();
    }
}

//EJER8 CORREGIDO - SOLUCIÓN:
/*package org.example.whilexercices;

import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int zeros = 0;
        double sumPositives = 0;
        int positives = 0;
        double sumNegatives = 0;
        int negatives = 0;

        int i = 0;
        while (i <= 10) {
            System.out.println("Introduzca un número");
            int num = scanner.nextInt();
            scanner.nextLine();
            if (num == 0) {
                zeros++;
            } else if (num < 0) {
                sumNegatives = sumNegatives + num;
                negatives++;
            } else {
                sumPositives = sumPositives + num;
                positives++;
            }
            i++;
        }

        double positivesAverage = sumPositives / positives;
        double negativesAverage = sumNegatives / negatives;

        System.out.println("La media de los numeros positivos a sido " + positivesAverage + ", de los negativos " + negativesAverage + " y a habido " + zeros + " ceros");
    }
}*/