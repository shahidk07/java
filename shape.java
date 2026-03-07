// method overriding
public  class shape {
    double area;
     void CalculateArea(){
        System.out.println("Calculating area....");
     };

     class circle extends shape{
        double radius;
        circle(double radius){
            this.radius=radius;
        }
         void CalculateArea(){
            area=3.14f*radius*radius;
            System.out.println("Area of this circle is:"+area);
            
        }
    }

     class rectangle extends shape{
        double length,breadth;
        rectangle(double length,double breadth){
            this.length=length;
            this.breadth=breadth;

        }
         void CalculateArea(){
            area=length*breadth;
            System.out.println("Area of this rectangle is "+area);
            
        }
    }
     class triangle extends shape{
        double base,height;
        triangle(double base,double height){
            this.base=base;
            this.height=height;
        }
         void CalculateArea(){
            area=0.5f*base*height;
            System.out.println("Area of this triangle is "+area);
            
        }
    }
    public static void main(String[] args) {
        shape s=new shape();
        circle c1=s.new circle(5);
        triangle t1=s.new triangle(2, 5);
        rectangle r1=s.new rectangle(3, 5);
        c1.CalculateArea();
        t1.CalculateArea();
        r1.CalculateArea();
    }
}
