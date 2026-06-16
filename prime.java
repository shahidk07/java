import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count=count+1;
            }
        }
        if(count==2){
            System.out.println("the number is prime");
        }
            else{
                System.out.println("the number is not prime");
            }
    }
    
}

