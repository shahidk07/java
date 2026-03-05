    //Write a program to enter a string and a substring. You must print the number of times that the substring occurs in the given string. 

import java.util.Scanner;

public class exp_3_7 {


    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.println("Enter a String");
        String sentence=scn.nextLine();

        System.out.println("Enter the sub-string you want to check");
        String subString=scn.next();
        
        int m=sentence.length();
        int n=subString.length();

        int subStringcount=0;


                for(int i=0;i<=m-n;i++){
                    // i<=m because only loop has checked m-n elements there is no chance of getting a substring

                    int j=0;//subString iterator

                while(j<n && sentence.charAt(i+j)==subString.charAt(j)){

                    j++;   
            }

            if(j==n){
                subStringcount++;
                //increase the number of appearance of substring
            }

          
        }
        //Final peace after all the checking
        if(subStringcount>=1){
            System.out.println("\nThe number of appearance for the substring:"+subStringcount);
        }
        else{
            System.out.println("Substring not found");
        }
     
    
    }
}


