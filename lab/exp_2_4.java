import java.util.Scanner;
public class exp_2_4 {
    public static void main(String[] args) {
//         int num;
//         Scanner scn=new Scanner(System.in);
//         System.out.println("Enter a number:");
//         num=scn.nextInt();
//         int sum=0;

//         int temp=num;
//         while(temp!=0){
//            int digit =temp%10;
//            sum+=digit;
//            temp=temp/10;
//         }
// System.out.println("The sum of digits is "+sum);
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
