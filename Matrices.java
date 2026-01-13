import java.util.Arrays;

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

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 6");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Suma de todos los elementos de una matriz 3x3.
        //Muestra el resultado final.

        int[][] mSeis = {
            {1, 1, 1},
            {1, 1, 1},
            {1, 1, 1}
        };

        int s = 0;

        for(int i = 0; i < mSeis.length; i++){
            for(int j = 0; j < mSeis[i].length; j++){
                s += mSeis[i][j];
            }
        }

        System.out.println(s);



        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 7");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Promedio de todos los elementos de una matriz 3x3.
        //Devuelve un número decimal.

        double[][] mSiete = {
            {1.0, 2.0, 3.0},
            {2.0, 3.0, 4.0},
            {3.0, 4.0, 5.0}
        };

        double su = 0.0;
        double r = 0.0;
        int coun = 0;
        for(int i = 0; i < mSiete.length; i++){
            for(int j = 0; j < mSiete[i].length; j++){
                su += mSiete[i][j];
                coun++;
            }
        }

        r = su / coun;

        System.out.println(r);


        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 8");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Número mayor en una matriz 3x3.
        //Encuentra y muestra el valor más grande.

        int[][] mOcho = {
            {1223, 2, 3},
            {23, 4, 5},
            {1, 9, 456768}
        };

        int a = mOcho[0][0];

        for(int i = 0; i < mOcho.length; i++){
            for(int j = 0; j < mOcho[i].length; j++){
                if (a < mOcho[i][j]) {
                    a = mOcho[i][j];
                }
            }
        }

        System.out.println(a);

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 9");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Número menor en una matriz 3x3.
        //Encuentra y muestra el valor más pequeño.

        int[][] mNueve = {
            {0, 21, -9},
            {1, 23, 4},
            {9, 90, 89}
        };

        int au = mNueve[0][0];

        for(int i = 0; i < mNueve.length; i++){
            for(int j = 0; j < mNueve[i].length; j++){
                if (au > mNueve[i][j]) {
                    au = mNueve[i][j];
                }
            }
        }

        System.out.println(au);


        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 10");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Buscar el mayor y menor y colocarlos en un array


        int[][] mDiez = {
            {12, 2 , 3},
            {-9, 9, 2}
        };

        int max =  mDiez[0][0];

        int min = mDiez[0][0];

        int[] aux = new int[2];

        for(int i = 0; i < mDiez.length; i++){
            for(int j = 0; j < mDiez[i].length; j++){
                if (max < mDiez[i][j]) {
                    max = mDiez[i][j];
                }

                if(min > mDiez[i][j]){
                    min = mDiez[i][j];
                }
            }
        }


        aux[0] = min;
        aux[1] = max;

        System.out.println(Arrays.toString(aux));



    }
}