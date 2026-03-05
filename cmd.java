//passing command line arguments

public class cmd {
    public static void main(String[] args) {
        if(args.length==1){
            String name=args[0];
            System.out.println("Welcome "+name );
        }
        
        else{
            System.out.println("Invalid cmd args passed!");
        }
    }
}
