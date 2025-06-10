import java.util.ArrayList;
import java.util.stream.*;

public class API2 {
      public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
     list.add(2);
     list.add(55);
     list.add(22);
     list.add(24);
     list.add(90);
     int sum =list.stream().reduce(0,(a,b)-> a+b);
     System.out.println(sum);


}}
