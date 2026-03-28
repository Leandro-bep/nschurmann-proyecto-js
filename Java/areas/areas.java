package areas;
import java.util.Scanner;

public class areas {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese un numero en formato texto;");
        String numerotexto = sc.nextLine();

        int numero = Integer.parseInt(numerotexto);

        System.out.println("el numero ingresado en texto es " + numerotexto);
        System.out.println("el numero ingresado en formato entero es " + numero);
        
    }

}
    
