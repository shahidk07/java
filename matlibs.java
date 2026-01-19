import java.util.Scanner;


public class matlibs {
    public  static void main(String[]args){

 String noun1;
 String adjective1;
 String emotion;
 String verb1;

Scanner scn=new Scanner((System.in));

System.out.println("Enter a name/noun:");
noun1=scn.nextLine();


System.out.println("Enter an adjective:");
adjective1=scn.nextLine();


System.out.println("Enter an emotion:");
emotion=scn.nextLine();



System.out.println("Enter a verb:");
verb1=scn.nextLine();


System.out.println("Today i met "+noun1+" in college");
System.out.println("He/She was " +adjective1+ " ");
System.out.println("It was "+emotion + " to meet him/her");
System.out.println("But now i feel " +verb1 + ".");

    }
}
