/*
Realizar un programa que calcule el factorial de un número:n! = 1 x 2 x 3 x 4 x 5 x ... x (n-1) x n. Sin hacer uso de librerías.

*/ 

import java.util.Scanner;
import java.io.IOException;

public class Ejer_04 {
    
    public static void main(String[] args) throws IOException, InterruptedException{
  
    Scanner scann = new Scanner(System.in);
        
    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

    System.out.println("Ingrese un número para obtener su factorial.");
        
    int number = scann.nextInt();       
    scann.close();
    
    factorial(number);

 }

    public static void factorial(int number) {
        int factorial = 1;

        for (int i = number; i > 1; i--) {
            factorial *= i;
        }

        System.out.println("El factorial de " + number + " es -> " + factorial);
    }

}


