package Examen;

import java.util.Scanner;
class Ejercicio03{
  static Scanner teclado=new Scanner(System.in);
  static void ejercicio03FTT(){
    //Inicio
    System.out.println("Buenos dias, bienvenido a la campaña de vacuancion");
    //Introduccion de datos
    String sexo, vacuna;
    int años;
    try{  
    System.out.println("Por favor introdusca en mayuscula la letra que defina su sexo:\nA=Hombre\nB=Mujer");
    sexo=teclado.next();
    System.out.println("Por favor introdusca su edad:");
    años=teclado.nextInt();
    //Proceso
    if(sexo.equals("A") && años>=70){
      vacuna="C";
    }else if(sexo.equals("B") && años>=70){
      vacuna="C";
    }else if(sexo.equals("A") && años<=69 && años>=16){
      vacuna="A";
    }else if(sexo.equals("A") && años<16){
      vacuna="A";
    }else if(sexo.equals("B") && años<16){
      vacuna="A";
    }else{
      if(sexo.equals("B") && años<=69 && años>=16){
        vacuna="B";
      }else{
        vacuna="Error en definicion de sexo, por favor vuelva a intertarlo usando la la letra mayuscula...";
      }
      }
      System.out.println("De acuerdo a los datos ingresados usted recibira la vacuna tipo: "+vacuna);
      }catch(Exception e){
      System.out.println("Error en el ingreso de datos!!! \nPor favor vuelva a intertarlo...");
      }
      }
      public static void main(String[] arg){
      ejercicio03FTT();
      }
      
    }
    

