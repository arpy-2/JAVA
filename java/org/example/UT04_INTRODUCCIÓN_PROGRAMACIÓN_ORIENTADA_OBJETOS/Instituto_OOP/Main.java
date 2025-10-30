package org.example.UT04_INTRODUCCIÓN_PROGRAMACIÓN_ORIENTADA_OBJETOS.Instituto_OOP;

import org.example.UT04_INTRODUCCIÓN_PROGRAMACIÓN_ORIENTADA_OBJETOS.Instituto_OOP.model.Student;

public class Main {
    // El metodo 'main' es esencial; el programa Java comienza aquí.
    public static void main(String[] args) {
        // Instancia el objeto usando el constructor con argumentos
        Student person1 = new Student("Ana", "Gómez Salas", "Calle del Sol, 5");

        //Instancia el objeto usando el constructor vacío
        Student persona2 = new Student();
        // Asignar valores usando los métodos setters
        persona2.setName("Roberto");
        persona2.setSurname("Fernández Cano");
        persona2.setDireccion("Avenida Luna, 18");

        // 4. Mostrar los datos de forma individual usando los Getters
        System.out.println("Nombre completo: " + persona2.getName() + " " + persona2.getApellidos());
        // Modificamos un campo
        persona2.setDireccion("Paseo Marítimo, 101");
        System.out.println("Nueva Dirección: " + persona2.getDirection());
    }
}

