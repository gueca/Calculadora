import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        while (true) {
            System.out.println("**** Aplicacion de consola Calculadora ****");
            // Mostrando el menu
            mostrarMenu();
            try {
                var operacion = Integer.parseInt(consola.nextLine());
                // Revisar que este dentro de las operaciones mencionadas
                if (operacion >= 1 && operacion <= 4) {
                    // Ejecutamos la operacion
                    ejecutarOperacion(operacion, consola);
                } else if (operacion == 5) { // Salir
                    System.out.println("Gracias! por utilizar nuestra aplicacion, hasta pronto...");
                    break;
                } else {
                    System.out.println("Opcion erronea: " + operacion);
                }
                System.out.println();
            } catch (Exception e) {
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("""
                1. Suma
                2. Resta
                3. Multiplicacion
                4. Division
                5. Salir
                """);
        System.out.print("Escriba el numero de la operacion a realizar? ");
    }

    private static void ejecutarOperacion(int operacion, Scanner consola) {
        System.out.print("Escribe el primer valor: ");
        var valor1 = Double.parseDouble(consola.nextLine());
        System.out.print("Escribe el segundo valor: ");
        var valor2 = Double.parseDouble(consola.nextLine());
        double resultado;
        switch (operacion) {
            case 1 -> { // Suma
                resultado = valor1 + valor2;
                System.out.println("Resultado Suma: " + resultado);
            }
            case 2 -> { // Resta
                resultado = valor1 - valor2;
                System.out.println("Resultado Resta: " + resultado);
            }
            case 3 -> { // Multiplicacion
                resultado = valor1 * valor2;
                System.out.println("Resultado Multiplicacion: " + resultado);
            }
            case 4 -> { // Division
                resultado = valor1 / valor2;
                System.out.println("Resultado Division: " + resultado);
            }
            default -> {
                System.out.println("Opcion erronea: " + operacion);
            }
        }
    }
}
