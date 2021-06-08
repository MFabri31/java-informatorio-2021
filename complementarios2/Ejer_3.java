/*
Crear una lista que contenga como elementos la numeración de cartas de una baraja francesa(solo los valores, no figuras). Se deberá cargar el ArrayList (en orden), imprimir, imprimir en orden inverso (reverse), desordenar (mezclar) el arrayList y volver a imprimir.
*/ 

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class Ejer_3 {
    
    public static void main(String[] args) throws IOException, InterruptedException {
        List<Integer> valuesCards = new ArrayList<>();
    
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();  

        System.out.println("Valores de una baraja francesa\n");
     
        addCardsValues(valuesCards);

        printCardsValues(valuesCards);

        printReverseCardsValues(valuesCards);
        
        printSortCardsValues(valuesCards);
    }

    public static void addCardsValues(List<Integer> valuesCards){
        for (int i = 2; i < 11; i++) {
            valuesCards.add(i);
        }
    }
    
    public static void printCardsValues(List<Integer> valuesCards){
        System.out.println("lista original: " + valuesCards);
    }
    
    public static void printReverseCardsValues(List<Integer> valuesCards){
        Collections.reverse(valuesCards);
        System.out.println("lista invertida: " + valuesCards);
    }


      public static void printSortCardsValues(List<Integer> valuesCards){
        Collections.shuffle(valuesCards);
        System.out.println("lista mezclada: " + valuesCards);
    }
    

}

