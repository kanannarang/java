import java.util.ArrayList;
import java.util.Collections;



public class List {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("khushi");
       list.add("kanan");
       list.add("aditi");

       Collections.sort(list,(a,b)-> a.compareTo(b));
       System.out.println(list);
    }
    
}
