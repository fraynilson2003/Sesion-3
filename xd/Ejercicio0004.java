import java.util.Scanner;
class Ejercicio0004{
  static Scanner teclado=new Scanner(System.in);
  static void ejercicio04FFF(){
    //Inicio
    System.out.println("Hola");
    //Introduccion de datos
    String operacion;
    double num1, num2, resultado=0;
    System.out.println("Ingrese el primer numero a operar: ");
    num1=teclado.nextDouble();
    System.out.println("Ingrese el segundo nuemro a operar: ");
    num2=teclado.nextDouble();
    System.out.println("Que operacion desea realizar.\n+=Suma\n-=Resta\n*=Multiplicacion\n/=Division\np=Potencia");
    operacion=teclado.next();
    //Proceso
    switch(operacion){
      case "+":{
        resultado=(num1)+(num2);
      }break;
      case "-":{
        resultado=(num1)-(num2);
      }break;
      case "*":{
        resultado=(num1)*(num2);
      }break;
      case "/":{
        resultado=(num1)/(num2);
      }break;
      case "p":{
          resultado=num1;
          for (double i = 1; i < num2; i++){
          resultado=resultado*num1;
        }
      }break;
      default:{System.out.println("Error!!!!!\nPor favor vuelva a introducir los datos..."); }break;
    }
    
    System.out.println("Su resultado es: "+resultado);
  }
  public static void main(String[] arg){ 
  ejercicio04FFF();
  }
}



