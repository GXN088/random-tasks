public static Animal[] deserializeAnimalArray(byte[] data) {
    if (data == null) {
        throw new IllegalArgumentException("Data cannot be null");
    }

    try (java.io.ByteArrayInputStream bais = new java.io.ByteArrayInputStream(data);
         java.io.ObjectInputStream ois = new java.io.ObjectInputStream(bais)) {

        // 1. Читаем количество элементов массива
        int size = ois.readInt();
        if (size < 0) {
            throw new IllegalArgumentException("Array size cannot be negative: " + size);
        }

        Animal[] animals = new Animal[size];

        // 2. Читаем сами объекты Animal
        for (int i = 0; i < size; i++) {
            Object obj = ois.readObject();
            if (obj instanceof Animal) {
                animals[i] = (Animal) obj;
            } else {
                throw new IllegalArgumentException("Object at index " + i + " is not an instance of Animal");
            }
        }

        return animals;

    } catch (IllegalArgumentException e) {
        // Перенаправляем наше исключение, чтобы не оборачивать его дважды
        throw e;
    } catch (Exception e) {
        // Ловим java.io.IOException, ClassNotFoundException, EOFException и т.д.
        throw new IllegalArgumentException("Invalid data format for Animal array serialization", e);
    }
}
