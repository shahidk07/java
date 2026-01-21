public class printf {
    public static void main(String[] args) {
        String name="Shahid";
    char fletter='S';
double height =169;
boolean isEmployed=false;
System.out.printf("Hello %s \n",name);  
System.out.printf("Your name starts with %c\n",fletter);
System.out.printf("Your height is %f cm \n",height);
System.out.printf("Employeed:%b \n",isEmployed);


System.out.printf("%s is %f cm tall\n",name,height);


//precision

double price1=90.99;
double price2 =88.868;
double price3=-22.32;

// System.out.printf("%, .1f \n",price1);
// System.out.printf("% .2f \n",price2);
// System.out.printf("% .3f \n",price3);



int id1=1;
int id2=11;
int id3=111;
int id4=1111;

//padding with 0 ,padding with spaces
System.out.printf("%-4d\n",id1);
System.out.printf("%-4d\n",id2);
System.out.printf("%-4d\n",id3);
System.out.printf("%-4d\n",id4);
}
}

//flags

