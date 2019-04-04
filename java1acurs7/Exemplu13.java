import java.util.*;

public class Exemplu13 {

    public static void main(String [] args) {
        Collection<String> c1 = new ArrayList<>();
        List<String> c2 = new ArrayList<>();
        
        c2.add("ABC"); // ["ABC"]
        c2.add(0, "DEF"); // ["DEF", "ABC"]
        
        System.out.println(c2); // ["DEF", "ABC"]
        
        c1.add("ABC");
        //c1.add(0, "DEF");
        
        c1.addAll(c2);
        c1.removeAll(c2);
        
        // Collection
        c1.remove("ABC");
        
        // List
        c2.remove("ABC");
        c2.remove(1);
    }
}