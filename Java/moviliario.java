import java.util.Scanner;

public class moviliario {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("ingrese sus datos para conocer si es apto para un credito");
        
        System.out.println("Ingrese su edad:");
        Integer edad = sc.nextInt();
        
        System.out.println("ingrese su sueldo que gana: ");
        double sueldo = sc.nextDouble();
        
        if (edad >= 25 && edad <= 55){
            if (sueldo >= 3500){
            System.out.println("Usted tiene los requisitos aptos para un credito");
            } else{
                sc.nextLine(); // limpiar buffer
                
                System.out.println("Tiene aval: (si o no)");
                String aval = sc.nextLine();
                
                if (aval.equalsIgnoreCase("si")){
                    System.out.println("Credito aprobado con restricciones");
                    
                }else{
                    System.out.println("No apto para un credito");
                }
            }
            
        } 
        else{
            System.out.println("Credito rechazado por edad");
        }
        sc.close();
    }

    
}
