public class Exemplu5 {

    public static void main(String [] args) {
        int i = 0;
        int n = 10;
        
        while ( i < n ) {
            i++;
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}