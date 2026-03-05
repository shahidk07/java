import java.util.Scanner;

public class exp_2_1 {

    public static void main(String[] args) {
        int num;
        Scanner scn =new Scanner(System.in);

        System.err.println("Enter a number");
        num=scn.nextInt();
        if(num==0){
            System.out.println("ZERO");
        }
        else if(num>0 && num%2==0){
            System.out.println("Number is positive and even ");
        }
        else if(num>0 && num%2!=0){
            System.out.println("Number is positive and odd ");
        }
        else if(num<0 && num%2==0){
            System.out.println("Number is negative and even ");
        }
        else if(num>0 && num%2!=0){
            System.out.println("Number is negative and odd ");
        }
    }
}