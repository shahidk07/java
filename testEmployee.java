 class employee {
    String fname;
    String lname;

    employee(String fname,String lname){
        this.fname=fname;
        this.lname=lname;
    }

    
    String getFirstname(){
        return fname;

    }
    String getLastname(){
        return lname;
    }

}

class contractEmployee extends employee{
    String department;
    String designation;
    float salary;

    contractEmployee(String fname,String lname){
        super(fname,lname);
    }

    void getFullName(){
        String fullname=fname+" "+lname;
        System.out.println(fullname);
    }

    String getDepartment(){
        return department;
    }

    void setDesign(String department,String designation,float salary){
        this.designation=designation;
        this.department=department;
        this.salary=salary;
    }
    void getDesign() {
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
}

class regularEmployee extends employee{
    String department;
    String designation;
    float salary;

    
    regularEmployee(String fname,String lname){
        super(fname,lname);
    }

    void getFullName(){
        String fullname=fname+" "+lname;
        System.out.println(fullname);
    }

    String getDepartment(){
        return department;
    }

    void setDesign(String department,String designation,float salary){
        this.designation=designation;
        this.department=department;
        this.salary=salary;
}
void getDesign() {
    System.out.println("Designation: " + designation);
    System.out.println("Salary: " + salary);
}
} 

 public class testEmployee{
    public static void main(String[] args) {
        contractEmployee CE=new contractEmployee("ASHOK", "SINHA");
        CE.setDesign("HEALTH SCIENCE", "CONTRACTOR", 200000);
        regularEmployee RE=new regularEmployee("Spongebob", "William");
        RE.setDesign("HEALTH SCIENCE","driver",30000);

       CE.getFullName();
        CE.getDesign();

        RE.getFullName();
        RE.getDesign();

    }
}