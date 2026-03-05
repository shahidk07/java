import java.util.Scanner;
public class exp_2_6 {
    public static void main(String[] args) {
        //factorial of a number n=n*1*n*2
        int num;

        int factorial=1;
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a number");
        num=scn.nextInt();

        for(int i=0;i<num;i++){
             factorial=factorial*(num-i);
        }
        System.out.println("The factorial of the number "+ num + " is "+factorial);
    }
}
