public class CaltzonePizza extends Pizza {

    public CaltzonePizza(String serie, double pret) {
        super(7);
        this.serie = serie;
        this.pret = pret;
    }
    
    @Override
    public String toString() {
        return "Caltzone " + serie + " " + pret + " " + ingrediente;
    }
}