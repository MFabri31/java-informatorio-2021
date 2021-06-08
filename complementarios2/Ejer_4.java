/*
Cargar un arrayList con 12 nombres de estudiantes(String), luego separarlos en 3 cursos (3 arrayList) e imprimir dichos cursos.
*/ 

import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ejer_4 {

    public static void main(String[] args) throws IOException, InterruptedException {
        List<String> studentsList = new ArrayList<>();
        List<String> englishCourse = new ArrayList<>();
        List<String> mathsCourse = new ArrayList<>();
        List<String> programmingCourse = new ArrayList<>();
        
    
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();  

        System.out.println("Ingrese el nombre de 12 estudiantes");

        getStudentName(studentsList);

        englishCourse =  studentsList.subList(0, 3);
        mathsCourse =  studentsList.subList(0, 3);
        programmingCourse =  studentsList.subList(0, 3);

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();  
        
        System.out.println("Estudiantes en el curso de Inglés " + englishCourse);
        System.out.println("Estudiantes en el curso de Matemáticas " + mathsCourse);
        System.out.println("Estudiantes en el curso de Programación " + programmingCourse);
    }
    
    
    public static void getStudentName(List<String> studentsList) {
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i < 13; i++) {
            System.out.println("Nombre del estudiante " + "#" + i);
            String studentsName = scan.nextLine();
            
            studentsList.add(studentsName);
        }

        scan.close();

    }

}