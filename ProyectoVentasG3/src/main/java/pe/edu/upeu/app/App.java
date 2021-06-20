package pe.edu.upeu.app;

import pe.edu.upeu.gui.*;
import pe.edu.upeu.modelo.CategoriaTO;
import pe.edu.upeu.modelo.ProductoTO;
import pe.edu.upeu.util.LeerTeclado;
/**
 * Hello world!
 *
 */
public class App {

    public static void registrarCategoria(CategoriaTO categ) {
        System.out.println("------Registro categoria----");
        System.out.println("IdCategoria: "+categ.getIdCateg()+"\tnombre: "+categ.getNombre());

    }


    public static void main( String[] args ){
        System.out.println( "Hello World!" );

        CategoriaTO categx=new CategoriaTO();
        LeerTeclado lt=new LeerTeclado();
        categx.setIdCateg(lt.leer("", "Ingrese Id categoria: "));
        categx.setNombre(lt.leer("", "Ingrese nombre: "));
        registrarCategoria(categx);

        /*ProductoTO prodx=new ProductoTO();
        prodx.setIdCateg(lt.leer("", "Ingrese el Id producto: "));
        prodx.setNombre(lt.leer("", "Ingrese el Nombre producto: "));
        registrarProducto(categx);  */
        

        new MainGUI();
    }
}
