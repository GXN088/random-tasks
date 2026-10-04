import java.util.HashSet;
import java.util.Set;

public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
    // Создаем копии множеств, чтобы не изменять оригиналы
    Set<T> result1 = new HashSet<>(set1);
    Set<T> result2 = new HashSet<>(set2);
    
    // Удаляем из первой копии все элементы, которые есть во второй
    result1.removeAll(set2);
    
    // Удаляем из второй копии все элементы, которые есть в первой
    result2.removeAll(set1);
    
    // Объединяем результаты двух разностей
    result1.addAll(result2);
    
    return result1;
}
