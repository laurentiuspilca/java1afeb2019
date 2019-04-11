import java.util.*;

public class Exemplu5 {

    public static void main(String [] args) {
        Set<Cat> set1 = new TreeSet<>();
        
        set1.add(new Cat("Tom", 2));
        set1.add(new Cat("Leo", 4));
        set1.add(new Cat("Kitty", 1));
        set1.add(new Cat("Mitzy", 3));
        
        set1.forEach(System.out::println);
        
        Comparator<Cat> c = (c1,c2) -> c1.age - c2.age;
        Set<Cat> set2 = new TreeSet<>(c);
        
        set2.add(new Cat("Tom", 2));
        set2.add(new Cat("Leo", 4));
        set2.add(new Cat("Kitty", 1));
        set2.add(new Cat("Mitzy", 3));
        
        set2.forEach(System.out::println);
        
        Comparator<Cat> q = (c1,c2) -> c2.age - c1.age;
        Set<Cat> set3 = new TreeSet<>(q);
        
        set3.add(new Cat("Tom", 2));
        set3.add(new Cat("Leo", 4));
        set3.add(new Cat("Kitty", 1));
        set3.add(new Cat("Mitzy", 3));
        
        set3.forEach(System.out::println);
    }
}