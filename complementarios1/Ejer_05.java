/*
Se desea una aplicación que solicite 2 números enteros y realice la operación de multiplicación por sumas sucesivas (sin uso de librerías).
*/ 

import java.util.Scanner;

public class Ejer_05 {
    
    public static void main(String[] args){
        
    Scanner scann = new Scanner(System.in);


    System.out.println("Por favor ingrese 2 números.");
        
    int num1 = scann.nextInt(); 
    int num2 = scann.nextInt(); 
    scann.close();
            
    int result = num1 * num2;
    int multiplication = 0;

    for (int i = 0; i < result ; i++) {
        multiplication += 1;
    }
   
    System.out.println(num1 + " x " + num2 + " = " +  multiplication);

 }

}
