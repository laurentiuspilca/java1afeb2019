public enum Coffee {
    SMALL(10), MEDIUM(50), BIG;
    
    private int qty;
    
    Coffee() {
    }
        
    Coffee(int qty) {
        this.qty = qty;
    }
    
    public void drink() {
        this.qty--;
    }
}