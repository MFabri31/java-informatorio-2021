/*
Crear una función que dado 2 argumentos (int, siendo el primero menor al segundo), nos devuelva un array de Strings. Con la secuencia de números enteros de principio a final. Pero si el número es multiplo de 2 colocara el valor “Fizz”, si es múltiplo de 3 “Buzz” y si es a la vez múltiplo de ambos colocara “FizzBuzz”.
Observacion: Los 2 argumentos indican con que valor se arranca a calcular y el segundo con qué valor debe frenar (no se incluye en el cálculo)
Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4

Input
fizzBuzzFuncion(1,6)    // 6 si marca el límite y no se lo incluye
fizzBuzzFuncion(1,8)

Output
[“1”, “Fizz”, “Buzz”, “Fizz”, 5]
[“1”, “Fizz”, “Buzz”, “Fizz”, 5, “FizzBuzz”, 7]

*/ 
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class Ejer_07 {
    
  public static void main(String[] args) throws IOException, InterruptedException {

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();  

        
        System.out.println(fizBuzz(1, 8));   
    }

       public static List<String> fizBuzz(int num1, int num2){
           ArrayList<String> arrayFizz = new ArrayList<>();
           for (int i = num1; i < num2; i++) {
            String.valueOf(i);
            if (i % 2 == 0 && i % 3 == 0 ) {
                arrayFizz.add("'FizzBuzz'");
            }else if(i % 2 == 0 ){
                arrayFizz.add("'Fizz'");
            }else if(i % 3 == 0){
                arrayFizz.add("'Buzz'");
            }
            else{
                arrayFizz.add(String.valueOf(i));
            }
        }

        return arrayFizz;
    }

}
