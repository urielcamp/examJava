public class Matrices{
    public static void main(String[] args) {

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("MATRICES EXAMEN");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        System.out.println("EJER 1 ");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        

        //1. Crear una matriz 3x3 y mostrarla.
        //Declara una matriz de enteros 3x3, asigna valores manualmente y muéstrala por pantalla.


        int[][] mUno = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };


        for(int i = 0; i < mUno.length; i++){
            for(int j = 0; j < mUno[i].length; j++){
                System.out.print(mUno[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 2");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();


        //2. Matriz 2x4 con todos los valores en 1.
        //Usa bucles para llenarla y mostrarla.

        int[][] mDos = new int[2][4];

        for(int i = 0; i < mDos.length; i++){
            for(int j = 0; j < mDos[i].length; j++){
                mDos[i][j] = 1;
                System.out.print(mDos[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 3");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Matriz 4x4 con números del 1 al 16.
        //Rellena secuencialmente e imprime.

        int[][] mTres = new int[4][4];
        int c = 1;

        for(int i = 0; i < mTres.length; i++){
            for(int j = 0; j < mTres[i].length; j++){
                mTres[i][j] = c;
                c++;
                System.out.print(mTres[i][j] + " ");
            }
            System.out.println();
        }



    }


}