package guia01;

import java.util.Scanner;

public class Ejercicio01 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese dos numeros: ");
        int num1= leer.nextInt();
        int num2 = leer.nextInt();
        int suma = num1 + num2;
        
        System.out.println("suma = " + suma);
    }
    
}
