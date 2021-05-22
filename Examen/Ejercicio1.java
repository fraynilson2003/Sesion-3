

import java.util.Scanner;
public class Ejercicio1{
  static Scanner teclado=new Scanner(System.in);
  static void ejercicio01FTT(){
    //Inicio
    System.out.println("Buenos dias");
    //DefinirVariables
    String name;
    double promedio, nota1, nota2, nota3, nota4=0;
    try{ 
    //Datos de entrada
    System.out.println("Ingrese su nombre:");
    name=teclado.next();
    System.out.println("Por favor ingrese su nota de la primera unidad:");
    nota1=teclado.nextDouble();
    System.out.println("Por favor ingrese su nota de la segunda unidad:");
    nota2=teclado.nextDouble();
    System.out.println("Por favor ingrese su nota de la tercera unidad:");
    nota3=teclado.nextDouble();
    System.out.println("Por favor ingrese la nota de su trabajo final:");
    nota4=teclado.nextDouble();
    //Proceso
    promedio=(nota1*0.20)+(nota2*0.15)+(nota3*0.15)+(nota4*0.50);
    System.out.println(name+"\nSu promedio en el curso de fundamentos de programacion es de: \n"+promedio);
    }catch(Exception e){
      System.out.println("Error en el ingreso de datos!!! Por favor vuelva a intertarlo");
  }
  }
  public static void main(String[] arg){
  ejercicio01FTT();
  }
  }
