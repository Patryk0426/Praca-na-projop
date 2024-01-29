import java.io.Console;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("wybierz odpowiednią funkcje");
        System.out.println("1. Generator Haseł");
        System.out.println("2. Kalkulator");
        System.out.println("3. Licznik słow");
        int choice = scanner.nextInt();
        switch(choice) {
            case (1):
                PasswordService pass = new PasswordService();
                pass.PasswordService();
                break;
            case (2):
                CalculatorRunner cal = new CalculatorRunner();
                cal.runCalculator();
                break;
            case (3):
                WordCounter wc = new WordCounter();
                wc.Runner();
                break;

        }
    }
}