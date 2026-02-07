//palindrome
import java.util.Scanner;
public class exp_2_5 {
    public static void main(String[] args) {
        String num;
        boolean isPalindrome=true;
        Scanner scn=new Scanner(System.in);

        System.out.println("Enter a number:");
        num=scn.next();
        int n=num.length();
        //[0,1,2,3,4,5]=6
        System.out.println("Length of this number is "+n);
        scn.close();
        for(int i=n-1;i>=0;i--){
            if(num.charAt(i)!=num.charAt(n-1-i)){
             isPalindrome=false;
            }
        }
        if(isPalindrome){
            System.out.println("The number "+num+" is 'a palindrome'");
        }
        else{
            System.out.println("The number " +num+ " is 'not a palindrome'");
        }
    }
}
