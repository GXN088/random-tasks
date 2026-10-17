import java.util.Scanner;

class TemperatureLog {
    private String city;
    private int reading;
    private static int totalReadings = 0, sumReadings = 0;

    // Конструктор сохраняет город и показание, затем обновляет общее количество показаний и их сумму
    public TemperatureLog(String city, int reading) {
        this.city = city;
        this.reading = reading;
        totalReadings++;
        sumReadings += reading;
    }

    // Статический метод классифицирует показания
    public static String classify(int reading) {
        if (reading >= 30) {
            return "Hot";
        } else if (reading >= 15) {
            return "Mild";
        } else {
            return "Cold";
        }
    }

    // Описывает текущий объект: город: показание (класс)
    public String describe() {
        return city + ": " + reading + " (" + classify(reading) + ")";
    }

    // Возвращает общую сумму, делённую на общее количество показаний
    public static int averageReading() {
        if (totalReadings == 0) {
            return 0; // Защита от деления на ноль, если логов ещё нет
        }
        return sumReadings / totalReadings;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c1 = sc.nextLine();
        int r1 = Integer.parseInt(sc.nextLine());
        String c2 = sc.nextLine();
        int r2 = Integer.parseInt(sc.nextLine());
        String c3 = sc.nextLine();
        int r3 = Integer.parseInt(sc.nextLine());

        TemperatureLog a = new TemperatureLog(c1, r1);
        TemperatureLog b = new TemperatureLog(c2, r2);
        TemperatureLog cc = new TemperatureLog(c3, r3);

        System.out.println(a.describe());
        System.out.println(b.describe());
        System.out.println(cc.describe());
        System.out.println("Average: " + TemperatureLog.averageReading());
    }
}
