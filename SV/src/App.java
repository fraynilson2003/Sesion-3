
import pe.edu.upeu.SubProgramas;
import pe.edu.upeu.recur.EjemplosRecursivos;
import pe.edu.upeu.util.Teclado;

public class App {

    

    public static void main(String[] args) throws Exception {
        //SubProgramas obj=new SubProgramas();///obj es un objeto
        //obj.funcionExponencial();
        //obj.matIntCompuesto();

       // System.out.println("Holasss");

        Teclado tc=new Teclado();

        EjemplosRecursivos objER=new EjemplosRecursivos();

        int numero = tc.leer(0, "Ingrese numero: ");
        System.out.println("Factorial iterativo: "+objER.factorialBig(numero));
        System.out.println("Factorial recursivo: "+objER.factorialRecurBig(numero));
    }
}