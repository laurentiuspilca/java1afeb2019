public class Cerc extends Forma {

    int nume;
    double raza;
    
    public Cerc(double raza) {
        super("ala bala portocala");
        this.raza = raza;
        
        super.nume = "Altceva!";
        this.nume = 10;
    }
    
    public double arie() {
        return 3.14 * raza * raza;
    }
}