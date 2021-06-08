/*
Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina, luego imprimir por pantalla el ranking.
*/ 

import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ejer_1 {
    public static void main(String[] args) throws IOException, InterruptedException {

    Scanner scan = new Scanner(System.in);
    List<String> cities = new ArrayList<>();
    String city;

    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();  

    System.out.println("Ingrese sus ciudades favoritas.");    

    for (int i = 1; i < 4; i++) {
        System.out.println("Ciudad n° " + i);
        city = scan.nextLine();
        cities.add(city);
    }
   
       scan.close();

       new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();  

       printCities(cities);    
    }


    public static void printCities(List<String> cities) {
        System.out.println("Mis ciudades favoritas.");    
        int count = 0;
        for (String value : cities) {
            count += 1; 
            System.out.println("#" + count + " - " + value);
        } 

    }

}
