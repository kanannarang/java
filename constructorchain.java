class student{
    String firstName = "kanan";
    int age = 20;

    student(){
    System.out.println("Hello");
    }

    student(String firstName) {
        this();
        System.out.println("Namste");
    }

      student(String firstName , int age) {
        this(firstName);
        this.firstName = firstName;
        age =age;
       // System.out.println("Name = " + firstName +", "+  "Age = "+ age);

      }
 }




public class constructorchain {
    public static void main(String[] args) {
        
    
    student obj = new student("Kanan" , 20);
    System.out.println(obj.firstName);
    
}}
