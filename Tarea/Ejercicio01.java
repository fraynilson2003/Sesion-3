import java.util.Scanner;

class Ejercicio01{
static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
int edad_de_la_persona;
System.out.println("¿cual es su edad?");
//imprimir la edad de la persona
edad_de_la_persona=input.nextInt();
//capturado valor asignado
if (edad_de_la_persona>17) {
System.out.println("si puede votar");
}
if (edad_de_la_persona<18) {
  System.out.println("no puede votar");
}
    }
}