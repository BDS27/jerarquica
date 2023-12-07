public class Main {
    public static void main(String[] args) {
        Hobby hobbyGenerico = new Hobby();
        hobbyGenerico.descripcion();

        Futbol futbol = new Futbol();
        futbol.descripcion();
        futbol.practicar();

        Voley voley = new Voley();
        voley.descripcion();
        voley.practicar();

        Calistenia calistenia = new Calistenia();
        calistenia.descripcion();
        calistenia.practicar();
    }
}
