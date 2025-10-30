package org.example;

public class HelloWord {
    public static void main(String[] args){
            String text = "Hola mundo, qué tal";
            System.out.println(text);
            //Muestra por pantalla Hola Mundo
            //System.out.println("Hola mundo, qué tal");
            //Muestra por pantalla adiós
            System.out.println("Adiós");

            int myNumber = 4;
            System.out.println(myNumber);
            myNumber = 5;
            System.out.println(myNumber);

            // double myDouble = 3.4455;
            // double myOtherDouble = 3.4455;
            // double my_other_double = 3.4455;

            double myNUmber = 1000000000000000.000000000000000001d;
            double otherNumber = 1000000000000000000d;
            double res = myNumber - otherNumber;
            System.out.println(res);

            boolean myBoolean = true;
            String myName = "Ari";

            int n1 = 3;
            double n2 = 2;
            //comparación
            //n1 == n2


            //Cambia el valor de n1 por el que tiene n2, osea n1 = n2 (asignación, no ecuación!!)
            // n1 = n2
            //boolean inNotEqual = n1 != n2;
            //System.out.println(isNotEqual);

            n1 = n1 + 1000;
            n1++;
            n1--;
            n1 = -n1;
            System.out.println(n1);




    }
}