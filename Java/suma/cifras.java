package suma;
import java.util.Scanner;
public class cifras {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("ingrese un numero de 3 cifras: ");
        int numero = sc.nextInt();

        int centenas = numero / 100;
        int decenas = (numero / 10) % 10;
        int unidades = numero % 10;

        int suma = centenas + decenas + unidades;

        System.out.println("La suma de sus digitos es: " + suma);

    }
        
    
}
