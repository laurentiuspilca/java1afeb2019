public class Bere extends Produs {

    double pa;
    
    public Bere(String serie, double pret, double pa) {
        this.serie = serie;
        this.pret = pret;
        this.pa = pa;
    }
    
    @Override
    public String toString() {
        return "Bere " + this.serie + " " + this.pret + " " + this.pa;
    }
}