package OperadoresLogicos;
import java.util.Scanner;
    public class OperadoresLogicos {
        static Scanner sc = new Scanner(System.in);
        public static void main(String[] args) {

            System.out.print("¿El estudiante tiene carnet de laboratorio? (true/false): ");
            boolean tieneCarnet = sc.nextBoolean();
            System.out.print("¿El estudiante tiene deudas pendientes? (true/false): ");
            boolean tieneDeuda = sc.nextBoolean();
            System.out.print("¿El estudiante tiene permiso especial para ingresar? (true/false): ");
            boolean tienePermisoEspecial = sc.nextBoolean();

            // Operadores: && (AND), ! (NOT), || (OR)
            // El estudiante entra si: (Tiene carnet Y NO tiene deuda) O tiene permiso especial
            boolean puedeIngresar = (tieneCarnet && !tieneDeuda) || tienePermisoEspecial;

            System.out.println("Estado de Carnet: " + tieneCarnet);
            System.out.println("¿Tiene deudas pendientes?: " + tieneDeuda);
            System.out.println("¿Acceso concedido al laboratorio?: " + puedeIngresar);
        }
    }
