import java.util.*;

public class Exemplu13 {

    public static void main(String [] args) {
        List<String> list = Arrays.asList("AAAA", "A", "QWERTY", "DDD", "UU");
    
        list.stream()
            .map(x -> x.length())
            .sorted()
            .forEach(System.out::println);
            
        list.stream()
            .sorted( (s1, s2) -> s1.length() - s2.length())
            .forEach(System.out::println);    
    }
}