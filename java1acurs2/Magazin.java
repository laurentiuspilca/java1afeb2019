public class Magazin {

    String nume;
    String adresa;
    
    Masina importa(String marca, String culoare) {
        return new Masina(marca, culoare);
    }
}