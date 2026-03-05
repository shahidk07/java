import java.util.Scanner;
public class exp_2_2 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int age;
        String name;
        int choice;

        System.out.print("Please enter you name::");
        name=scn.next();

        System.out.println("Enter your choice::");
        System.out.println("1:You are older than 18");
        System.out.println("2:You are younger than 18");
        choice=scn.nextInt();  

        System.out.println("Welcome "+name);

        switch(choice){
        case 1:
            System.out.println("You are an adult");
            break;
        case 2:
            System.out.println("You are not an adult");
            break;
        default:
            System.out.println("Invalid choice !");
        }


    }
}
