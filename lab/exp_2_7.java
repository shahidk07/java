//fibonacci series

import java.util.Scanner;
public class exp_2_7 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=scn.nextInt();

        int tail=0; 
        int head=1;

        System.out.println("Your Fibonnaci Series is::\n");
        System.out.print(tail+" "+ head + " ");

        for(int i=0;i<n;i++){
            int Sum=tail+head;
            System.out.print(Sum + " ");
            tail=head;
            head=Sum;

        }
    }
}
