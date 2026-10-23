public class Counter {
    // Приватная статическая переменная для отслеживания общего количества экземпляров
    private static int totalCount = 0;

    // Приватная переменная экземпляра для уникального идентификатора
    private int id;

    // Конструктор, увеличивающий общий счетчик и присваивающий id
    public Counter() {
        totalCount++;
        this.id = totalCount;
    }

    // Метод для получения уникального id счетчика
    public int getId() {
        return this.id;
    }

    // Статический метод для получения общего количества созданных объектов
    public static int getTotalCount() {
        return totalCount;
    }
}
