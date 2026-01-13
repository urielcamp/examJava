import java.util.Arrays;

public class Series {
    public static void main(String[] args) {
        
        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("SERIES EXAMEN");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();


        
        System.out.println("EJER 1 ");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        

        //Completar la serie padovan( n )
        //P ( n ) = P(n-2) + P(n-3)

        /*
        Se debe devolver un array con los terminos de la serie solicitada, 
        en el caso de n=10 se debe devolver 1 1 1 2 2 3 4 5 7 9 
        en caso que n sea menor o igual a cero se debe devolver el array vacio.
         */

        int n = 10;
        int[] padovan = new int[n];

        if (n <= 0) {
            padovan = new int[0];
        }

        padovan[0] = padovan[1] = padovan[2] = 1;

        for(int i = 3; i < padovan.length; i++){
            padovan[i] = padovan[i - 2] + padovan[i - 3];
        }

        System.out.println(Arrays.toString(padovan));

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 2");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Fibonacci es una secuencia donde cada número es la suma de los dos anteriores.
        //Ejemplo: 0, 1, 1, 2, 3, 5, 8, 13...
        
        int nu = 10;
        int[] fibonacci = new int[nu];

        if (nu <= 0) {
            fibonacci = new int[0];
        }

        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for(int i = 2; i < fibonacci.length; i++){
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        System.out.println(Arrays.toString(fibonacci));

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 3");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();


        //Generar una serie que comienza en 5 y suma 4 en cada paso (5, 9, 13...).

        int num = 10;
        int[] serieA = new int[num];

        if (num <= 0) {
            serieA = new int[0];
        }

        serieA[0] = 5;

        for(int i = 1; i < serieA.length; i++){
            serieA[i] = serieA[i-1] + 4;
        }

        System.out.println(Arrays.toString(serieA));


        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 3");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //factorial de un numero

        int numb = 5;
        int factorial = 1;

        for(int i = 1; i <= numb; i++){
            
            factorial *= i;
        }

        System.out.println(factorial);


    }
}
