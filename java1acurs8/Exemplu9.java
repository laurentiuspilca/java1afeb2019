import java.util.*;

public class Exemplu9 {

    public static void main(String [] args) {
        Deque<Integer> d = new ArrayDeque<>();
        
        d.offer(10);
        d.offer(20);
        d.push(45);
        d.push(78);
        
        System.out.println(d.peek());
        System.out.println(d.pop());
        System.out.println(d.peek());
        
        System.out.println("====================");
        
        d.forEach(System.out::println);
    }
}