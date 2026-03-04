public class Bird {
    String name;

    Bird(String name){
        this.name=name;
        System.out.print(name +", ");
    }

public static void main(String[] args) {
    Bird b1=new Bird("Eagle");
    Bird b2=new Bird("Owl");
    Bird b3=new Bird("Bat");
}


}
