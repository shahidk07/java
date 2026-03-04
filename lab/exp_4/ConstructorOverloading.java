public class ConstructorOverloading {
    int i;
    int j;

    ConstructorOverloading(int i){
        this.i=i;
            System.out.println("constructor 1 used");

    }

    ConstructorOverloading(int i,int j){
        this.i=i;
        this.j=j;

            System.out.println("constructor 2 used ");
    }

    public static void main(String[] args) {
        
        ConstructorOverloading c1=new ConstructorOverloading(4);
        ConstructorOverloading c2=new ConstructorOverloading(4,6);
    }
    
}
