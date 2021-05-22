//es la 4.9
import java.util.Scanner;

public class Ejercicio19 {
    static Scanner teclado = new Scanner(System.in);
    public static void ejercicio19FTT() {
        //Inicio
        System.out.println("Hola, calcularemos su ganancia de intereses simples");
        //Introduccion de datos
        int años=0, contador=1;
        double mensual=0, subtotal=0, total=0, inversionanual=0;
        System.out.println("Ingrese la cantidad que depositara cada mes: ");
        mensual=teclado.nextDouble();
        System.out.println("¿Cuantos años de interes quiere calcular?");
        años=teclado.nextInt();
        inversionanual=mensual*12;
        while (contador<=años) {
            subtotal=inversionanual+((subtotal*0.10)+subtotal);
            
            System.out.println("La suma total con interes del año "+contador+" es de: "+(subtotal+subtotal*0.10)+
            "\nEl interes del año "+contador+" es de: "+subtotal*0.10);
            contador++;
            
        }
        total=subtotal+subtotal*0.10;

        System.out.println("\n\nLA CANTIDAD TOTAL DEL AÑO "+(contador-1)+" ES DE: "+total);
    }
    public static void main(String[] args) {
        ejercicio19FTT();
    }
}
