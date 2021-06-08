/*
Dado un String de entrada (frase, texto, etc) calcular la cantidad de veces que aparece una letra dada.
*/ 
import java.util.Scanner;
import java.io.IOException;


public class Ejer_09 {

     public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scann = new Scanner(System.in);
       
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        System.out.println("Ingrese una frase o texto:");
        String text = scann.nextLine();

        System.out.print("Ingrese un carácter: ");
        char character = (char) System.in.read();
        
        int total = countCharacter(text, character);
        
        scann.close();

        System.out.println("La letra " + character + " aparece " + total + " veces.");                   
    }


    public static int countCharacter(String text, char character) {
        int position; 
        int count = 0;
        position = text.indexOf(character);
        
        while(position != -1) { 
            count++;           
            position = text.indexOf(character, position + 1);
        }

        return count;
   }


}
