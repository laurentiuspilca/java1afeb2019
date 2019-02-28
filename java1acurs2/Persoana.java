public class Persoana {

    String nume;
    Masina masina;
    
    Persoana(String nume) {
        this.nume = nume;
    }
    
    void cumpara(Magazin magazin, String marca, String culoare) {
        this.masina = magazin.importa(marca, culoare);
    }
    
}