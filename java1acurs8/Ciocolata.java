public class Ciocolata extends Produs {

    int kCal;
    
    public Ciocolata(String serie, double pret, int kCal) {
        this.serie = serie;
        this.pret = pret;
        this.kCal = kCal;
    }
    
    @Override
    public String toString() {
        return "Cioco " + this.serie + " " + this.pret + " " + this.kCal;
    }
}