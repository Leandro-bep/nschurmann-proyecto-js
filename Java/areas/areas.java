package areas;
import java.util.Scanner;

public class areas {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        double base, altura, pi = 3.14, areacirculo, areatriangulo, areacuadrado;

        System.out.println("Ingrese el radio del circulo: ");
        Double radio = sc.nextDouble();

        System.out.println("Ingrese la base del triangulo: ");
        base = sc.nextDouble();
        System.out.println("Ingrese la altura del triangulo: ");
        altura = sc.nextDouble();

        System.out.println("Ingrese el lado del cuadrado: ");
        Double lado = sc.nextDouble();

        areacirculo = pi * radio * radio;
        areatriangulo = (base * altura) / 2;
        areacuadrado = lado * lado;

        System.out.println("El area del circulo es: " + areacirculo);
        System.out.println("El area del triangulo es: " + areatriangulo);   
        System.out.println("El area del cuadrado es: " + areacuadrado);

        sc.close();
    }
}
