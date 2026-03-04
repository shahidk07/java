public class Account {
    String Acct_Name;
    double Acct_Balance;
    // int Acct_No;
    // String Acct_Address;

    Account(double Acct_Balance,String Acct_Name){
        this.Acct_Name=Acct_Name;
        this.Acct_Balance=Acct_Balance;
        
    }

    void Credit(double amount){
        Acct_Balance=Acct_Balance+amount;
        System.out.print("New Balance after Credit:" );
        GetBalance();
    }

    void Debit(double amount){
        if(amount>Acct_Balance){
            System.out.println("Transaction failed! You donot have this much money!!");
        }
        else{
            Acct_Balance=Acct_Balance-amount;
            System.out.print("New Balance after Debit:" );
            GetBalance();
        }
    }

    void GetBalance(){
        System.out.println(Acct_Balance);
    }

    public static void main(String[] args) {
        Account a1=new Account(22, "Shahid");
        a1.GetBalance();
        a1.Credit(100);
        a1.GetBalance();
        a1.Debit(50);
        a1.GetBalance();
    }

   

}




// int Acct_No;
//         String Acct_Address;