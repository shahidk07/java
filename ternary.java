import java.util.Scanner;
public class ternary {

    public static void main(String[] args) {
        //ternary operator

        // int score=55;
        // String passOrFail=(score>=60)?"PASS":"FAIL";
        // System.out.println(passOrFail);



        //TEMPERATURE CONVERSION
        Scanner scanner=new Scanner(System.in);
          
        double temp;
        double newtemp;

        String unit;

        System.out.print("Enter the temperature: ");
        temp=scanner.nextDouble();

        System.out.println("Convert to celsius or fahrenheit (C or F)?: ");
        unit=scanner.next().toUpperCase();

       newtemp=(unit.equals("C") ? (temp-32)*5/9:temp*5/9+32); 

       System.out.println(newtemp);
        scanner.close();


    }
}