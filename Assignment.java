abstract class Shape {
abstract void area(double a,double b);
}

class Circle extends Shape{
    void area(double r,double pi){
        double circleArea = (pi)*r*r;
        System.out.println(circleArea);
   }    
}
class Rectangle extends Shape{
    void area(double l,double b) {
    System.out.println(l*b);   
    }
}
public class Assignment {
     public static void main(String[] args) {
    Shape c = new Circle();
    Shape rec = new Rectangle();
    c.area(22.08, 3.14);
    rec.area(22.08, 14.09);
    
}
    
}
