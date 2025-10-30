package org.example.UT04_INTRODUCCIÓN_PROGRAMACIÓN_ORIENTADA_OBJETOS.Instituto_OOP.model;

import java.util.Objects;

public class Student {
        //Campos clase Student
        private String name; //nombre
        private String surname; //apellido
        private String direction; //direccion

        //* alt + insert = constructor de codigo!!
        public Student() {
            // Constructor vacío
        }

        //Constructor Student (Es el manual de como se arma, como si fuera un LEGO)
        public Student(String name, String surname, String direction) {
            this.name = name;
            this.surname = surname;
            this.direction = direction;
        }

        // 4. Métodos Getters y Setters
        // Métodos Getter para obtener el valor del campo
        public String getName() {
            return name;
        }

        // Métodos Setter para establecer o modificar el valor del campo
        public void setName(String name) {
            this.name = name;
        }

        public String getApellidos() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public String getDirection() {
            return direction;
        }

        public void setDireccion(String direction) {
            this.direction = direction;
        }

        @Override
            public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return Objects.equals(name, student.name) && Objects.equals(surname, student.surname) && Objects.equals(direction, student.direction);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, surname, direction);
        }
}
