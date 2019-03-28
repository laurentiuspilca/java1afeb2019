public class Exemplu13 {

    public static void main(String [] args) {
        
        try (Door d1 = new Door();
             Door d2 = new Door()) {
            // use the door
            int x = 10/0;
            System.out.println(x);
        } catch (Exception e) {
            System.out.println("BAU!");
        } finally {
            System.out.println("Finally");
        }
        
    }
}