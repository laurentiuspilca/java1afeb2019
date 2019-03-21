public class Cat {

    String name;
    
    public Cat() {
    }
    
    public Cat(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return this.name;
    }
}