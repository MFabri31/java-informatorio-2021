/*
Solicitar por consola el nombre del usuario e imprimir por pantalla el siguiente mensaje “HOLA {USUARIO}!!!”
*/ 

import java.util.Scanner;
import java.io.IOException;

public class Ejer_01 {
    
    public static void main(String[] args )throws IOException, InterruptedException {
        
      new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();  
      
      String userName = getUserName();

      printUserData(userName);
    }
    
    public static String getUserName(){
        Scanner scann = new Scanner(System.in);
       
        System.out.println("Ingrese su nombre.");  
        String userName = scann.nextLine();   
    
        scann.close();

        return userName;
    }

     
    public static void printUserData(String userName){
        System.out.println("Hola " + userName + "!!!");
    }

}
