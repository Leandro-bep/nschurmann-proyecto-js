    package Grados;

    import java.util.Scanner;

    public class Fahrenheit {
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);

            System.out.print("Ingrese la temperatura en grados centigrados: ");
            double centigrados = sc.nextDouble();

            double fahrenheit = (centigrados * 9/5) + 32;

            System.out.println("La temperatura en grados fahrenheit es: " + fahrenheit);
            
            sc.close();
        }
        
}
