//Es el Ejercicio 4.13
import java.util.Scanner;

public class Ejercicio18 {
    static Scanner teclado= new Scanner(System.in);
    public static void ejercicio18FTT(){
        //Inicio
        System.out.println("Hola, calcularemos los datos de sus venta");
        //Introduccion de datos
        int numventas=0, contador=1, fail=0;
        double cant1=0, cant2=0, cantidad=0, venta1=0, venta2=0, total=0;
        System.out.println("¿Cuantas ventas se realizo en total?");
        numventas=teclado.nextInt();
      
        while (contador<=numventas) {
            System.out.println("Ingrese la cantidad numero "+contador+" :");
            cantidad=teclado.nextDouble();
            total=cantidad+total;
                if(cantidad<=10000) {
                    venta1=venta1+cantidad;
                    cant1++;
                }
                if(cantidad>10000 && cantidad<20000) {
                    venta2=venta2+cantidad;
                    cant2++;
                }
                if(cantidad>20000){fail++;}
                contador++;
            }
        
        
        //Datos de salida
            System.out.println("De acuerdo a sus "+numventas+" :"+
            "\nLa cantidad de ventas menores o igual a 10000 es de:" +cant1+
            "\nLa cantidad de ventas mayores a 10000 y menores a 20000 es de: "+cant2+
            "\nLa cantidad de numeros fuera de los requisitos es de: "+fail+
            "\nLa suma de ventas de menores a 10000 es de: "+venta1+
            "\nLa suma de ventas mayores a 10000 y menores a 20000 es de: "+venta2+
            "\nLa suma total de todas sus cantidades es de "+total);
            
        }
        public static void main(String[] args) {
            ejercicio18FTT();
        }
    }

