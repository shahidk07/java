//prime number
import java.util.Scanner;
public class exp_2_3 {
    public static void main(String[] args) {
        int num;
    Scanner scn=new Scanner(System.in);
        System.out.print("Please enter a number:");
        num=scn.nextInt();
        boolean isPrime=true;

        if(num<=0 ||num==1){
          isPrime=false;
        }
        else{
            for(int i=2;i<num/2;i++){
                if(num%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println("The number is a prime number");
        }
        else{
            System.out.println("Not a prime number");
        }

        
    }
}