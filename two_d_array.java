import java.util.Arrays;


public class two_d_array{

 public static void main(String[] args) {
    
/*
String[] fruits ={"Apple","Oragne","Banana"};
String[] vegs={"Onion","Potato","Chilli"};
String[] meat={"Chicken","Beef","Mutton","Fish"};

String [][] food={fruits,vegs,meat};
                or
*/

String[][] food={{"Apple","Oragne","Banana"},{"Onion","Potato","Chilli"},{"Chicken","Beef","Mutton","Fish"}};


    //  System.out.println(Arrays.deepToString(food));
    //or

    for(String[] f:food ){
    for(String a:f){
        System.out.print(a +", ");
    }
    System.out.println();

    }
//accessing the elements
food[0][0]="Pineapple";
food[1][2]="Ladyfinger";
System.out.println(Arrays.deepToString(food));


//an array that resembles telephone keypad

char [][] tp={{'1','2','3'},{'4','5','6'},{'7','8','9'},{'*','0','#'}};

for(char[]n:tp){
   for(char a:n){
       System.out.print(a + " ");
   }
   System.out.println();
}

 };


}
