package pe.edu.upeu.ftt.examen;

import pe.edu.upeu.ftt.utils.*;



public class Resolucionexamen {
    LeerTeclado ft=new LeerTeclado();
    private static void ejemplo01FTT(){
        LeerTeclado ft=new LeerTeclado();
        int contador=1, cant1=0, cant2=0, cant3=0; 
        double auto=0, impuesto=0, totalcateg1=0, totalcateg2=0, totalcateg3=0, totalgeneral=0;
        System.out.println("Un placer conocerlo señor(a), necesitamos que nos de informacion para poder realiazar los calculos de los impuestos a pagar.");
        
        cant1=ft.leer(0, "\nCuantos vehiculos de categoria 1 posee: ");
        while (contador<=cant1) {
            auto=ft.leer(0, "Cual es el precio del auto numero "+contador+" :");
            impuesto=auto*0.12;
            System.out.println("El impuesto de su auto numero "+contador+" de categoria 1 es de: "+impuesto+" .");
            totalcateg1=totalcateg1+impuesto;
            contador++;
        }
        System.out.println("\nEl impuesto total de sus "+cant1+" autos de categoria 1 es de: "+totalcateg1);

        cant2=ft.leer(0, "\nCuantos vehiculos de categoria 2 posee: ");
        contador=1;
        while (contador<=cant2) {
            auto=ft.leer(0, "Cual es el precio del auto numero "+contador+" :");
            impuesto=auto*0.08;
            System.out.println("El impuesto de su auto numero "+contador+" de categoria 2 es de: "+impuesto+" .");
            totalcateg2=totalcateg2+impuesto;
            contador++;
        }
        System.out.println("\nEl impuesto total de sus "+cant2+" autos de categoria 2 es de: "+totalcateg2);

        cant3=ft.leer(0, "\nCuantos vehiculos de categoria 3 posee: ");
        contador=1;
        while (contador<=cant3) {
            auto=ft.leer(0, "Cual es el precio del auto numero "+contador+" :");
            impuesto=auto*0.05;
            System.out.println("El impuesto de su auto numero "+contador+" de categoria 3 es de: "+impuesto+" .");
            totalcateg3=totalcateg3+impuesto;
            contador++;
        }
        System.out.println("\nEl impuesto total de sus "+cant3+" autos de categoria 3 es de: "+totalcateg3);

        totalgeneral=totalcateg1+totalcateg2+totalcateg3;
        System.out.println("___________________________________________________________________________________________");
        System.out.println("\nEl impuesto total de sus "+cant1+" autos de categoria 1 es de: "+totalcateg1+"\nEl impuesto total de sus "+cant2+" autos de categoria 2 es de: "+totalcateg2+"\nEl impuesto total de sus "+cant3+" autos de categoria 3 es de: "+totalcateg3+"\n \nEl de impuestos a pagar de sus "+(cant1+cant2+cant3)+" autos es de "+totalgeneral);


    }
    private static void ejemplo02FTT(){
        LeerTeclado ft=new LeerTeclado();
        //Inicio
        System.out.println("Hola, hoy le daremos una tabla de multiplicacion hasta de 1 al 20");
        int contador=0, numero=0, contador2=1, contadorgeneral=1;
        //Proceso
    
        while (contadorgeneral<=20){ 
            System.out.println("_______________________________________");
                while (contador<=10) {
                    numero=contador2*contador;
                    System.out.println(contador2+" * "+contador+" = "+numero);
                    numero=0;
                    contador++;  
                }
                contador=1;
                contador2++; 
                contadorgeneral++;         
    }
}
    private static void ejemplo03FTT(){
        LeerTeclado ft=new LeerTeclado();
        //Inicio
        System.out.println("Hola, hoy hallaremos los numerosperfectos");
        //Introduccion de datos
        int numeros=0, contador=2, contador2=1, extra=2;
        int auxiliar=0, contadoraxuliar=0, probador=1;
        numeros=ft.leer(0, "Ingrese hasta el numero hasta el que hallaremos los numeros perfectos");

        while(contador<=numeros){

                while(probador<contador){ 
                    auxiliar=contador%contador2;
                        if(auxiliar==0){
                            contadoraxuliar=contadoraxuliar+contador2;
                        }else{ 
                        }
                        probador++;
                        contador2++;
                       }
                if(contadoraxuliar==contador){ 
                       System.out.println("El numero "+contador+" es un numero perfecto");
                }
                probador=1;
                auxiliar=0;
                contador2=1;
                //extra=2;
                contadoraxuliar=0;

        contador=contador+1;
    }
        }
    
    private static void ejemplo04FTT(){
        LeerTeclado ft=new LeerTeclado();
        //Inicio
        
        System.out.println("Buenos dias, hoy calcularemos la potencias recursivamente");
        //Introduccion de datos
        
        int numero=0, contador=1, exponente=0;
        double resultado=0;
        numero=ft.leer(0, "Ingrese el numero a elevar:");
        exponente=ft.leer(0, "Ingrese el exponente");
        //proceso
        if(exponente>0){ 
            resultado=numero;
            for (contador=1; contador<exponente; contador++){
                resultado=resultado*numero;
            }
            System.out.println("El resultado de la potencia es: "+resultado);
        }
        if(exponente<0){
            resultado=numero;
            for (contador=1; contador>exponente; contador=contador-1){
                resultado=resultado/numero;
        }
            System.out.println("El resultado de la potencia es: "+resultado);
        }
        if (exponente==0){
            System.out.println("Elresultado de la potencia es 0");
        }
    }
          

    public Resolucionexamen(){ 
    String opcion;
    System.out.println("_______________________________________");
    System.out.println("\nMuy buenos dias");
    opcion=ft.leer("","Por favor elija que proceso quiere realizar\n\nA=Impuestos de autos\nB=Tabla de multiplicacion\nC=Numeros perfectos\nD=Ejerciciode potencias recursivas\nX=Cerrar todas la operaciones" );
    
    switch (opcion.toUpperCase()) {
            case "A":{ 
                ejemplo01FTT();
                new Resolucionexamen();
                }break;
            case "B":{ 
                ejemplo02FTT();
                new Resolucionexamen();
                }break;
            case "C":{ 
                ejemplo03FTT();
                new Resolucionexamen();
                }break;
            case "D":{ 
                ejemplo04FTT();
                new Resolucionexamen();
                }break;
            case "X":{
                System.out.println("Hasta pronto, vuelva pronto...");
            }break;
            
            default:{
                System.out.println("Error en seleccion de procesos!!! \nPor favor vuelva a intertarlo...");
                new Resolucionexamen();
            }break; 
            }  

    }
}