package promedio;

import java.util.Scanner;

    public class promedio {
        public static void main(String[] args){
            java.util.Scanner sc = new Scanner(System.in);
            
            String curso, nombre;
            double nota1, nota2, nota3, promedio, suma;

            System.out.println("ingrese su nombre : ");
            nombre = sc.nextLine();

            System.out.println("Ingrese el nombre del curso: ");
            curso = sc.nextLine();

            System.out.println("Ingrese la primera nota: ");
            nota1 = sc.nextDouble();
            
            System.out.println("Ingrese la segunda nota: ");
            nota2 = sc.nextDouble();

            System.out.println("Ingrese la tercera nota: ");
            nota3 = sc.nextDouble();
            
            promedio = (nota1 + nota2 + nota3) / 3;
            suma = nota1 + nota2 + nota3;

            System.out.println("Mi nombre es : " + nombre);
            System.out.println("Curso : " + curso);
            System.out.println("Promedio: " + promedio);
            System.out.println("Mi puntaje final: " + suma);

            sc.close();
        }

    }
    
