public class Exemplu6 {

    
    public static void main(String [] args) {
    
        Foo f1 = new Foo();
        f1.m(); // Foo
        
        Foo f2 = new Foo() {
            
            void m() {
                System.out.println("Bar!");
            }
        
        };
        
        f2.m(); // Bar!
        
    }
}