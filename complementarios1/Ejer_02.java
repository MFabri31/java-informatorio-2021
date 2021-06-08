/*
Realizar un programa que solicite por consola 2 números enteros. Para luego imprimir el resultado de la suma, resta, multiplicación, división y módulo (resto de la división) de ambos números.
*/ 

import java.util.Scanner;
import java.io.IOException;

public class Ejer_02 {
    
    public static void main(String[] args) throws IOException, InterruptedException{
    
    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();  
    Scanner scann = new Scanner(System.in);
    
    

    System.out.println("A continuación ingrese 2 números.");

    System.out.println("Número 1");
    int number1 = scann.nextInt();

    System.out.println("Número 2");       
    int number2 = scann.nextInt();   

    scann.close();

    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();  

    
    System.out.println("Operaciones");    

    sum(number1, number2);

    susbtraction(number1, number2);

    multiplication(number1, number2);

    division(number1, number2);

    rest(number1, number2);

    }


    public static void sum(int number1, int number2) {
        System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
    }

    
    public static void susbtraction(int number1, int number2) {
        System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
    }

    public static void multiplication(int number1, int number2) {
        System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
    }

    public static void division(int number1, int number2) {
        System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
    }

    
    public static void rest(int number1, int number2) {
        System.out.println(number1 + " % " + number2 + " = " + (number1 % number2));
    }



}
