import java.util.Scanner; //tool used for accepting user input


//container for the code
public class j2{
        /*
        Entry point of the code ,the computer starts execution from this line */
    public static void main(String[]args){

// System.in tells the scanner to listen to the standard input (your keyboard).
        Scanner scn=new Scanner((System.in));

        System.out.println("Please enter your age");
        int age=scn.nextInt();

        System.out.println("Enter your name");

       //pauses the program and waits for user to type input
        String name=scn.nextLine();
        //nextLine includes spaces will next does not
System.out.println("What is your gpa?");
double gpa=scn.nextDouble();

System.out.println("Are you a student?");
boolean isStudent=scn.nextBoolean();

        System.out.println("Hello " +name);
        System.out.println("You are "+age +" Years old.");
        System.out.println("and you have score gpa of "+gpa);

        if(isStudent){
            System.out.println("You are enrolled as student");
        }
        else{
            System.out.println("You are not enrolled as student");
        }
        //closes the scanner



        

    
        scn.close();
    }
}