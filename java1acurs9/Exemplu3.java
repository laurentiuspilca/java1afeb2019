public class Exemplu3 {

    public static void main(String [] args) {
        MyTask task = new MyTask();
        Thread t = new Thread(task);
        
        t.start();
    }
}