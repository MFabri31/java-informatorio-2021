/*
Desarrollar un programa que dado un número entero ingresado, nos retorne los valores de ese número multiplicado por 1, 2, 3, … y 10.
*/ 

import java.util.Scanner;
public class Ejercicio_05 {
    
    public static void main(String[] args) {
       
     Scanner scan = new Scanner(System.in);
     
        while(true){
          System.out.print("Ingrese un número\n");   
          int num1 = scan.nextInt();

          for (int i = 1; i < 10; i++) {
            System.out.println(num1 + " x " + i + " = " + i * num1 ); 
        }

          System.out.print("[1] Continuar\n[2] Terminar\n");
          int option = scan.nextInt();

          if(option == 2){
            break;
          }
          
        }        
        
        scan.close();
    }

}



