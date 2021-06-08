/*
Realizar un programa que dado un número de entrada entre 1 a 7, nos devuelva el dia de la semana de la siguiente forma:
*/ 

import java.util.Scanner;

public class Ejercicio_04 {

    public static void main(String[] args) {
       
    Scanner scan = new Scanner(System.in); 
           
    while(true){
        System.out.print("Ingrese un número\n");   
        int day = scan.nextInt();
                             

          printDayOfTheWeek(day);

          System.out.print("[1] Continuar\n[2] Terminar\n");
          int option = scan.nextInt();

          if(option == 2){
            break;
          }
        }
        
        scan.close();
    }

    public static void printDayOfTheWeek(int day){
                      
        switch (day) {
            case 1:
                System.out.println("El número ingresado " + day + " corresponde al día Domingo");
                break;
            case 2:
                System.out.println("El número ingresado " + day + " corresponde al día Lunes");
                break;
            case 3:
                System.out.println("El número ingresado " + day + " corresponde al día Martes");
                break;
            case 4:
                System.out.println("El número ingresado " + day + " corresponde al día Miercoles");
                break;
            case 5:
                System.out.println("El número ingresado " + day + " corresponde al día Jueves");
                break;
            case 6:
                System.out.println("El número ingresado " + day + " corresponde al día Viernes");
                break;
            case 7:
                System.out.println("El número ingresado " + day + " corresponde al día Sábado");
                break;
            default:
                System.out.println("El valor ingresado " +  day +  " no corresponde a a ningún día de la semana.");
                break;
        }   
    }

}
