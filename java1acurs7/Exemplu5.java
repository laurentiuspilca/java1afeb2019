import java.util.*;

public class Exemplu5 {

    public static void main(String [] args) {
        List<?> list1 = Arrays.asList(1,2,3,4,5,6,7);
        
        List<? extends Number> list2 = new ArrayList<Integer>();
        List<? extends Number> list3 = new ArrayList<Double>();
        //list3.add(10.5);
 
        Object y = list1.get(1);
        Number x = list3.get(1);
        
        List<? super Integer> list4 = new ArrayList<Number>();
        list4.add(10);
        Object i = list4.get(1);
    }
}