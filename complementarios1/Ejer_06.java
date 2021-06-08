/*
Se desea una aplicación que solicite 2 números enteros y realice la operación de potencia (sin uso de librerías).
*/ 

import java.util.Scanner;
import java.io.IOException;

public class Ejer_06 {
    
    public static void main(String[] args) throws IOException, InterruptedException{
        
    Scanner scann = new Scanner(System.in);
        
    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();  

    System.out.println("Por favor ingrese 2 números.");
        
    int base = scann.nextInt(); 
    int exponent = scann.nextInt(); 
    scann.close();
            
    int operation = 1;


    for (int i = 0; i < exponent; i++) {
        operation = operation * base;
    }
   
    System.out.println(base + " elevado a " + exponent
     + " = " + operation);

 }

}
