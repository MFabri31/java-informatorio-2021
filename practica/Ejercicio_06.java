/*
Debemos realizar un programa que nos realizará una pregunta si queremos realizar una operación dada o si deseamos salir/terminar el programa. Utilizaremos en este caso una simple operación que nos pide un número y luego lo imprime.
*/ 


import java.util.Scanner;

public class Ejercicio_06 {

    public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    while (true) {
        System.out.println("============= Opciones =============");
        System.out.println("[1] Ingresar un número\n[2] Salir");

        int option = scan.nextInt();
           
        if(option == 1){
          System.out.println("Digite un número");
          int num = scan.nextInt();
          System.out.println("Valor igresado -> " + num);
          
        }else{
            break;
        }   
    }
    
    scan.close();

    }
    
}
