public class Consumator extends Thread {

    @Override
    public void run() {
        try {
            while(true) {
                synchronized(Exemplu4.list) {
                    if (Exemplu4.list.size() > 0) {
                        int x = Exemplu4.list.get(0);
                        Exemplu4.list.remove(0);
                        Exemplu4.list.notifyAll();
                        System.out.println("Consumatorul a eliminat valoarea " + x);
                    } else {
                        Exemplu4.list.wait();
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Oooops!");
        }
    }
}