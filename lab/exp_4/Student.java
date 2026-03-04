public class Student {

    String name;
    String city;
    int age;

    void displayStudent(String name,String city,int age){
        System.out.println(name+" lives in " +city+" city and is "+age+" years old");
    }
    public static void main(String[] args) {
        Student s1=new Student();
        s1.displayStudent("Shahid", "Allahabad", 19);
        Student s2=new Student();
        s2.displayStudent("Ibrahim", "Mecca", 60);

        
    }
    
}
