import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Чтение входных данных
        String managerName = scanner.nextLine();
        double managerSalary = scanner.nextDouble();
        int teamSize = scanner.nextInt();
        scanner.nextLine(); // поглощение символа новой строки
        String developerName = scanner.nextLine();
        String language = scanner.nextLine();

        // Зарплата разработчика фиксирована и составляет 75000.0
        double developerSalary = 75000.0;

        // Создание объектов
        Manager manager = new Manager(managerName, managerSalary, teamSize);
        Developer developer = new Developer(developerName, developerSalary, language);

        // Вывод информации и поведения менеджера
        System.out.println(manager.getManagerDetails());
        manager.work();

        // Вывод информации и поведения разработчика
        System.out.println(developer.getDeveloperDetails());
        developer.work();
        
        scanner.close();
    }
}
