//Este es el ejercicio 4.5
import java.util.Scanner;

public class Ejercicio14 {
    static Scanner teclado=new Scanner(System.in);
    static void ejercicio14FTT(){
        //Inicio
        System.out.println("Hola, buenos dias, soy sistema para calcular sus ahorros");
        //Introduccion de datos
        int tiempo, total=0, cantidad=0;
        //Proceso
        System.out.println("Ingrese el tiempo que realizo este proceso:");
        tiempo=teclado.nextInt();
        tiempo=tiempo-1;
        for(int total2=1; cantidad<=tiempo; cantidad++){ 
            total2=total2*3;
            total=total2+total;
            }

        System.out.println("La cantidad total ahorrada es de: "+total);
    }
    public static void main(String[] args) {
    ejercicio14FTT();  
    }
} 
