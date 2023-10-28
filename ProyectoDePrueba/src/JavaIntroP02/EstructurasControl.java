package JavaIntroP02;

import java.util.Scanner;

public class EstructurasControl {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        if(2>3) {
            System.out.println("Hola mundo");    
        }else if (2==3){
            System.out.println("Chao mundo");
        }else {
            System.out.println("Hasta la vista baby");
        }
        
        System.out.printf("verdad %d \n",(2<3) ? 1 : 0);
        
        System.out.print("Ingrese numero dia de la semana 1- 7: ");
        int dia = leer.nextInt();
        switch(dia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Día invalido");
               
        }
        
    }
}
