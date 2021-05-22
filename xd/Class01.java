import java.util.Scanner;
public class Class01{
    static Scanner teclado=new Scanner(System.in);
    public static void class01FTT(){
        //Inicio
        System.out.println("Buenos dias, vamos a calcular su edad");
        //Introduccion de datos
        int años=0, nacido=0, actual=2021;
        System.out.println("Ingrese su año de nacimiento:");
        nacido=teclado.nextInt();
        //Proceso
        años=actual-nacido;
        //DAtos de salida
        System.out.println("Su edad es de: "+años);
    }
    public static void main(String[] arg){
    class01FTT();
    }
}
    

