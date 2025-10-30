package org.example.UT04_INTRODUCCIÓN_PROGRAMACIÓN_ORIENTADA_OBJETOS.Instituto_OOP.model;

import java.util.Objects;

public class Highschool {
    private String name;

    public Highschool(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Highschool that = (Highschool) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
