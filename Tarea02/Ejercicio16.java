//Este el ejercicio 4.3
import java.util.Random;
import java.util.Scanner;

public class Ejercicio16 {
  
    static Scanner teclado=new Scanner(System.in);

    public static void conteonumeros() {
        //Inicio
        System.out.println("Hola, este el sistema para calcular numeros menores, iguales o mayores de 0.");
        //Daclarar Variables
        int cantCero=0, cantNeg=0, cantPost=0;
        double numeros;
        int numInit=0, numFinal=0, total=0;
      
        System.out.println("Ingrese el numero inicial, debe de ser negativo:");
        numInit=teclado.nextInt();
        System.out.println("Ingrese el numero final:");
        numFinal=teclado.nextInt();
        total=(-numInit)+numFinal+1;//el +1 es por el cero
        Random numAleatorio = new Random();
        //Proceso
        for (int numero=1; numero<=total; numero++) {
            numeros = numAleatorio.nextInt(total)+(numInit);
            System.out.println(numeros);
            if (numeros<0) {cantNeg++;} 
            if (numeros>0) {cantPost=cantPost+1;} 
            if (numeros==0) {cantCero+=1;}             
        }
        //datos de salida
        System.out.println("De total de numeros:\n"+cantCero+" es/son cero(s)"+
        "\n"+cantNeg+" es/son menor(es) de cero"+
        "\n"+cantPost+" es/son mayor(es) de cero"+
        "\nla cantidad de numeros reales entre "+numInit+" y "+numFinal+" es de: "+total);
    }

    public static void main(String[] args) {
        conteonumeros();
    }
}