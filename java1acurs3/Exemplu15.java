public class Exemplu15 {

    public static void main(String [] args) {
        int [][] x = {{1,2,3}, {3,4,5}, {1,1,1}};
        
        
        for (int [] a : x) {
            for (int b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
        
        System.out.println("==================");
        
        for (int i=0; i<x.length;i++) {
            for (int j=0; j<x[i].length;j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}