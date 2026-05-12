//static nested class-you don't need outer class obj for obj creation,we cannot access non static member of the outer class 
//inner member class -a class declared inside another class without the static keyword
//inner local class
//anonymous class

// public class Animal {
//     static String name;

//      class Cat {
//         void speak(){
//             class meow{
//                 void meow(){
//                     System.out.println("meow");
//                 }
//             }
//         }
//     }

//     public static void main(String[] args) {
//       Cat c=new Cat();
      
//     }
// }

// ClassName obj=new Classname(){

// }

interface hello{
    void Sayhello();
}

public class test{
    public static void main(String[] args) {
        hello h=new hello(){
            public void Sayhello(){
                System.out.println("hello");
            }
        };
        h.Sayhello();

    }
}