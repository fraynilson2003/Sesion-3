//Este es el ejercicio 4.1
import java.util.Scanner;
public class Ejercicio11 {
    static Scanner teclado=new Scanner(System.in);
    static void ejercicio11FTT(){
        //Inicio
        System.out.println("Buenos dias");
      
        
        //Introduccion de datos
        int años=0;
        double salario=0, salariototal=0;
        //En el ejercicio esta con cantidad 1500. Pero se puede probar con cualquier numero
        System.out.println("Ingrese la cantidad de su salario actualmente: ");     
        salario=teclado.nextDouble();
       
        do{ 
            //Tenia dudas profesor, incicio de 0 por las dudas
            salariototal=salario+(salariototal*0.10);     
            salario=salariototal;
            System.out.println("Su salario en el año numero "+años+" es de: "+salariototal);
            años++;
            

        }while (años<=6);
        System.out.println("Su salario al sexto año, con 6 aumetos hasta la fecha es de: "+salariototal);


        }
        public static void main(String[] args) {
            ejercicio11FTT();
        }
}       
