class Teacher {
    String name = "kanan";
    void sum(int a,int b) {
        System.out.println(a+b);
    }
    
}
class Coaching {
    void add(double a,double b){
        System.out.println(a+b);
    }
    }

 public class student {
    public static void main(String[] args) {
        Teacher obj1= new Teacher();
        Teacher obj2 = new Teacher();
        obj1.sum(22,22);
        Coaching obj = new Coaching();
        obj.add(22.8, 33.6);
    }
}
