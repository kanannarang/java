// OVERRIDING
class Vehicle{
    void run(){
    System.out.println("Vehicle starts");
    }}
    
    class Bike extends Vehicle{
        void run(){
            System.out.println("Bike starts");
        }
    }
public class Overriding {
     public static void main(String[] args) {
        Vehicle obj1 = new Bike();
        obj1.run();
      
    }
}
