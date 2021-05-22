//Es la 4.10
import java.util.Scanner;

public class Ejercicio17 {
    static Scanner teclado=new Scanner(System.in);
   
    public static void ejercicio17FTT(){
        
        //Inicio
        System.out.println("Hola, calcularemos el promedio de los alumnos por salones y todo el colegio");
        //Datos de introduccion
        int contador=1, salones=0, cantalum=0, edad=0;
        double promaula=0, promtotal=0, subpromoaula=0;
        System.out.println("Ingrese la cantidad de salones que posee la institucion: ");
        salones=teclado.nextInt();
        while(contador<=salones){
            System.out.println("Cuantos alumnos hay en el "+contador+" salon:");
            cantalum=teclado.nextInt();
            int contador2=1;
                while(contador2<=cantalum){
                System.out.println("Ingrese las edades de los alumnos del salon "+contador+" :");
                System.out.println("alumno numero "+contador2);
                edad=teclado.nextInt();
                promaula=(promaula+edad);
                subpromoaula=promaula;
                contador2++;
                }  
            System.out.println("El promedio del aula numero "+contador+" es de: "+(promaula/cantalum));
            
            subpromoaula=subpromoaula/cantalum;
            promtotal=promtotal+subpromoaula;
            promaula=0;
            contador++; 
            }  
            promtotal=promtotal/salones;
            System.out.println("\nLA EDAD PROMEDIO DE TODA LA ESCUELA ES DE: "+promtotal);
             
    }
    public static void main(String[] args) {
        ejercicio17FTT();
    }
}
