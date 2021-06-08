/*
Crear una aplicación que solicite de entrada los datos de una persona en este orden:Nombre y Apellido Edad Dirección Ciudad Luego imprimirá el siguiente mensaje:{Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}
*/ 

import java.util.Scanner;
import java.io.IOException;

public class Ejer_08 {
    
    public static void main(String[] args) throws IOException, InterruptedException{
        
        Scanner scann = new Scanner(System.in);
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();  

        System.out.println("A continuación ingrese sus datos personales.");
        
        System.out.println("Ingrese su nombre.");
        String name = scann.nextLine();       
        
        System.out.println("Ingrese su apellido.");
        String lastName = scann.nextLine();   

        System.out.println("Ingrese su edad.");
        String age =  scann.nextLine();  

        Integer.parseInt(age);

        System.out.println("Ingrese su dirección.");
        String address = scann.nextLine();  
        
        System.out.println("Ingrese su ciudad.");
        String city = scann.nextLine();  

        scann.close();

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();  

        System.out.println(city + " - " + address + " - " + age + " - " + name + " " + lastName );
 }

}
