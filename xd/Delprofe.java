  

import java.util.Scanner;
/**
 * EtrRepetitive
 */
public class Delprofe {

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
            contador++;//contador=contador+1;
        }
        System.out.println("La suma de los 10 numeros es:"+sumaNumeros);
    }
    public static void suma10NumerosHacerMientras() {
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
        System.out.println("La suma de los 10 numeros es:"+sumaNumeros);
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
        System.out.println("La suma de los 10 numeros es:"+sumaNumeros);
    }        

    public static void menuMain() {
        int opcionAlg=0;
        String mensaje="Seleccione el algortimo que desea probar:"+
        "\n1=suma10NumerosMientras"+
        "\n2=suma10NumerosHacerMientras"+
        "\n3=suma10NumerosPara"+
        "\n4=suma10NumerosMientras"+
        "\n5=numeros pares hasta 100"+
        "\n0=Salir del Programa"
        ;
        System.out.println(mensaje);
        opcionAlg=teclado.nextInt();
        do {                        
            switch (opcionAlg) {
                case 1:suma10NumerosMientras();break;
                case 2:suma10NumerosHacerMientras();break;
                case 3:suma10NumerosPara();break;
                case 4:suma10NumerosMientras();break;
                case 5:numerosPares();break;
                default: System.out.println("Opcion no existe!"); break;    
            } 
            System.out.println("Desea seguir probando algoritmos?:"+mensaje);           
            opcionAlg=teclado.nextInt();
        } while (opcionAlg!=0);        
    }
    public static void numerosPares(){
        for (int numero = 0; numero < 100; numero++) {
            if (numero%2==0) System.out.println("El numero "+ numero+" es par");
        }
    }

    public static void main(String[] args) {
        numerosPares();
    }



}