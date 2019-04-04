public interface Engine {
    
    public void run();
    
    public static Engine create() {
        return new AudiEngine();
    }
}