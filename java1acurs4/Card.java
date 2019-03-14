public class Card {

    protected double sold;
    
    public void depunere(double suma) {
        this.sold += suma;
    }
    
    void retragere(double suma) {
        this.sold -= suma;
    }
}