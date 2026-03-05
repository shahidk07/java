//matrix multiplication
import java.util.Arrays;
import java.util.Scanner;


public class exp_3_8_b {
    public static void main(String[] args) {
        int matA[][]={{1,2},
                        {2,1}};

        int matB[][]={{1,2},
                      {2,1}};

         //columns of a must be equal to rows of b
        int i=matA.length;//rows
        int j=matA[0].length;

        int a=matB.length;//rows
        int b=matB[0].length;//column

        int matProd[][]=new int[i][b];
                

        if(j!=a)
        {
            System.out.println("Matrices dimentions does not support multiplication");
        }
        else{
            System.out.println("ok");
        }

        for(int m=0;m<b;m++){
        {
            for(int n=0;n<i;i++){
                {
                    
                }
            }
        }
        }

    }
}
