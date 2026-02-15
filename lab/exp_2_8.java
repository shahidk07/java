// a program that keeps reading numbers from users until he types 0 and find sum, average ,min and max
import java.util.Scanner;
import java.util.ArrayList;
public class exp_2_8 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int num,count=0,min,max,sum=0;double avg=0;
        max=Integer.MIN_VALUE;
        min=Integer.MAX_VALUE;

        
        do{
            System.out.println("Enter a number (Enter 0 to exit)\n");
                num=scn.nextInt();
            if(num!=0){
                sum+=num;
                count+=1;
                avg=sum/count;

                if(num>max){
                    max=num;
                }
                if(num<min){
                    min=num;
                }
            }
        }
        while (num!=0);
   


        System.out.println("Sum::"+sum);
        System.out.println("Average::"+avg);
        System.out.println("Maximum ::"+max);
        System.out.println("Minimum ::"+min);
    }
}
