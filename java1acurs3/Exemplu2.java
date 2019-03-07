public class Exemplu2 {

    public static void main(String [] args) {
        Point p1 = new Point();
        p1.x = 10;
        p1.y = 20;
        
        p1.display();
        
        Point.staticDisplay(p1);
    }
}