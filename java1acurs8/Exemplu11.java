import java.util.*;

public class Exemplu11 {

    public static void main(String [] args) {
        List<Integer> list = Arrays.asList(2,3,4,5,6,7);
        
        int sum = 
            list.stream()
                .filter(x -> x % 2 != 0)
                .reduce(0, (a,b) -> a + b);
                
        System.out.println(sum);
    }
}