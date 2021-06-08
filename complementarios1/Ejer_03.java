/*
Confeccionar un programa que dado un número entero como dato de entrada imprima la secuencia de números (incrementos de 1) de la siguiente forma:
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
*/ 
import java.util.Scanner;
import java.io.IOException;

public class Ejer_03 {
    
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scan = new Scanner(System.in);

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); 

        System.out.println("Ingrese un número: ");
        int num1 = scan.nextInt();
        scan.close();
        
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); 
        
        sequenceOfNumbers(num1);
    }


    public static void sequenceOfNumbers(int num1) {
        
        if (num1 < 1) {
            System.out.println("El número ingresado no debe ser menor a 1.");
            return;
        }

        int count = 1;
        for (int i = 0; i < num1; i++) {
            
            for (int index = 1; index <= count; index++) {
                System.out.print(index + " ");
            }
            
            count += 1;
            System.out.print("\n");
        }
    
    }


}