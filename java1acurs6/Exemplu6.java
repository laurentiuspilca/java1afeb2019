public class Exemplu6 {

    public static void main(String [] args) {
        Integer i1 = new Integer(10); // java 9 -> deprecated
        Integer i2 = 10; // boxing
        int x = i2; // unboxing
        
        int a = Integer.parseInt("123"); // --> NumberFormatException
        long b = Long.parseLong("123");
        double c = Double.parseDouble("10.5");
        
    }
   

}