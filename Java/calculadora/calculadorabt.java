package calculadora;
import java.util.Scanner;

public class calculadorabt {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int opcion = 0;

         while(opcion !=5){
            System.out.println("selecciones una opcion: ");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Salir");

            opcion = sc.nextInt();

            if(opcion == 1){
                System.out.println("ingrese el primer numero :");
                Double num1 = sc.nextDouble();
                System.out.println("ingrese el segundo numero :");
                Double num2 = sc.nextDouble();
                double resultado = num1 + num2;
                System.out.println("El resultado de la suma es: " + resultado); 

            } else if(opcion == 2){
                System.out.println("ingrese el primer numero :");
                Double num1 = sc.nextDouble();
                System.out.println("ingrese el segundo numero :");
                Double num2 = sc.nextDouble();
                double resultado = num1 - num2;
                System.out.println("El resultado de la resta es: " + resultado);

            } else if(opcion == 3){
                System.out.println("ingrese el primer numero :");
                Double num1 = sc.nextDouble();
                System.out.println("ingrese el segundo numero :");
                Double num2 = sc.nextDouble();
                double resultado = num1 * num2;
                System.out.println("El resultado de la multiplicacion es: " + resultado);

            } else if(opcion == 4){
                System.out.println("ingrese el primer numero :");
                Double num1 = sc.nextDouble();
                System.out.println("ingrese el segundo numero :");
                Double num2 = sc.nextDouble();
                double resultado = num1 / num2;
                System.out.println("El resultado de la division es: " + resultado);

            } else if(opcion == 5){
                System.out.println("Saliendo del programa...");
            } else {
                System.out.println("Opcion no valida, por favor seleccione una opcion del 1 al 5.");

                
            }
         }
         sc.close();
    }
    
}
