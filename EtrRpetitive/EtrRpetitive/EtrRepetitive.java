package EtrRpetitive;

import java.util.Scanner;
/**
 * EtrRepetitive
 */
public class EtrRepetitive {

    static Scanner teclado=new Scanner(System.in);

    public static void suma10NumerosMientras() {
        //Daclarar Variables
        int contador=1;
        double numeros, sumaNumeros=0;
        //Datos de entrada y Proceso
        while (contador<=10) {
            System.out.println("Ingrese el valor en la posicion "+contador+":");
            numeros=teclado.nextDouble();
            sumaNumeros=sumaNumeros+numeros;
            contador++;
        }
        System.out.println("La suma de los 10 numeros es: "+sumaNumeros);
    }


    public static void suma10NumeroshacerMientras() {
        //Daclarar Variables
        int contador=1;
        double numeros, sumaNumeros=0;
        //Datos de entrada y Proceso
        do{
            
            System.out.println("Ingrese el valor en la posicion "+contador+":");
            numeros=teclado.nextDouble();
            sumaNumeros=sumaNumeros+numeros;
            contador++;
            
        }
        while (contador<=10);
        System.out.println("La suma de los 10 numeros es: "+sumaNumeros);
    }


    public static void suma10NumerosPara() {
        //Daclarar Variables
        
        double numeros, sumaNumeros=0;
        //Datos de entrada y Proceso
        for(int contador=1; contador<=10; contador++){
            
            System.out.println("Ingrese el valor en la posicion "+contador+":");
            numeros=teclado.nextDouble();
            sumaNumeros=sumaNumeros+numeros;   
        }
        
        System.out.println("La suma de los 10 numeros es: "+sumaNumeros);
    }
    public static void main(String[] args) {
        System.out.println("Holas Mundo!!");
        suma10NumerosPara();
    }
}

//suma10NumeroshacerMientras();