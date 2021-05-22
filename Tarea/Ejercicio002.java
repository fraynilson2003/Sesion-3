import java.util.Scanner;
class Ejercicio002{
static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
int tiempo_de_trabajo;
int costo_por_hora;
int casi_resultado;

int resultado;//almacenar el resultado

System.out.println("¿cuantas horas de trabajo?");
tiempo_de_trabajo = input.nextInt();

System.out.println("¿cual es el precio por hora?");
costo_por_hora = input.nextInt();

//resultado = costo_por_hora * tiempo_de_trabajo
if (tiempo_de_trabajo>40){

casi_resultado=40* costo_por_hora;
resultado = (((tiempo_de_trabajo - 40) * costo_por_hora) *2)+ casi_resultado;


}
else{
resultado = costo_por_hora * tiempo_de_trabajo;
}
System.out.println (resultado);
}
}