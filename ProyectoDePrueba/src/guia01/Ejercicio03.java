package guia01;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una frase");
        String frase = leer.next();
        System.out.println("Frase en mayuscula: " + frase.toUpperCase());
        System.out.println("Frase en minuscula> " + frase.toLowerCase());
    }
    
}
