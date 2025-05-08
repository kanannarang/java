// OVERRIDING
class Vehicle{
    void run(){
    System.out.println("Vehicle chalti hai");
    }}
    
    class Bike extends Vehicle{
        void run(){
            System.out.println("Bike bhi chalti hai");
        }
    }
   


public class Overriding {
    public static void main(String[] args) {
        Vehicle obj1 = new Bike();
        obj1.run();
      
    }
}
