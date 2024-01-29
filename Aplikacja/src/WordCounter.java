public class WordCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj tekst: ");
        String tekst = scanner.nextLine();

        LicznikSlowa licznik = new LicznikSlowa();
        int iloscSlow = licznik.policzSlowa(tekst);

        System.out.println("Ilość słów w tekście: " + iloscSlow);
    }
}