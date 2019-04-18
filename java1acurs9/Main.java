import java.util.*;

public class Main {

    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        new PizzaThread().start();
        
        while(true) {
            System.out.print("Comanda: ");
            String cmd = s.nextLine();
            
            String [] cuv = cmd.split("\\s+");
            
            switch(cuv[0]) {
                case "exit":    
                    System.out.println("Bye bye!");
                    return;
                case "ap":
                    adaugaProsciuto(cuv);
                    break;
                case "ac": 
                    adaugaCaltzone(cuv);
                    break;
                case "afisare": 
                    Comanda.getInstance().afisare();
                    break;
                case "ai":
                    adaugaIngredient(cuv);
                    break;
                default:
                    System.out.println("Comanda inexistenta!");
            }
        }
    }
    
    private static void adaugaProsciuto(String [] cuv) {
        String serie = cuv[1];
        double pret = Double.parseDouble(cuv[2]);
        
        ProsciutoPizza p = new ProsciutoPizza(serie, pret);
        
        Comanda.getInstance().adaugaPizza(p);
        System.out.println("A fost adaugata o pizza prosciuto");
    }
    
    private static void adaugaCaltzone(String [] cuv) {
        String serie = cuv[1];
        double pret = Double.parseDouble(cuv[2]);
        
        CaltzonePizza p = new CaltzonePizza(serie, pret);
        
        Comanda.getInstance().adaugaPizza(p);
        System.out.println("A fost adaugata o pizza caltzone");
    }
    
    private static void adaugaIngredient(String [] cuv) {
        String serie = cuv[1];
        String nume = cuv[2];
        Comanda.getInstance().adaugaIngredient(serie, nume);
        System.out.println("A fost adaugat ingredientul " + nume);
    }
}