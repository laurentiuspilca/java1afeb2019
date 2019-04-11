import java.util.*;

public class Exemplu4 {

    public static void main(String [] args) {
        Set<Cat> set = new TreeSet<>();
        
        set.add(new Cat("Tom", 2));
        set.add(new Cat("Leo", 4));
        set.add(new Cat("Kitty", 1));
        set.add(new Cat("Mitzy", 3));
        
        set.forEach(System.out::println);
    }
}