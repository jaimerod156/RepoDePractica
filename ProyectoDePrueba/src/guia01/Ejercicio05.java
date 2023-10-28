
package guia01;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrse un numero: ");
        int num = leer.nextInt();
        
        int doble = num * 2;
        System.out.println("El doble de " + num +  ": " + doble);
        int triple = num * 3;
        System.out.println("E triple de " + num + ": " + triple);
        double raiz = Math.sqrt(num);
        System.out.println("La raiz cuadrade de " + num +": "+ raiz);
        
    }
    
}
