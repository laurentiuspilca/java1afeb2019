public class A extends Thread {

    
    @Override
    public void run() {
        try {
            for (int i=0; i<20; i+=2) {
                System.out.println(i);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println("Oooops!");
        }
    }
}