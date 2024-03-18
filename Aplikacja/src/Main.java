import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("wybierz odpowiednią funkcje\n 1. Generator Haseł \n2. Kalkulator \n 3. Licznik słow");
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