
package guia01;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese temperatura en grados Celcius: ");
        
        double tempCelsius = leer.nextDouble();
        double tempFaren =  32 + (9*tempCelsius/5);
        System.out.println("Temperatura en Fahrenheit:  " + tempFaren);
    }
}
