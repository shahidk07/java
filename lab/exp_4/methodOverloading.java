public class methodOverloading {
    int id;
    String name;
    int age;
    String city;
    Boolean isStudent;

    void info(int id,String name,Boolean isStudent){
        System.out.println("This is method1");
    }

    void info(int age,String city){
        System.out.println("This is method2");
    }

    public static void main(String[] args) {
        methodOverloading s1=new methodOverloading();

        s1.info(40000,"Shahid",true);
        s1.info(19,"Anjaan mohalla");
    }
}
