package pe.edu.upeu.arreglos;

public class Transformadas {
 
    public void contarCerosPostNegMatriz() {
        int cantNeg=0, cantPost=0, cantCeros=0;
        int[][] matrizT={
            {5,	6,	0},
            {5,	-6,	2},
            {0,	12,	-2},
            {0,	6,	2}
        };
        for (int i = 0; i < matrizT.length; i++) {
            for (int j = 0; j < matrizT[0].length; j++) {
                if (matrizT[i][j]<0) {
                    cantNeg++;
                }else if(matrizT[i][j]==0){
                    cantCeros++;
                }else{
                    cantPost++;
                }
            }
        }  
        System.out.println("Cantidad ceros:"+cantCeros);      
        System.out.println("Cantidad positivos:"+cantPost);      
        System.out.println("Cantidad Negativos:"+cantNeg);      
    }

    public void transformada1(int dimension, int valorElem) {
        String[][] matriz=new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[0].length; c++) {     
                if (c<dimension-f) {
                    matriz[f][c]=""+(valorElem+(f+c)*(f+c+1)/2 + f); 
                }else{
                    matriz[f][c]="";
                }                
            }
        }
        imprimirMatriz(matriz);
    }

    public void transformada2(int dimension, int valorElem) {
        String[][] matriz=new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[0].length; c++) {     
                if (c<dimension-f) {
                    matriz[f][c]=""+(valorElem+(f+c)*(f+c+1)/2 + c); 
                }else{
                    matriz[f][c]="";
                }                
            }
        }
        imprimirMatriz(matriz);
    }    

    

    public void imprimirMatriz(Object[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("");
        }
    }

    public void imprimirMatrizCadena(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(matriz[i][j]!=null && !matriz[i][j].equals("")){ 
                System.out.print(matriz[i][j]+"\t");
                }else{
                System.out.print("\t");
                }
            }
            System.out.println("");
        }
    }


    
    public void transformada05(int dimen, int valInit) {
        String [][] matriz=new String[dimen][dimen];  //i=filas,    j=columnas
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= i; j++) {
                matriz[i][(dimen-1)-j]=""+valInit;
                valInit++;
            }  
        }   
        imprimirMatrizCadena(matriz);
    }

    public void transformada13(int dimen, int valInit) {
        String [][] matriz=new String[dimen][dimen];  //i=filas,    j=columnas
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i <= (dimen-1)-j; i++) {
                matriz[i][j]=""+valInit;
                valInit++;
            }  
        }   
        imprimirMatrizCadena(matriz);
    }

    public void transformada21(int dimen, int valInit) {
        String [][] matriz=new String[dimen][dimen];  //i=filas,    j=columnas
        for (int j = 0; j < matriz[0].length; j++) {
            if(j%2==0){ 
            for (int i = 0; i < matriz.length; i++) {
                matriz[i][j]=""+valInit;
                valInit++;
            }  
            }else{
                for (int i = matriz.length-1;i>=0 ; i--) {
                    matriz[i][j]=""+valInit;
                    valInit++;
            }
        }   
     
    }
    imprimirMatrizCadena(matriz);
}




    public static void main(String[] args) {
        Transformadas tObj=new Transformadas();
        /*tObj.contarCerosPostNegMatriz();
        tObj.transformada1(5, 0);
        tObj.transformada2(5,0);
        System.out.println("");
        tObj.transformada05(5, 0);
        tObj.transformada13(5, 0);*/
        tObj.transformada21(5, 0);
    }
}
