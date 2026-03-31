package Fahrenheit;

import java.util.Scanner;

public class Fahrenheit {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese ña temperatura en grados centigrados: ");
        double centigrados = sc.nextDouble();

        double Fahrenheit = (centigrados * 9/5) + 32;

        System.out.println("La temperatura en grados fahrenheit es: " + Fahrenheit);
        
        sc.close();
    }
    
}
