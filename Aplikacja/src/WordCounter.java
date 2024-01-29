import java.util.Scanner;
public class WordCounter {

    public static void Runner() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj tekst: ");
        String tekst = scanner.nextLine();

        xdd licznik = new xdd();
        int iloscSlow = licznik.policzSlowa(tekst);

        System.out.println("Ilość słów w tekście: " + iloscSlow);
    }
}