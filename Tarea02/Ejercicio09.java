//Este e el ejercicio 4.8
import java.util.Scanner;
class Ejercicio09{
    static Scanner teclado=new Scanner(System.in);
    static void ejercicio09FTT(){ 
        //Inicio
        System.out.println("Hola, buenos dias");
        //Introduccion de datos
        int cantidad=1, articulos=1;
        double precio, total=0; 
        System.out.println("Cuantos articulos comprara: ");
        cantidad=teclado.nextInt();
        
        while(articulos<=cantidad){ 
        System.out.println("Ingrese el costo de produto numero "+articulos);
        precio=teclado.nextDouble();
            if(precio>=200){
                precio=precio-(precio*0.15);
            }else if(precio>100 && precio<200){
                precio=precio-(precio*0.12);
            }else{
                precio=precio-(precio*0.10);
            }
            total=total+precio;
            articulos++;
            
        }
        System.out.println("El costo total de sus "+cantidad+" objetos comprados es de compra es de: "+total);

        }
    public static void main(String[] args) {
    ejercicio09FTT();
    }
}


