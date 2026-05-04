import java.util.Scanner;
public class exp_2_4 {
    public static void main(String[] args) {
int sum=0;
Scanner scn=new Scanner(System.in);
System.out.println("Enter a number:");
String num=scn.next();

for(int i=0;i<num.length();i++){
    int digit=num.charAt(i) -'0';
    sum+=digit;
}
System.out.println("The sum of digits is "+ sum);
    }
   
}
