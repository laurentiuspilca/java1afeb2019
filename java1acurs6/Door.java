public class Door implements AutoCloseable {

    @Override
    public void close() {
        System.out.println("Closing...");
    }
}