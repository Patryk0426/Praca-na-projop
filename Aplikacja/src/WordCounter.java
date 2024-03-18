import java.util.Scanner;
public class WordCounter {

    public static void Runner() {
        boolean exit = false;
        while (!exit) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj tekst: ");
        String tekst = scanner.nextLine();

        xdd licznik = new xdd();
        int iloscSlow = licznik.policzSlowa(tekst);

        System.out.println("Ilość słów w tekście: " + iloscSlow);
        System.out.println("czy chcesz kontynuować? t/n");
        String xd = scanner.nextLine();
        switch (xd) {
            case "t":
                break;
            case "n":
                exit = true;
                break;
        }

    }
}
}