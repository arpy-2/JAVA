package org.example.apuntes.repaso.devolver_return;

public class exemplereturn {
    public static int obtenerNumero() { //Metodo que devuelve el número 7 usando "return 7;"
        return 7;
    }

    public static void main(String[] args) { //main es para llamar al metodo
        int resultado = obtenerNumero(); //guardamos el resultado en esta variable
        System.out.println("El número es: " + resultado); //muestra resultado
    }
}


// Tipo de retorno	   |   Ejemplo de declaración
/* _________________________________________________
    int                |   public int sumar(...)        --> int devuelve número entero
    String	           |   public String saludar()      --> string devuelve cadena de carácteres (palabras, frases, etc.)
    boolean	           |   public boolean esPar(int n)  --> boolean devuelve una respuesta lógica: true o false
    void (sin retorno) |   public void mostrar()        --> void no devuelve ningun valor (Es como decir: “Este metodo hace algo, pero no entrega nada de vuelta”.)
____________________________________________________ **/