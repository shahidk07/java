
class Employee {
    StringBuffer name;
    int age;
    Employee(StringBuffer n, int a) {
        name = n;
        age = a;
    }
    
    Employee(Employee e){
        name=e.name;
        age=e.age;
    }

    public static void main(String[] args){

        //original copy
        StringBuffer sb=new StringBuffer("Shahid");
        Employee emp1=new Employee(sb,20);
        
        //creating a shallow copy
        Employee emp2=new Employee(emp1);
        
        emp2.name.append("a");


        System.out.println("Original Copy");
        System.out.print(emp1.name +", ");
        System.out.print(emp1.age +"\n\n");
        
        System.out.println("Shallow copy");
        System.out.print(emp2.name +", ");
        System.out.print(emp2.age +"\n");
        }
    
}