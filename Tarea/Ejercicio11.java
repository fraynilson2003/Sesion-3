//Es el ejercicio 3.8 en java
import java.util.Scanner;
class Ejercicio11{ 
  static Scanner teclado=new Scanner(System.in);
  static void ejercicio11(){
    //Definir variables
    int años;
    double sueldo, bonoAnt=0, bonosueldo=0, bonoreal=0;
  
    //datos de entrada
    System.out.print("Ingrese años trabajados:");
    años=teclado.nextInt();
    System.out.print("Ingrese salario:");
    sueldo=teclado.nextInt();
    //Proceso
    if(años>2 && años<5){
      bonoAnt=sueldo*0.20;
    }else if(años>=5){
      bonoAnt=sueldo*0.30;
    }
    if(sueldo<1000){
      bonosueldo=sueldo*0.25;
    }else if(sueldo>=1000 && sueldo<=3500){
      bonosueldo=sueldo*0.15;
    }
    if(bonoAnt>bonosueldo){
      bonoreal=bonoAnt;
    }else if(bonosueldo>bonoAnt){
      bonoreal=bonosueldo;
    
    }
    //Datos de salida
   System.out.println("El trabajador tendra un bono de:"+bonoreal+ "\nSin embargo su bono por antiguedad es :  "+bonoAnt+" y el bono por sueldo es:"+bonosueldo);
  
   
    
  }
  public static void main(String[] arg){
  ejercicio11();
  }
}
    
