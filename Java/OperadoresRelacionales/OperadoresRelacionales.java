package OperadoresRelacionales;
import java.util.Scanner;

public class OperadoresRelacionales {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la nota final del estudiante: ");
        int notaFinal = sc.nextInt();
        System.out.print("Ingrese la nota mínima aprobatoria: ");
        int notaMinimaAprobatoria = sc.nextInt();


        // Uso de operadores: >= (mayor o igual) y > (mayor que)
        boolean esAprobado = notaFinal >= notaMinimaAprobatoria;
        boolean esExcelente = notaFinal >= 18;

        System.out.println("¿El estudiante aprobó?: " + esAprobado);
        System.out.println("¿Es una nota excelente (18-20)?: " + esExcelente);
    }
}


  