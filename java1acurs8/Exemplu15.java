import java.util.*;

public class Exemplu15 {

    public static void main(String [] args) {
        List<String> list = Arrays.asList(
            "I ate an apple and she ate an apple",
            "Did she say hello ? No she did never say hello !"
        );
        
        // an No ---> 4
        
        int sum = 
            list.stream()
                .flatMap(x -> Arrays.stream(x.split("\\s+")))
                .distinct()
                .map(x -> x.length())
                .filter(x -> x % 2 == 0)
                .reduce(0, (a,b) -> a + b);
                
        System.out.println(sum);        
    }
}