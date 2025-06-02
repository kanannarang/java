interface Client {
    void print();
    void show();
}
class Dev implements Client {
     public void print() {
        System.out.println("print the bill");
    }
    public void show(){
        System.out.println("show the menu");
    }
}
public class Interface {
    public static void main(String[] args) {
        Dev obj = new Dev();
        obj.print();
        obj.show();

    }
    
}
