  
package pe.edu.upeu.recur;

import java.math.BigInteger;

public class EjemplosRecursivos {
 
    public long factorial(int numero) {
        long resultado=1;
        if(numero>1){
            for (int i = 1; i <= numero; i++) {
                resultado=resultado*i;
            }
        }
         return resultado;
      } 
      
      
      public long factorialRecur(int numero) {
        long resultado=1;
        if(numero>1){
            return factorialRecur(numero-1)*numero;
        }else{
            return resultado;
        }        
      }       

      public BigInteger factorialBig(int numero) {
        BigInteger resultado=new BigInteger("1");
        if(numero>1){
            for (int i = 1; i <= numero; i++) {
                resultado=resultado.multiply(new BigInteger(String.valueOf(i)));
            }
        }
         return resultado;
      } 
      
      
      public BigInteger factorialRecurBig(int numero) {
        BigInteger resultado=new BigInteger("1");
        if(numero>1){
            return factorialRecurBig(numero-1)
            .multiply(new BigInteger(String.valueOf(numero)));
        }else{
            return resultado;
        }        
      }    

}