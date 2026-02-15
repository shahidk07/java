//Java array

import java.util.Arrays;
import java.util.Scanner;

public class exp_3_1 {
    public static void main(String[] args) {
        
        Scanner scn=new Scanner(System.in);
        int numbers[]=new int[2];
        System.out.println("ENTER NUMBER 1:");
        numbers[0]=scn.nextInt();

        System.out.println("ENTER NUMBER 2:");
        numbers[1]=scn.nextInt();
    int sum=numbers[0]+numbers[1];
    System.out.println("Sum::"+sum);
       scn.close();

    }
}
