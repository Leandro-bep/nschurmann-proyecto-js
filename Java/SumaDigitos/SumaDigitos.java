package SumaDigitos;
import java.util.Scanner;

public class SumaDigitos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese un número de tres cifras: ");
        int numero = teclado.nextInt(); // Ejemplo: 235

        // Proceso de descomposición
        int d3 = numero % 10;           // Obtiene el 5
        int resto = numero / 10;        // Queda 23
        
        int d2 = resto % 10;            // Obtiene el 3
        int d1 = resto / 10;            // Obtiene el 2

        int suma = d1 + d2 + d3;

        // Reporte formateado
        System.out.println("---------------------------------");
        System.out.println("La suma de " + d1 + " + " + d2 + " + " + d3 + " = " + suma);
        System.out.println("---------------------------------");
        
        teclado.close();
    }
}
