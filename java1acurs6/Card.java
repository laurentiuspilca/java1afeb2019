import java.util.*;

public class Card {

    String number;
    
    public Card(String number) {
        this.number = number;
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        
        if (o instanceof Card) {
            Card c = (Card) o;
            return c.number.equals(this.number);
        }
        
        return false;
    }
    
    @Override
    public int hashCode() {
        return Arrays.asList(this.number.split(""))
                .stream()
                .mapToInt(Integer::parseInt)
                .sum();
    }
    
    @Override
    public void finalize() {
    }
}