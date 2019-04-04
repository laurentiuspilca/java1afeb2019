import java.util.*;

public class Exemplu7 {
    
    public static void main(String [] args) {
        List<?> list1 = new ArrayList<>(); // Object
        List<? extends Number> list2 = new ArrayList<>(); // Number
        List<String> list3 = new ArrayList<>(); // String
        List<? super Number> list4 = new ArrayList<>(); // Object
    }
}