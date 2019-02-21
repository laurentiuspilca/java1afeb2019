public class Exemplu8 {

    public static void main(String [] args) {
        char anotimp = 'p'; // anotimp dat de p v t i
        // char int String enum
        
        switch(anotimp) {
            case 'v':
                System.out.println("Este cald!");
                break;
            case 'i':
                System.out.println("Este frig!");
                break;
            case 'p':
            case 't':
                System.out.println("Ploua!");
                break;
            default:
                System.out.println(":)");
        }
    }
}