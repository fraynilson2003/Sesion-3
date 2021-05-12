package Examen;

import java.util.Scanner;
class Ejercicio04{
  static Scanner teclado=new Scanner(System.in);
  static void ejercicio04FTT(){
    //Inicio
    System.out.println("Hola, buenos dias");
    //Introduccion de datos
    String operacion;
    double numero1, numero2, resultado=0;
    System.out.println("Ingrese el primer digito a operar: ");
    numero1=teclado.nextDouble();
    System.out.println("Ingrese el segundo digito a operar: ");
    numero2=teclado.nextDouble();
    System.out.println("Ingrese el signo a operar: \nSuma = +\nResta = -\nMultiplicacion = *\nDivision = /\nPotencia = ^  o  p");
    operacion=teclado.next();
    //Proceso
    switch(operacion){
      case "+":{
        resultado=(numero1)+(numero2);
        operacion="Suma";
        }break;
      case "-":{
        resultado=(numero1)-(numero2);
        operacion="Resta";
        }break;
      case "*":{
        resultado=(numero1)*(numero2);
        operacion="Multiplicacion";
        }break;
      case "/":{
        resultado=(numero1)/(numero2);
        operacion="Division";
        }break;
      //Profesor lo hice asi, por que potencia es un proceso mas largo
      //No introducir resultados muy largos, solo uso el double.
      case "p":{
        operacion="Potencia";
        resultado=numero1;
        for (double i = 1; i < numero2; i++){
          resultado=resultado*numero1;
        }

        }break;
       case "^":{
         operacion="Potencia";
         resultado=numero1;
        for (double i = 1; i < numero2; i++){
          resultado=resultado*numero1;
        }
         
       }break;
      default:{System.out.println("Error en la introduccion de datos!!!! por favor vuelva a intertarl"); }break;
     }
      //Datos de salida
      System.out.println("Su resultado es: "+resultado+ "\nY la operacion realizada es: "+operacion);
      }
      
      public static void main(String[] arg){ 
      ejercicio04FTT();
      }
      }
  
