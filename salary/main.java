import java.util.Scanner;

// 1層目: 基本クラス
class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    public String describe() {
        return name + " earns " + salary;
    }
}

// 2層目 (単一継承): Employeeを直接拡張
class Intern extends Employee {
    private double stipend;

    public Intern(String name, double stipend) {
        super(name, 0.0);
        this.stipend = stipend;
    }

    @Override
    public String describe() {
        return name + " is an intern earning a stipend of " + stipend;
    }
}

// 2層目 (多段階継承の始点): Employeeを拡張
class Manager extends Employee {
    protected int teamSize;

    public Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    public double bonus() {
        return teamSize * 100.0;
    }
}

// 3層目: Managerを拡張
class Director extends Manager {
    private int regions;

    public Director(String name, double salary, int teamSize, int regions) {
        super(name, salary, teamSize);
        this.regions = regions;
    }

    public double totalCompensation() {
        return getSalary() + bonus() + (regions * 500.0);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 各オブジェクトの入力と生成
        Intern intern = new Intern(sc.nextLine(), Double.parseDouble(sc.nextLine()));
        Manager manager = new Manager(sc.nextLine(), Double.parseDouble(sc.nextLine()), Integer.parseInt(sc.nextLine()));
        Director director = new Director(sc.nextLine(), Double.parseDouble(sc.nextLine()), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));

        // 【修正】カンマを追加した出力フォーマット
        System.out.println(intern.describe());
        System.out.println(manager.describe() + ", bonus " + manager.bonus());
        System.out.println(director.describe() + ", total compensation " + director.totalCompensation());

        sc.close();
    }
}
