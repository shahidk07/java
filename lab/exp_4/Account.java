import java.util.Scanner;

public class Account {
    String Acct_Name;
    double Acct_Balance;

    Account(double Acct_Balance, String Acct_Name) {
        this.Acct_Name = Acct_Name;
        this.Acct_Balance = Acct_Balance;
    }

    void Credit(double amount) {
        Acct_Balance = Acct_Balance + amount;
        System.out.print("New Balance after Credit: ");
        GetBalance();
    }

    void Debit(double amount) {
        if (amount > Acct_Balance) {
            System.out.println("Transaction failed! You do not have this much money!!");
        } else {
            Acct_Balance = Acct_Balance - amount;
            System.out.print("New Balance after Debit: ");
            GetBalance();
        }
    }

    void GetBalance() {
        System.out.println(Acct_Balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        Account a1 = new Account(balance, name);

        System.out.print("\nEnter amount to Credit: ");
        double creditAmt = sc.nextDouble();
        a1.Credit(creditAmt);

        System.out.print("\nEnter amount to Debit: ");
        double debitAmt = sc.nextDouble();
        a1.Debit(debitAmt);

        System.out.print("\nFinal Balance: ");
        a1.GetBalance();

        sc.close();
    }
}