public class PizzaThread extends Thread {

    @Override
    public void run() {
        try {
            while(true) {
                System.out.println(Comanda.getInstance().getPizzaNumber());
                Thread.sleep(30000);
            }
        } catch (Exception e) {
            System.out.println("Error!");
        }
    }
}