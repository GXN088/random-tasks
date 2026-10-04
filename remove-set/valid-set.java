public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
    // Создаем новое множество на основе первого
    Set<T> result = new java.util.HashSet<>(set1);
    
    // Перебираем элементы второго множества
    for (T element : set2) {
        // Если элемент уже есть, удаляем его (он общий), если нет — добавляем
        if (!result.remove(element)) {
            result.add(element);
        }
    }
    
    return result;
}
