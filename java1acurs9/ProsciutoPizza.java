public class ProsciutoPizza extends Pizza {
    
    public ProsciutoPizza(String serie, double pret) {
        super(5);
        this.serie = serie;
        this.pret = pret;
    }
    
    
    
    @Override
    public String toString() {
        return "Prosciuto " + serie + " " + pret + " " + ingrediente;
    }
}