public class Dreptunghi extends Forma { 

    double w,h;
    
    public Dreptunghi(double w, double h) {
        this.w = w;
        this.h = h;
    }
    
    public double arie() {
        return w*h;
    }
}