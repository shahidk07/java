class Product{
    String name;
    double price;

    /*
    constructor runs only once when you create a new object using new
     this refers to current object of the class
    */
   
     Product(String name,double price){
     this.name=name;
     this.price=price;

     }
    }

public class shopping {
    public static void main(String[] args) {
        Product[] inventory ={
        new Product("Laptop", 999.9),
        new Product("Smartphone", 500),
        new Product("Headphone", 89)
        };

        for(Product p: inventory ){
            System.out.println(p.name + ": $" + p.price);
        }
        System.out.println("Choose the product you wanna add to cart");
    }
}
