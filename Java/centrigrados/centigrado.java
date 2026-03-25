import java.util.Scanner;
    public class centigrado {
        public static void main(String[]args){
            Scanner ssc = new Scanner(System.in);
            System.out.println("ingrese la temperatura en grados centigrados: ");
            Double centigrados = ssc.nextDouble();
            double fahrenheit = (centigrados * 9/5) + 32;
            System.out.println("La temperatura en grados fahrenheit es: " + fahrenheit);
            ssc.close();
        }
    }
