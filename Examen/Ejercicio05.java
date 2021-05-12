

import java.util.Scanner;
class Ejercicio05{
  static Scanner teclado=new Scanner(System.in);
  static void ejercicio05FTT(){
    //Inicio
    System.out.println("Hola bienvenido");
    //Datos de entrada
    String opcion;
    System.out.println("Por favor elija el proceso a ejecutar, escriba la letra correspondiente:\nA=Calcular promedio de Fundamentos de Programacion \nB=Bono de profesores de acuerdo al salario minimo y puntos obtenidos \nC=Proceso de seleccion de vacuna \nD=Calcular operaciones matematicas basicas con maximo de 2 constantes");
    opcion=teclado.next();
    //Proceso
    switch(opcion.toUpperCase()){  
      case "A":{
        System.out.println("Buenos dias");
        //DefinirVariables
        
        double promedio, nota1, nota2, nota3, nota4=0;
        try{ 
        //Datos de entrada
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
        System.out.println("Su promedio en el curso de fundamentos de programacion es de: \n"+promedio);
        }catch(Exception e){
          System.out.println("Error en el ingreso de datos!!! Por favor vuelva a intertarlo");
        }
        }break;
      case "B":{
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
        }break;
      case "C":{
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
          }break;
      case "D":{  
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
          }break;
        default:{System.out.println("Error en la introduccion de datos!!!!\nPor favor vuelva a intertarlo...");} break;
        }
      }
  
  public static void main(String[] arg){

    ejercicio05FTT();
  }
}


