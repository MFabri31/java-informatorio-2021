/*
2.Crear un ArrayList, agregar 5 números enteros. Luego, agregar un número entero al principio de la lista y otro al final. Por último, iterar e imprimir los elementos de la lista y el tamaño de la misma (antes y después de agregar a en la primera y última posición).
*/ 
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ejer_2 {
    
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scan = new Scanner(System.in);
        List<Integer> numbersList = new ArrayList<>();


        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();  

        System.out.println("A continuación ingrese 5 números.");    

        for (int i = 1; i < 6; i++) {
            System.out.println("N°" + i);
            int number = scan.nextInt();
            numbersList.add(number);
        }
        
        scan.close();
    
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();  
        
        printListNumbers(numbersList);
        System.out.println("Tamaño de la lista antes de agregar elementos -> " + numbersList.size());

        addValuesToList(numbersList);

        printListNumberWithNewValues(numbersList);
        System.out.println("Tamaño de la lista después de agregar elementos -> " + numbersList.size());

    }



    public static void addValuesToList(List<Integer> numbersList){
        numbersList.add(8);
        numbersList.add(0,6);
    }
    
    
    public static void printListNumbers(List<Integer> numbersList){
        System.out.println("Lista de números antes de agregar nuevos valores");  
        for (int num : numbersList) {
            System.out.println(num);
        }
    }


    public static void printListNumberWithNewValues(List<Integer> numbersList){     
        System.out.println("Lista de números después de agregar elementos");  
        for (int num : numbersList) {
            System.out.println(num + " ");
            System.out.print( "" );
        }
    }
    
}

