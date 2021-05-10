package estcondmult;
import java.util.Scanner;
class EstCondicional{
  static Scanner teclado=new Scanner(System.in);
  static void bonoTrabajadorDMP(){
  //Definir variables
  int anhoAnt;
  double sueldo, bonoAnt=0, bonoSueld=0, bonoReal=0;
  //Datos de Entrada
  System.out.print("Ingrese anhos de antiguedad:");
  anhoAnt=teclado.nextInt();
  System.out.print("Ingrese el sueldo del trabajador:");
  sueldo=teclado.nextDouble();
  //Proceso
  if(anhoAnt>2 && anhoAnt<5){
    bonoAnt=sueldo*0.20;
  }else if (anhoAnt>=5){
    bonoAnt=sueldo*0.30;
  }

  if(sueldo<1000){
    bonoSueld=sueldo*0.25;
  }else if(sueldo>=1000 && sueldo<=3500){
  bonoSueld=sueldo*0.15;
  }else{
  bonoSueld=sueldo*0.10;
  }
  if(bonoAnt>=bonoSueld){
    bonoReal=bonoAnt;
  }else{
    bonoReal=bonoSueld;
  }
  //Datos de salida
  System.out.println("El trabajador tendra un bono de:"+bonoReal+ "\nSin embargo su bono por antiguedad es:  "+bonoAnt+" y el bono por sueldo es:"+bonoSueld);
  }

  static void notaPostulanteEstMultiple(){
  //Definir variables
  String areaCarrera;
  double notaEP, notaRM, notaRV, notaAB, notaFinal=0;
  //Datos Entrada
  System.out.println("Introduce el area a la que corresponde tu carrera:\nB=Biomedicas\nI=Ingenieria\nS=Sociales");
  areaCarrera=teclado.next();
  System.out.println("Ingrese la nota de EP:");
  notaEP=teclado.nextDouble();
  System.out.println("Ingrese la nota de RM:");
  notaRM=teclado.nextDouble();
  System.out.println("Ingrese la nota de RV:");
  notaRV=teclado.nextDouble();
  System.out.println("Ingrese la nota de AB:");
  notaAB=teclado.nextDouble();   
  //Proceso
  switch(areaCarrera.toUpperCase()){
    case "B":{
      notaFinal=(notaEP*0.40)+(notaRM*0.10)+(notaRV*0.20)+(notaAB*0.30);
      areaCarrera="Biomedicas";
      }break;
    case "I":{
      notaFinal=(notaEP*0.40)+(notaRM*0.30)+(notaRV*0.15)+(notaAB*0.15);
      areaCarrera="Ingenierias";        
    }break;
    case "S":{
      notaFinal=(notaEP*0.40)+(notaRM*0.10)+(notaRV*0.30)+(notaAB*0.20);
      areaCarrera="Sociales";        
    }break;
    default:{ System.out.println("La opcion que ingreso no es valida...intente nuevamente!."); } break;
  }
  //Datos de salida
  System.out.println("El postulante obtuvo un nota de:"+notaFinal+"\nY su carrera corresponde al area de:"+areaCarrera);

  }


  public static void main(String[] arg){
  //ejercicio01();
  //ejercicio02();
  //bonoTrabajadorDMP();
  notaPostulanteEstMultiple();
  }
  }