abstract class Animal{
    abstract void sound();

}

class Dog extends Animal{
    void sound(){
        System.out.println("Bark");
    }
}

class Demo{
    public static void main(String[] args) {
        Dog d=new Dog();
        d.sound();
    }
}