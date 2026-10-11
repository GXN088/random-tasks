import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считать входные данные
        String studentId = scanner.nextLine();
        String name = scanner.nextLine();
        int enrollmentYear = scanner.nextInt();
        scanner.nextLine(); // Считать оставшийся символ новой строки после nextInt()
        String newName = scanner.nextLine();

        // Создать объект Student с начальными значениями
        Student student = new Student(studentId, name, enrollmentYear);

        // Вывести информацию о студенте до изменения имени
        System.out.println(student.getInfo());

        // Изменить имя студента с помощью сеттера
        student.setName(newName);

        // Вывести информацию о студенте после изменения имени
        System.out.println(student.getInfo());
        
        scanner.close();
    }
}
