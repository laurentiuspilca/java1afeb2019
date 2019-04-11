import java.util.*;

public class Exemplu10 {

    public static void main(String [] args) {
        List<Integer> list = Arrays.asList(1,3,4,5,6,7,8);
        
        list.stream()
            .filter(x -> x % 2 == 0)
            .forEach(System.out::println);
    }
}