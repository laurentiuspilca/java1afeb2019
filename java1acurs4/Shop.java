public class Shop {

    private final Dog [] dogs;
    
    public Shop(Dog [] dogs) {
        Dog [] copy = new Dog[dogs.length];
        for (int i = 0; i<dogs.length; i++) {
            copy[i] = dogs[i];
        }
        this.dogs = copy;
    }

    public Dog[] getDogs() {
        Dog [] copy = new Dog[this.dogs.length];
        for (int i = 0; i<this.dogs.length; i++) {
            copy[i] = this.dogs[i];
        }
        return copy;
    }
}