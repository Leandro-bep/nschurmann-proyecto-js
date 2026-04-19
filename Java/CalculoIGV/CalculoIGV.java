package CalculoIGV;
import java.util.Scanner;

public class CalculoIGV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double interes = 0.02;

        System.out.print("ingrese el monto total del producto: ");
        double monto = sc.nextDouble();

        System.out.print("caunto va a pagar al contado: ");
        double pago = sc.nextDouble();
        
        double credito = monto + (monto * interes);
       
        double total = pago + (monto * interes);

        System.out.println("el monto total a pagar con credito es: " + total);
        System.out.println("el monto total que pagara es: " + credito);

       sc.close();
    }
}