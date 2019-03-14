public class Pisica {
    
    private String nume;
    private int varsta;
    private boolean dead;
    
    public void setNume(String nume) {
        this.nume = nume;
    }
    
    public String getNume() {
        return this.nume;
    }
    
    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }
    
    public int getVarsta() {
        return this.varsta;
    }
    
    public void setDead(boolean dead) {
        this.dead = dead;
    }
    
    public boolean isDead() {
        return this.dead;
    }
}