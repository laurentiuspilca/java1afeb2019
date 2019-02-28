public class Pisica {

    String nume;
    String culoare;
    int greutate;
    
    
    Pisica(String nume) {
        this.nume = nume;
    }
    
    void spuneMiau() {
        System.out.println("Miau! Numele meu este " + this.nume);
    }
}