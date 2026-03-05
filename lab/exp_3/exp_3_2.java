//reverse an array

import java.util.Scanner;
import java.util.Arrays;


public class exp_3_2 {
    public static void main(String[] args) {
        int theNums[]={1,2,3,4,5};
        int n=theNums.length;

        for(int i=0;i<n/2;i++){

            int temp=theNums[i];
            theNums[i]= theNums[n-i-1];
            theNums[n-i-1]=temp;

        }

        for(int i=0;i<n;i++){

            System.out.println(theNums[i]);
           

        }
    }
}
