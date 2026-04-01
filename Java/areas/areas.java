package areas;
import java.util.Scanner;
import java.util.ArrayList;


public class areas {
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        

        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<String> contraseñas = new ArrayList<>();
        ArrayList<Integer> ids = new ArrayList<>();

        System.out.println("ingrese su nombre :");
        String nombre = sc.nextLine();

        System.out.println("ingrese su contraseña: ");
        String contraseña = sc.nextLine();

        System.out.println("ingrese su id: ");
        int id = sc.nextInt();

        nombres.add(nombre);
        contraseñas.add(contraseña);
        ids.add(id);
        

        System.out.println("Nombre: " + nombres.get(0));
        System.out.println("Contraseña: " + contraseñas.get(0));
        System.out.println("ID: " + ids.get(0));

        sc.close();
    }   
    
}
    
