public class ParameterizedConstructor {

    String name;
    String city;
    int id;

    public ParameterizedConstructor(int id,String name){
        this.id=id;
        this.name=name;
    }

    public static void main(String[] args) {
        ParameterizedConstructor s1=new ParameterizedConstructor(590001872,"Shahid");
        ParameterizedConstructor s2=new ParameterizedConstructor(590018773,"Ibrahim");
        

        System.out.println("Id of "+s1.name+" is "+s1.id+ "\nand id of "+s2.name+ " is "+ s2.id);
       

        
    }
    
}
