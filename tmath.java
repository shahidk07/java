import java.util.Scanner;

public class tmath {
    public static void main(String[] args) {
        // System.out.println(Math.PI);
        // System.out.println(Math.E);
        // double result;
        // result= Math.pow(2,3);
        // result=Math.abs(-80.99);
        // result=Math.sqrt(9);
        // result=Math.round(3.94);
        // result=Math.ceil(9.1);
        // result=Math.floor(9.1);
        // result=Math.max(40,-1);
        // result=Math.min(40,-1);
        // System.out.println(result);


        //HYPOTENUSE c=Math.sqrt(a^2,b^2);



        // int a=3;
        // int b=4;
        // double c=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        // System.out.println("H,ypotenuse is: "+c);


        // volume of a sphere=4/3*pi*r^3
        Scanner scn= new Scanner((System.in));
        
        double r;
        double vol;
        System.out.println("Enter the radius of sphere");
      r=scn.nextDouble();

        vol=(4.0/3.0) *Math.PI*(Math.pow(r,3));

        System.out.println("Volume of sphere is :"+vol);
     scn.close();
     
    }
}

