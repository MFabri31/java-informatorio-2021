/*
Tendremos un sistema que debe clasificar el resultado de una evaluación. Como dato de entrada tendremos un entero y como resultado un String de la clasificación de la siguiente forma:

Rango Clasificación
93 - 100 Excelente
85 - 92 Sobresaliente
75 - 84 Distinguido
60 - 74 Bueno
00 - 59 Desaprobado

*/

import java.util.Scanner;

public class Ejercicio_03 {
     public static void main(String[] args) {

         
        Scanner scan = new Scanner(System.in);
     
        int option = 1;
     
        while(option == 1){
            System.out.print("Ingrese una nota\n");   
         
            int score = scan.nextInt();  


            printScores(score);

            System.out.print("[1] Continuar\n[2] Terminar\n");
            option = scan.nextInt();

            if(option == 2){
                break;
            }
          
        }
        
        scan.close();

    }

    public static void printScores(int score){
         
           if(score >= 93){ 
              System.out.println("Excelente");
          }
          else if(score >= 85){
              System.out.println("Sobresaliente");
          }  
          else if(score >= 75){  
              System.out.println("Distinguido");
          }
          else if(score >= 60){
               System.out.println("Bueno");
          }
          else{
              System.out.println("Desaprobado");
          } 
    }

}
