import java.util.Scanner;

public class ejemplo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ingresa un numero");
        int numero = sc.nextInt();
        
        System.out.println("ingresa otro numero");
        int otroNumero = sc.nextInt();

        if (Math.max(numero, otroNumero) == numero){
            System.out.println("el numero mayor es: " + numero);
        } else{
            System.out.println("el numero mayor es: " + otroNumero);
        }

        sc.close();

    }
}

