package pe.edu.upeu.arreglos;

public class EjemploVectores {
    
    public static void conceptosVectores () {
       //vector variable
        int[] vector;
        int[] vectorx;
        //Dando tamaño al vector
        vector=new int[10];
        //asigandovalores al vector
        vector[0]=20;
        vector[9]=10;
        System.out.println(vector[0]);
        //  vector[10]=5;     este seria error, ya que seria 11 por que el indice incia en 0
        //asignando valores directo al vector
        vector[0]=40;
        int[] vA={30,2,3,4,5,6,7,8,9,10};
        System.out.println(vA[0]);  //imprimir el valor que deseamos del vector vA
        // como saber el tamaño de un vector
        System.out.println("tamaño del vector vA= "+vA.length);
    }

public static void multiplicar() {
    int[] vA={1,2,3,4,5,6,7,8,9,10};
    int[] vB={1,2,3,4,5,6,7,8,9,10};

    for (int i = 0; i < vB.length; i++) {
        for (int j = 0; j < vB.length; j++) {
            System.out.println(vA[i]+" * "+vB[j]+" ="+(vA[i]*vB[j]));
        }
        System.out.println("");
    }
    
}

public static void invertirvector() {

    int[] a={1,2,3,4,5};
    int[] b=new int[a.length];

    for (int i = 0; i < b.length; i++) {
        b[i]=a[(b.length-1)-i];
    }
    for (int i = 0; i < b.length; i++) {
        System.out.println("V["+i+"]"+b[i]);
    };  
}


    public static void main(String[] args) {
        System.out.println("Inverti vector");
        //conceptosVectores();
        //multiplicar();
        invertirvector();
    }
}
