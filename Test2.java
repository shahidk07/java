interface Myin{
    void show();
}

public class Test2{

    public static void main(String[] args) {
        Myin obj=()->System.out.println("hello");
        obj.show();
       
      
    }
}