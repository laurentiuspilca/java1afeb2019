import java.util.*;

public class Exemplu16 {

    public static void main(String [] args) {
        List<Integer> list = new ArrayList<>();
        
        list.add(10);
        list.add(5);
        list.add(1);
        list.add(8);
        list.add(7);
        
        // Comparable vs Comparator
        list.sort( (a,b) -> a-b );
        
        System.out.println(list);
        
        Collections.sort(list); // Comparable
        Collections.sort(list, (a,b) -> a-b); // Comaparator
    }
}