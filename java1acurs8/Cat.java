public class Cat implements Comparable<Cat> {

    String name;
    int age;
    
    public Cat (String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    @Override
    public String toString() {
        return this.name + " " + this.age;
    }
    
    @Override
    public int compareTo(Cat cat) {
        return this.name.compareTo(cat.name);
    }
}