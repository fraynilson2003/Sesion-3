//Es el 4.4
import java.util.Scanner;
public class Ejercicio15 {
    static Scanner teclado=new Scanner(System.in);
    public static void ejercicio15FTT() {
        //Inicio
        System.out.println("Hola, calcularemos la cantidad de focos totales");
        //Introduccion de datos
        int total=0, verdes=0, blancos=0, rojos=0, contador=1;
        while(contador<=3){
            if(contador==1){
                System.out.println("Ingrese la cantidad total de focos verdes: ");
                verdes=teclado.nextInt();
                total=total+verdes;
            }
            if(contador==2){
                System.out.println("Ingrese la cantidad total de focos blancos: ");
                blancos=teclado.nextInt();
                total=total+blancos;
            }
            if(contador==3){
                System.out.println("Ingrese la cantidad total de focos rojos ");
                rojos=teclado.nextInt();
                total=total+rojos;
            }

            contador++;
        }
        System.out.println("La cantidad total de sus focos es de: "+total);
        }   
        public static void main(String[] args) {
            ejercicio15FTT();
        }
    }
    

