import java.util.Scanner;
class CalculatorRunner {
    public static void runCalculator() {
        boolean exit = false;
        while (!exit) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Podaj pierwszą liczbę: ");
            double num1 = scanner.nextDouble();

            System.out.print("Podaj drugą liczbę: ");
            double num2 = scanner.nextDouble();

            System.out.println("Wybierz operację:");
            System.out.println("1. Dodawanie\n2. Odejmowanie\n3. Mnożenie\n4. Dzielenie\n 5. Potęgowanie \n 6. Pierwiastkowanie \n 0. Zakończ");

            int choice = scanner.nextInt();

            double result = 0;

            switch (choice) {
                case 1:
                    result = Calculator.add(num1, num2);
                    break;
                case 2:
                    result = Calculator.subtract(num1, num2);
                    break;
                case 3:
                    result = Calculator.multiply(num1, num2);
                    break;
                case 4:
                    result = Calculator.divide(num1, num2);
                    break;
                case 5:
                    result = Calculator.power(num1, num2);
                    break;
                case 6:
                    result = Calculator.squareRoot(num1);
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Nieprawidłowy wybór operacji.");
                    return;
            }

            System.out.println("Wynik: " + result);

        }

    }
}

