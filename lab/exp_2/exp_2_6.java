import java.util.Scanner;

public class exp_2_6 {
    public static void main(String[] args) {

        int num;
        int factorial = 1;

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = scn.nextInt();

        for(int i = 1; i <= num; i++){
            factorial = factorial * i;
        }

        System.out.println("The factorial of the number " + num + " is " + factorial);
    }
}