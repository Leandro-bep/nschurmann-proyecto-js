import java.util.Scanner;

public class valorCompra {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese el precio de la compra: ");

        double valorCompra = entrada.nextDouble();
        if (valorCompra > 100){
            valorCompra = valorCompra * 0.9;
            System.out.println("El valor de la compra con descuento es: " + valorCompra);
        }
        entrada.close();

    }
}   
// El programa solicita al usuario que ingrese el precio de una compra. Si el valor de la compra es mayor a 100, 
// se aplica un descuento del 9% y se muestra el valor final de la compra con el descuento aplicado.