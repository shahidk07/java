//Input a sentence and print words in a separate line

import java.util.Scanner;

public class exp_3_6 {


    public static void main(String[] args) {


        String sentence="Shahid Khan is a Student of UPES University";

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
