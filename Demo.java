interface A{
    void display();
}
interface B {
     void display();   
}
public class Demo {
    public void display(){
        System.out.println("this is the concept of interface");
    }
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.display();
    }
}
