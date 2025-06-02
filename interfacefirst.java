interface walkable {
    void walk();
}

interface runnable {
    void run();
}
public class interfacefirst {
    public void walk(){
        System.out.println("Human walks");
    }
    public void run(){
        System.out.println("Human runs");
    }
    public static void main(String[] args) {
        interfacefirst obj= new interfacefirst();
        obj.walk();
        obj.run();
      
    }
    
}
