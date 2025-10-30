package org.example.apuntes.repaso;

import java.util.Scanner;

public class repaso {
    public static void main(String[] args) {

       int  LiteralNUmber = 2; //variable
       Scanner scanner = new Scanner(System.in);

       //EJEMPLO 1:
       /* int number = scanner.nextInt(); // DOUBLE -> double number = scanner.nextDouble();
       scanner.nextLine();

       if (number > 0) {
            System.out.println("Es positivo");
       } else if (number == 0) {
           System.out.println("Es cero");
       } else {
           System.out.println("Es negativo");
       } */

       /*////////////////////////////////////////////////////////////////////////////////////*/

       //EJEMPLO 2:
       /* System.out.println("Introduce número entero: ");
        int number1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Introduce otro número entero:");
        int number2 = scanner.nextInt();
        scanner.nextLine();

        if (number1 > number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        for (int i = number1; 1 <= number2; i++) {
            System.out.println(i);
        } */

        /*/////////////////////////////////////////////////////////////////////////////////////*/

        //EJEMPLO 3:
        /* System.out.println("Introduce número entero: ");
        int number1 = scanner.nextInt();
        scanner.nextLine();
        int fact = 0;

        for (int i = 1; i <= number1; i++) {
            // i = 1; fact = 0 -> fact = 1 + 1 = 1    (1ºinterraccion)
            // i = 2; fact = 1 -> fact = 1 + 2 = 2    (2ºinterraccion)
            // i = 3; fact = 2 -> fact = 2 + 3 = 6    (3ºinterraccion)
            // i = 4; fact = 6 -> fact = 3 + 6 = 24   (4ºinterraccion)
            // = 1 * 2 * 3 * 4...
            fact = fact + i;
        } */
        scanner.close();
    }
}