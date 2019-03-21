public class A1 {
    
    private int x;

    class A2 {
    
        public void m() {
            A1.this.x = 10;
        }
    }
    
    
    public static class A3 {
    
    }
}