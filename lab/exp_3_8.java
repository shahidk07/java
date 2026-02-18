//WAP TO ADD TWO MATRICES

import java.util.Arrays;

public class exp_3_8 {
    public static void main(String[] args) {
        
        int matA[][]=
        {{1,2}
        ,{3,4}};

        int matB[][]=
        {{1,2},
        {3,4}};


        int m=matA.length; //rows
        int n=matA[0].length; //columns

        int matSum[][]=new int[m][n];

          for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matSum[i][j]=matA[i][j]+matB[i][j];
                System.out.print(matSum[i][j]+" ");
            }
            
            System.out.println();
          }
    }
}
