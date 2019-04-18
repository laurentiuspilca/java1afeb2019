import java.util.*;

public abstract class Pizza {
    
    final int MAX_INGREDIENTE;

    String serie;
    double pret;
    List<Ingredient> ingrediente = new ArrayList<>();
    
    public Pizza(int MAX_INGREDIENTE) {
        this.MAX_INGREDIENTE = MAX_INGREDIENTE;
    }
    
    public void adaugaIngredient(Ingredient i) {
        if (ingrediente.size() < MAX_INGREDIENTE) {
            ingrediente.add(i);
        } else {
            throw new RuntimeException("Prea multe ingrediente!");
        }
    }
}