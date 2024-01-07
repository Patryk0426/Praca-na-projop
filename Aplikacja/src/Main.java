import java.io.Console;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("wybierz odpowiednią funkcje");
        System.out.println("1. Generator Haseł");
        System.out.println("2. Kalkulator");
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
            default:System.out.println("nie ma takiej funkcji");
        }
    }
}