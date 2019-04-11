import java.util.*;

public class Exemplu14 {

    public static void main(String [] args) {
        List<Integer> list = Arrays.asList(1,1,1,2,2,2,5,5,8,8,8,9,4);
        
        int sum = 
            list.stream()
                .distinct()
                .filter(x -> x % 2 == 0)
                .reduce(0, (a,b) -> a + b);
                
        System.out.println(sum);        
    }
}