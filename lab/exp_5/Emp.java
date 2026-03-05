class Employee {
    String firstName, lastName;

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }
}

class ContractEmployee extends Employee {
    String department, designation;

    void displayFullName() {
        System.out.println(firstName + " " + lastName);
    }

    void setDetails(String dept, String desig) {
        department = dept;
        designation = desig;
    }

    void getDepartment() {
        System.out.println("Dept: " + department);
    }

    void getDesig() {
        System.out.println("Desig: " + designation);
    }
}

class RegularEmployee extends ContractEmployee { }

public class Emp {
    public static void main(String[] args) {

        RegularEmployee emp = new RegularEmployee();

        // Setting inherited variables
        emp.firstName = "Shahid";
        emp.lastName = "Khan";

        // Setting department & designation
        emp.setDetails("IT", "Software Developer");

        // Displaying data
        emp.displayFullName();
        emp.getDepartment();
        emp.getDesig();
    }
}