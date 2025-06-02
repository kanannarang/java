import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age,String name ){
       this.age = age;
       this.name = name;
    }
      public  String toString(){
        return age+ " " + name;
    }
    public  int compareTo(Student s){
        return this.age-s.age;

    }
}
public class Compare {
    public static void main(String[] args) {
        ArrayList<Student>list = new ArrayList<>();
        list.add(new Student(20, "kanan"));
        list.add(new Student(19, "mahi"));
        list.add(new Student(21, "khushi"));

        Collections.sort(list);
        for (Student s :list){
            System.out.println(s.toString());
        }
    }
    
}
