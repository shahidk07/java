//Input a sentence and print words in a separate line

import java.util.Scanner;

public class exp_3_6 {


    public static void main(String[] args) {
        System.out.println("Enter a Sentence:");
        Scanner scn=new Scanner(System.in);
        String sentence=scn.nextLine();
        
        System.out.println("\nThe Sentence:'"+sentence+"' after broken into words::\n");
        for(int i=0;i<sentence.length();i++){
            char ch=sentence.charAt(i);
            if(ch==' '){
                System.out.println();
             }
                else{
                    System.out.print(ch);
                }
        }
        System.out.println();
    }
}
