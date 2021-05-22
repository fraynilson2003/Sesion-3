//es el ejercicio 4.12
import java.util.Scanner;

public class Ejercicio13 {
    static Scanner teclado=new Scanner(System.in);
    static void ejercicio13FTT(){
        //Inicio
        System.out.println("hello, today we will calculate the amount of your money");
        //Introduccion de datos
        int money=0, contador=1, total=0, tipos=0, valor=0, numerodinero=0;
        try{ 
        System.out.println("Enter the number of types of bills and coins you own (example; $ 1, $ 5, $ 10, etc) ");
        tipos=teclado.nextInt();
        while(contador<=tipos){
            
            System.out.println("Enter the value "+contador+" of the coin or bill: ");
            money=teclado.nextInt();
            System.out.println("Enter the number of coins or bills of this value: ");
            valor=teclado.nextInt();
            numerodinero=numerodinero+money;
            total=total+(money*valor);
            contador++;

        }
        //Datos de salida
        System.out.println("The amount of bills and coins is: "+numerodinero+" \nThe total amount according to the data entered is: "+total);
        }catch(Exception e){
            System.out.println("Error in data entry !!!\nPlease try again ...");
            }
    }
    public static void main(String[] args) {
        ejercicio13FTT();
    }  
}
