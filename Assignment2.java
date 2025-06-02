abstract class Animal{
    abstract void sound();
  }
class Dog extends Animal{
    void sound(){
        System.out.println("The dog barks");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("The cat meows");
    }
}
public class Assignment2 {
      public static void main(String[] args) {
        Animal d = new Dog();
        Animal c = new Cat();
        d.sound();
        c.sound();
        
    }
    
}
