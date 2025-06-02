interface Vehicle {
    void start();
}

public class Car implements Vehicle {
    public void start(){
        System.out.println("Vehicle starts");
    }
    public static void main(String[] args) {
        Car obj = new Car();
        obj.start();
    }
    
}
