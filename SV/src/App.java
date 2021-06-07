import pe.edu.upeu.SubProgramas;
import pe.edu.upeu.recur.EjemplosRecursivos;
import pe.edu.upeu.util.Teclado;

public class App {

    public static void main(String[] args) throws Exception {
       /* SubProgramas obj=new SubProgramas();///obj es un objeto
        //obj.funcionExponencial();
        obj.matIntCompuesto();
        System.out.println("Holasss");*/

        Teclado tc=new Teclado();

        EjemplosRecursivos objER=new EjemplosRecursivos();

        int numero=tc.leer(0, "Ingrese un numero:");
        /*System.out.println("Facorial iterativo:"+objER.factorialBig(numero));
        System.out.println("Facorial Recursivo:"+objER.factorialRecurBig(numero));*/
        long ti=System.currentTimeMillis();
        System.out.println("Fibonaci iterativo:"+objER.fibonacciBig(numero));
        long tf=System.currentTimeMillis();
        System.out.println("Timepo Iterativo: "+(tf-ti));

        ti=System.currentTimeMillis();
        System.out.println("Fibonaci x:"+objER.fibonacciXBig(numero));
        tf=System.currentTimeMillis();
        System.out.println("Timepo x: "+(tf-ti)); 


        ti=System.currentTimeMillis();
        System.out.println("Factorial Iteratico:"+objER.factorialBig(numero));
        tf=System.currentTimeMillis();
        System.out.println("Factorial Iteratico: "+(tf-ti));         

        ti=System.currentTimeMillis();
        System.out.println("Factorial Recursivo:"+objER.factorialRecurBig(numero));
        tf=System.currentTimeMillis();
        System.out.println("Factorial Recursivo: "+(tf-ti));         

       /* ti=System.currentTimeMillis();
        System.out.println("Fibonaci recursivo:"+objER.fibonacciRecur(numero));
        tf=System.currentTimeMillis();
        System.out.println("Timepo recursivo: "+(tf-ti));*/

       
    }

}