public class DebitCard extends Card {

    @Override
    public void retragere(double suma) {
        if (this.sold >= suma) {
            this.sold -= suma;
        }
    }
}