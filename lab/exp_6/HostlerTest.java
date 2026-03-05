interface StudentFee {
    double getAmount();
    String getFirstName();
    String getLastName();
    String getAddress();
    String getContact();
}

class Hostler implements StudentFee {
    public double getAmount() { return 50000; }
    public String getFirstName() { return "Rahul"; }
    public String getLastName() { return "Sharma"; }
    public String getAddress() { return "Delhi"; }
    public String getContact() { return "9999999999"; }
}

class NonHostler implements StudentFee {
    public double getAmount() { return 30000; }
    public String getFirstName() { return "Priya"; }
    public String getLastName() { return "Singh"; }
    public String getAddress() { return "Mumbai"; }
    public String getContact() { return "8888888888"; }
}

public class HostlerTest {
    public static void main(String[] args) {
        StudentFee s1 = new Hostler();
        StudentFee s2 = new NonHostler();

        System.out.println(s1.getFirstName() + " Fee: " + s1.getAmount());
        System.out.println(s2.getFirstName() + " Fee: " + s2.getAmount());
    }
}