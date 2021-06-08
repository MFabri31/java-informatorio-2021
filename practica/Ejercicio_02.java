/*
Realizar un programa que al ejecutar se pueda ingresar 3 numeros enteros, para luego imprimirlos por pantalla de la siguiente manera:

El primer nro ingresado es: 4
El segundo nro ingresado es: 5
El tercer nro ingresado es: 6

*/ 

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Ejercicio_02 {
    public static void main(String[] args) {
        List<Integer> numbersList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
     
        while(true){
            for (int i = 0; i < 3; i++) {
                System.out.print("Ingrese un número\n");   
                
                int num3 = scan.nextInt();
                numbersList.add(num3);
            }
        
          printNumbers(numbersList);  

          System.out.print("[1] Continuar\n[2] Terminar\n");
          int option = scan.nextInt();

          if(option == 2){
            break;
          }
           
        }
        
        scan.close();
    }

    public static void printNumbers(List<Integer> numbersList){
      for (int num : numbersList) {
        System.out.print("El tercer nro ingresado es: " + num + "\n");  
      }
    }

    
}
