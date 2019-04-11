import java.util.*;

public class Magazin {
    private static Magazin singleton;
    
    private List<Produs> produse = new ArrayList<>();
    
    private Magazin() {}
    
    public static Magazin getInstance() {
        if (singleton == null) {
            singleton = new Magazin();
        }
        return singleton;
    }
    
    public void adaugaProdus(Produs p) {
        this.produse.add(p);
    }
    
    public void afisareProduse() {
        this.produse.forEach(System.out::println);
    }
    
    public void afisareCiocolate() {
        //for (Produs p : this.produse) {
        //    if (p instanceof Ciocolata) {
        //        System.out.println(p);
        //    }
        //}
        
        this.produse.stream()
            .filter(p -> p instanceof Ciocolata)
            .forEach(System.out::println);
    }
}