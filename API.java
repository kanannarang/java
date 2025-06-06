import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.stream.*;

public class API {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
     list.add(2);
     list.add(55);
     list.add(22);
     list.add(24);
     list.add(90);

     ArrayList<Integer> data = (ArrayList<Integer>) list.stream().filter(a->a%2==0).collect(Collectors.toList());
    // ArrayList<Integer> data = (ArrayList<Integer>) list.stream().map(a->a*2).collect(Collectors.toList());
    // map is used to modify
     System.out.println(data);
    } 
}
