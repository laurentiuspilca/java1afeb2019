public class Exemplu17 {

    public static void main(String [] args) {
        Magazin m = new Magazin();
        
        Persoana p = new Persoana("Bill");
        
        p.cumpara(m, "Dacia", "alb");
        
        System.out.println(p.masina.marca);
        System.out.println(p.masina.culoare);
    }
}