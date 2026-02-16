//count the number of Vowels in each string

import java.util.Scanner;

public class exp_3_5 {


    public static void main(String[] args) {
        String sentence[]={"Shahid","Khan","is","a","Student"};

        for(String word:sentence){
            int countVowel=0;
            for(int i=0;i<word.length();i++){
                char ch=word.charAt(i);
                ch=Character.toLowerCase(ch);
              
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    countVowel++;
                }
            }
            System.out.println("The number of vowels in the word '"+word+"' is/are:"+countVowel);

        }
    }
}
