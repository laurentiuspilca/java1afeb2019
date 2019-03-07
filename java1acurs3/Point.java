public class Point {

    int x,y;
    static int z;
    
    static {
        System.out.println("A");
    }
    
    {
        System.out.println("B");
    }
    
    void display() {
        System.out.println(this.x + " " + this.y);
    }
    
    static void staticDisplay(Point p) {
        System.out.println(p.x + " " + p.y);
    }
}