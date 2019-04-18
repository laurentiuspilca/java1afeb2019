import java.util.*;

public class Comanda {
    private static Comanda singleton;

    List<Pizza> pizza = new ArrayList<>();
    
    private Comanda() {
    }
    
    public static Comanda getInstance() {
        if (singleton == null) {
            singleton = new Comanda();
        }
        return singleton;
    }
    
    public void adaugaPizza(Pizza p) {
        pizza.add(p);
    }
    
    public void afisare() {
        pizza.forEach(System.out::println);
    }
    
    public void adaugaIngredient(String serie, String nume) {
        for (Pizza p : pizza) {
            if (p.serie.equals(serie)) {
                p.adaugaIngredient(new Ingredient(nume));
                return;
            }
        }
    }
    
    public int getPizzaNumber() {
        return pizza.size();
    }
}