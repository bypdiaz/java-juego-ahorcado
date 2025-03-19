import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {

        // Clase scanner que nos permite que el usuario escriba
        Scanner scanner = new Scanner(System.in);

        // Declaraciones y asignaciones
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        // Arreglos
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        // Estructura de control: interativa (Bucle)
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        // Estructura de control: Iterativa (Bucle)

        while (!palabraAdivinada && intentos < intentosMaximos) {

                                                       //Se usa cuando tenemos una palabra de chars
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " " + palabraSecreta.length() + " letras");

            System.out.println("Introduce una letra, por favor");

            // Usamos la clase scanner para pedir una letra

            char letra = Character.toLowerCase(scanner.next().charAt(0)); 
            // charAt(0) nos devuelve solo la primer letra del String
            //Character.toLowerCase, convierte lo que ingrese el usuario en minusculas

            boolean letraCorrecta = false;

            // Estructura de control: Interativa (Bucle)
            for (int i = 0; i < palabraSecreta.length(); i++) {
                // Estructura de control: condicional
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }

            if (!letraCorrecta) {
                intentos++;
                System.out.println("¡Incorrecto! Te quedan " + (intentosMaximos - intentos) + " intentos.");
            }
            
            //.equals compara los valores
            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) { 
                palabraAdivinada = true;
                System.out.println("¡Felicidades, has adivinado la palabra secreta: " + palabraSecreta);

            }
        }

        if (!palabraAdivinada) {
            System.out.println("¡Que pena te has quedado sin intetos!. Game Over");
        }

        scanner.close();

    }
}
