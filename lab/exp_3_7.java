    //Write a program to enter a string and a substring. You must print the number of times that the substring occurs in the given string. 

import java.util.Scanner;

public class exp_3_7 {


    public static void main(String[] args) {
        String sentence="Arthur Morgan is the main character of Read Dead Redemption 2 ";

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

