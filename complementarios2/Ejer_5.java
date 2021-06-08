/*
Dados 2 ArrayList que contienen horas-trabajadas (array1) y valor-por-hora(array2) del resumen de carga de horas semanal de un empleado. Se debe generar otra lista que contenga los totales y luego imprimir el total final a cobrar.
[6, 7, 8, 4, 5]
[350, 345, 550, 600, 320]
## Los arrays son iguales y corresponden a los días trabajados de una semana Lun-Vie
[2100, 2415, 4400, 2400, 1600]
Total Final: $ 12915
*/ 

import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Ejer_5 {
    public static void main(String[] args) throws IOException, InterruptedException {
        List<String>  daysOfTheWeek = new ArrayList<>();
        List<Integer> hoursWorked = new ArrayList<>();
        List<Integer> hourlyValue = new ArrayList<>();
        List<Integer> totals = new ArrayList<>();

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();  

        addDayOfTheWeek(daysOfTheWeek);
        
        addHourlyValue(hourlyValue);
        
        hoursWorked(hoursWorked,daysOfTheWeek);
        
        getTotals(hoursWorked, hourlyValue, totals);
        
        getTotalToPay(totals);

        
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();  
        
        System.out.println("Horas trabajadas");
        System.out.println(hoursWorked);
        
        System.out.println("");
        
        System.out.println("Valor por hora");
        System.out.println(hourlyValue);

        System.out.println("");

        System.out.println("Totales");
        System.out.println(totals);

        System.out.println("");
        
        int totalToPay = getTotalToPay(totals);
        System.out.println("Total a pagar -> " + totalToPay);
    }



    public static void hoursWorked(List<Integer> hoursWorked,List<String> daysOfTheWeek) {

        Scanner scan = new Scanner(System.in);

        for (String day : daysOfTheWeek) {
            System.out.println("Ingrese las horas trabajadas del día " + day);
            int hours = scan.nextInt();
            hoursWorked.add(hours);
        }

        scan.close();
    }

     public static void addHourlyValue(List<Integer> hourlyValue) {
        hourlyValue.add(350);
        hourlyValue.add(345);
        hourlyValue.add(550);
        hourlyValue.add(600);
        hourlyValue.add(320);
    }


    public static void addDayOfTheWeek(List<String> daysOfTheWeek) {
        daysOfTheWeek.add("Lunes");
        daysOfTheWeek.add("Martes");
        daysOfTheWeek.add("Miércoles");
        daysOfTheWeek.add("Jueves");
        daysOfTheWeek.add("Viernes");
    }


    public static void getTotals(List<Integer> hoursWorked, List<Integer> hourlyValue, List<Integer> totals ) {
        for (int i = 0; i < hoursWorked.size(); i++) {
            int hours = hoursWorked.get(i) * hourlyValue.get(i);
            totals.add(hours);
        }
    }
    
    
    public static int getTotalToPay(List<Integer> totals) {
        int total = 0;
        for (int i = 0; i < totals.size(); i++) {
           total = total + totals.get(i); 
        }

        return total;
    }
     
}
