import java.util.*;

public class Exemplu4 {

    public static void main(String [] args) {
        List<Integer> list1 = Arrays.asList(1,3,5,6,7,8);
        
        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(1);
        list2.add(3);
        list2.add(5);
        
        int x1 = list1.get(1); // 3
        int n = list1.size();
        
        
        for (int i=0; i<list1.size(); i++) {
            System.out.println(list1.get(i));
        }
        
        for (int y : list1) {
            System.out.println(y);
        }
    }
}