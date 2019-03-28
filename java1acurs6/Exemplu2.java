public class Exemplu2 {
    
    public static void main(String [] args) {
        StringBuilder s1 = new StringBuilder("Hello");
        String s2 = new String("Hello");
        String s3 = "";
        String s4 = s1 + s3;
        
        for (int i=0 ;i < 100; i++) {
            s1.append(i);
        }
        
        //boolean b1 = s1 == s2; // false
    }
}