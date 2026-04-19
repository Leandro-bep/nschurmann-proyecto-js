package dolares;
import java.util.Scanner;

public class cambio {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el valor del dolar: ");
        double dolares = sc.nextDouble();

        System.out.print("ingrese cuantos dolares quieres comprar por soles: ");
        double soles = sc.nextDouble();

        double resultado = soles / dolares;
        System.out.println("El valor en soles es: " + resultado);

        sc.close();
    }

    
}
