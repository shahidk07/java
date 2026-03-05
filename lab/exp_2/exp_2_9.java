//enter 10 numbers and find out how many are positive and negative

import java.util.Scanner;

public class exp_2_9 {
    public static void main(String[] args) {
        
        Scanner scn=new Scanner(System.in);
        int num,positive=0,negative=0;
        int i=0;

    while ( i<10) {
        System.out.println("Enter number "+(i+1)+"::");
        num=scn.nextInt();
        

        if(num==0||num>0){
            positive+=1;
        }
        else{
            negative+=1;
        }
        i++;

        }

    System.out.println("Total Positive numbers::"+positive);
    System.out.println("Total negative numbers::"+negative);

    }
}
