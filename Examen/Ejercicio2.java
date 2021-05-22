import java.util.Scanner;
public class Ejercicio2{
  static Scanner teclado=new Scanner(System.in);
  static void ejercicio02FTT(){
    //Inicio
    System.out.println("Buenos dias");
    //Definicion de variables
    double nota, salariominimo, bonototal;
    try{
    //Datos de entrada
    System.out.println("Ingrese la nota obtenida:");
    nota=teclado.nextDouble();
    System.out.println("Ingrese su salario minimo:");
    salariominimo=teclado.nextDouble();
    //Proceso
    if(nota<50){
      bonototal=0;
    }else if(nota>=50 && nota<=100){
      bonototal=salariominimo*0.10;
    }else if(nota>=101 && nota<=150){
      bonototal=salariominimo*0.40;
    }else{
      bonototal=salariominimo*0.70;}
    System.out.println("De acuerdo a la nota obtenida, su bono es de: "+bonototal);
    }catch(Exception e){
      System.out.println("Error en el ingreso de datos!!! \nPor favor vuelva a intertarlo...");
    }
    }
    public static void main(String[] arg){

    ejercicio02FTT();
    }
    }
    