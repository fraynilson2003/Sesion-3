//Es el ejercicio 4.2
import java.util.Scanner;
public class Ejercicio10 {
    static Scanner teclado=new Scanner(System.in);
    static void ejercicio12FTT(){ 
    //Inicio
    System.out.println("Buenos dias");
    //Introduccion de datos
    int tipo=1, numero;
    double total=0;
    String tipopago;
    
    while(tipo<=3){
        
            if(tipo==1){ 
                System.out.println("¿Cuantas hamburgesas tipo S llevara?");
                numero=teclado.nextInt();
                total=total+numero*20;
            }
            if(tipo==2){
                System.out.println("¿Cuantas hamburgesas tipo D llevara?");
                numero=teclado.nextInt();
                total=total+numero*25;
            }
            if(tipo==3){
                System.out.println("¿Cuantas hamburgesas tipo T llevara?");
                numero=teclado.nextInt();
                total=total+numero*28;
            }
        tipo++;
    }

    System.out.println("¿Desea pagar en efectivo o con tarjeta?\nIngrese la letra correspondiente: \nA=Credito\nB=Tajerta");
    tipopago=teclado.next();
    
    switch(tipopago.toUpperCase()){
        case "A":{
            System.out.println("La cantidad total a pagar de sus hamburguesas es de: "+total);
        }break;
        case "B":{
            total=total+(total*0.05);
            System.out.println("Se agrego un %5 sobre el precio total, el total es de "+total);
        }break;
    }
}
    public static void main(String[] args) {
    ejercicio12FTT();
}
}
    
