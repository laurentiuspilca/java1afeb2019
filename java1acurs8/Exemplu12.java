import java.util.*;

public class Exemplu12 {

    public static void main(String [] args) {
        List<String> list = Arrays.asList("AAA", "BB", "QWERTY", "Q");
        
        int sum = 
            list.stream()
                .map(String::length)
                .reduce(0, (a,b) -> a + b);
                
        // x -> System.out.println(x)    System.out::println
        // x -> x.length()               String::length
        
        System.out.println(sum);
    }
}