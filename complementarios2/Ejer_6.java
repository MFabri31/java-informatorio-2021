/*
Se dispone de una lista de Empleados, de cada empleado se conoce:
○Nombre y Apellido
○DNI
○horasTrabajadas
○valor Por Hora 

ttodos los empleados están cargados en un Set (HashSet), se desea calcular el sueldo (horas Trabajadas x valorPorHora) de toda esa lista para luego almacenar en un Map (o Diccionario) donde la clave(key) es el dni y el valor(value) es el sueldo calculado.
*/ 

import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;

public class Ejer_6 {
    public static void main(String[] args) throws IOException, InterruptedException {
        Set<Employee_ejer06> employees = new HashSet<>();
        Map<String, Integer> salary = new HashMap<>();

            
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();  

        Employee_ejer06 emp1 = new Employee_ejer06("Matías","Fernandez","123", 8,4000);
        Employee_ejer06 emp2 = new Employee_ejer06("Matías","Gonzales","456",6,3000);
        Employee_ejer06 emp3 = new Employee_ejer06("Marta","López","789",4,2000);

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

      
        System.out.println("Sueldo de empleados de acuerdo a su dni:");
        getSalary(employees, salary);

    
        printAllSalary(salary);
      
    }


    public static void getSalary(Set<Employee_ejer06> employees, Map<String, Integer> salary){
          for (Employee_ejer06 emp : employees) {
            salary.put(emp.id, emp.calculateSalary());
        }
    }

       public static void printAllSalary(Map<String, Integer> salary){
          for (String key : salary.keySet()) {
            System.out.println("DNI " + key + " / " + "Sueldo " + salary.get(key));
        }
    }
    
}


