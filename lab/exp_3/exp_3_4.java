//count the number of capital letters in a string

import java.util.Scanner;

public class exp_3_4 {


    public static void main(String[] args) {
        String word="ShaHiD";
        int countCap=0;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            //comparing with ASCI VALUES
            if(ch>='A' && ch<='Z'){
                countCap++;
            }
        }
        System.out.println("The number of capital letters in the word "+word+" is/are:"+countCap);
    }
}
