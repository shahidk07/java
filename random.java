import java.util.Random;

//we use public because jvm is outside of the specific class it needs public permission to reach in and start the program.
public class random {
   public  static void main(String[] args) 
//    String[] args - it is an array of strings. 
   {
        

        Random random =new Random();
// so nextInt here selects one numbers from the billions of possibilities and makes sure it fits into Int 8Byte space

        int number =random.nextInt(1,1);
        System.out.println(number);
    }
}
