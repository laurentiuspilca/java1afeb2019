import java.util.*;

public class Exemplu17 {

    public static void main(String [] args) {
        LinkedList<Integer> list = new LinkedList<>();
        
        list.addFirst(10);
        list.addFirst(50);
        list.removeLast();
        list.addLast(11);
        list.removeLast();
        list.addLast(98);
        list.addFirst(70);
        list.addFirst(80);
        list.addLast(11);
        list.removeLast();
        list.addLast(55);
        list.addFirst(40);
        list.removeFirst();
        
        for (Integer x : list) {
            System.out.println(x);
        }
    }
}