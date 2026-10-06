import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsiusInput = scanner.nextDouble();

        Temperature temperature = new Temperature();
        temperature.setCelsius(celsiusInput);

        System.out.println("Valid: " + temperature.isValid());
        System.out.println("Fahrenheit: " + String.format("%.1f", temperature.getFahrenheit()));
    }
}
