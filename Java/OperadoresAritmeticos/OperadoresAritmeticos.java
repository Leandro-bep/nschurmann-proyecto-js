package OperadoresAritmeticos;
import java.util.Scanner;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ingrese el valor de la base: ");
        double base = sc.nextDouble();
        System.out.print("ingrese el valor de la altura: ");
        double altura = sc.nextDouble();

        // Uso de operadores: * (multiplicación) y + (suma)
        double area = base * altura;
        double perimetro = 2 * (base + altura);

        System.out.println("--- Cálculo de Rectángulo ---");
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);

        
    }
}
