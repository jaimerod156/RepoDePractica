
package paquetedeprueba;

import java.util.Scanner;

public class EjercicioPrueba {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int numero = 5;
        double numeroDecimal= 5.22;
        boolean boleano = true;
        String nombre = "Jaime";
        System.out.print("Imgrese su nombre: ");
        nombre = leer.next();
        numero++;
        System.out.println("Bienvenido " + nombre);
        
        System.out.print("Ingrse su edad: ");
        int edad = leer.nextInt();
        System.out.println("Tienes " + String.valueOf(edad) + " años.");
        
        
        System.out.println("edad = " + nombre.equals(nombre));
        
        int longitud = nombre.length();
        System.out.println("longitud = " + longitud);
        
        int random = (int) (Math.random()*10);
        System.out.println("random = " + random);
    }
}
