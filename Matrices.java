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

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 4");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Imprimir la diagonal principal de una matriz 3x3.

        int[][] mCuatro = new int[3][3];
        int co = 1;
        for(int i = 0; i < mCuatro.length; i++){
            for(int j = 0; j < mCuatro[i].length; j++){
                if (i == 0 && j == 0) {
                    mCuatro[i][j] = co;
                    co++;
                }else if(i - j == 0){
                    mCuatro[i][j] = co;
                    co++;
                }else{
                    mCuatro[i][j] = 0;
                }

                System.out.print(mCuatro[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 5");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Imprimir la diagonal secundaria de una matriz 3x3.
    /*
        [0, 0, 3]  
        [0, 2, 0]  
        [1, 0, 0]     
    */
        int[][] mCinco = new int[3][3];
        int cou = 1;

        
        for(int i = 0; i < mCinco.length; i++){
            for(int j = 0; j < mCinco[i].length; j++){
                if(i == mCinco.length - j - 1){
                    mCinco[i][j] = mCinco.length - i;
                }
            
                System.out.print(mCinco[i][j] + " ");
            }
            System.out.println();
        }




    }


}