import java.util.Random;

public class Producator extends Thread {

    public void run() {
        try {
            while(true) {
                synchronized(Exemplu4.list) {
                    if (Exemplu4.list.size() < 100) {
                        int x = new Random().nextInt(1000);
                        Exemplu4.list.add(x);
                        Exemplu4.list.notifyAll();
                        System.out.println("Producatorul a adaugat valoarea " + x);
                    } else {
                        Exemplu4.list.wait();
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Ooops!");
        }
    }
}