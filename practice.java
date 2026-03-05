
    class BigCat{
        static String name="Lion";
        int age;
    }

    class Cat extends BigCat{
        String name;
        int age;
    
        Cat(){
            this("TOM",2);
        }
        Cat(String name,int age){
            this.name=name;
            this.age=age;
        }
        void show(){
            System.out.println(name);
            System.out.println(super.name);
        }
    }

 class Cheel{
   static String specie;
    static double size;
    static int age;
}

public class practice {
    public static void main(String[] args) {
        Cat c1=new Cat();
        c1.show();

         Cheel.specie="Golden Eagel";
         Cheel.age=50;
         Cheel.size=4;

         Cheel ch1=new Cheel();

         ch1.specie="Bald Eagle";

         System.out.println(Cheel.specie);
         System.out.println(ch1.specie);
    }
}


