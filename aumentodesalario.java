import java.util.Scanner;
public class aumentodesalario {
    public static void main(String args[]){ 
        String nombre,apellido;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca su nombre: ");
        nombre = teclado.nextLine();
         System.out.print("Introduzca su apellido: ");
        apellido= teclado.nextLine();
        double salario;
        System.out.print("Introduzca su salario actual: ");
        salario = teclado.nextDouble();
        
        if(salario<=1000){
        	salario += (salario * 0.25);
        }
        else if (salario>=1000 && salario<=2000);{
             salario += (salario * 0.15);   
    }
        if (salario>=2000);{
             salario += (salario *0.06);
    }
        System.out.println ("El nuevo salario es: " +salario);   
	} 
    }
