import java.util.Scanner;
    class CalculatorRunner {
        public static void runCalculator() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Podaj pierwszą liczbę: ");
            double num1 = scanner.nextDouble();

            System.out.print("Podaj drugą liczbę: ");
            double num2 = scanner.nextDouble();

            System.out.println("Wybierz operację:");
            System.out.println("1. Dodawanie");
            System.out.println("2. Odejmowanie");
            System.out.println("3. Mnożenie");
            System.out.println("4. Dzielenie");
            System.out.println("5. Potęgowanie");
            System.out.println("6. Pierwiastkowanie");

            int choice = scanner.nextInt();

            double result = 0;

            // Wybór operacji
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
                default:
                    System.out.println("Nieprawidłowy wybór operacji.");
                    return;
            }

            // Wyświetlenie wyniku
            System.out.println("Wynik: " + result);
        }
    }

