package HashMap;

import java.util.HashMap;
import java.util.Map;

// Публичный класс С названием HashMap
public class HashMapMetods { // Тело класса
    // Модификатор доступа основного метода
    public static void main(String[] args) { // Тело метода
// Создание объекта типа Map похоже на создание коллекций - только мы должны задавать два типа - тип ключа и тип значения:
        HashMap<java.lang.String, Integer> myHashMap = new HashMap<>();
        // put(K key, V value) - добавляет элемент в карту;
        myHashMap.put("Basil", 1987); // Имя и год рождения
        myHashMap.put("Kate", 1971); // Имя и год рождения
        myHashMap.put("Lena", 1991); // Имя и год рождения
        // Map.Entry(интерфейс) позволяет получить доступ к записям на карте
        for (Map.Entry<java.lang.String, Integer> entry : myHashMap.entrySet())
            // Вывод информации в консоль {String = ключ} {Integer = Значение}
            System.out.println(entry.getKey() + " - " + entry.getValue());
    } // Закрывает тело метода
} // Закрывает тело класса


// Публичный класс С названием Get
class Get { // Тело класса
    // Модификатор доступа основного метода
    public static void main(String[] args) { // Тело метода
        // Создание объекта типа Map похоже на создание коллекций - только мы должны задавать два типа - тип ключа и тип значения:
        HashMap<java.lang.String, java.lang.String> myHashMap = new HashMap<>();
        // put(K key, V value) - добавляет элемент в карту;
        myHashMap.put("Basil", "07.12.1987"); // Имя и дата рождения
        myHashMap.put("Kate", "12.10.1971"); // Имя и дата рождения
        myHashMap.put("Lena", "11.01.1991"); // Имя и дата рождения
        // get(Object key) - ищем значение по его ключу.
        System.out.println("Значение для {Basil} - " + myHashMap.get("Basil")); // Выводим информацию в консоль "Строка" + (Значение)
        System.out.println("Значение для {Kate} - " + myHashMap.get("Kate")); // Выводим информацию в консоль "Строка" + (Значение)
        System.out.println("значение для {Lena} - " + myHashMap.get("Lena")); // Выводим информацию в консоль "Строка" + (Значение)
    }  // Закрывает тело метода
} // Закрывает тело класса


// Публичный класс С названием Remove
class Remove { // Тело класса
    // Модификатор доступа основного метода
    public static void main(String[] args) { // Тело метода
        // Создание объекта типа Map похоже на создание коллекций - только мы должны задавать два типа - тип ключа и тип значения:
        HashMap<java.lang.String, java.lang.String> myHashMap = new HashMap<>();
        // put(K key, V value) - добавляет элемент в карту;
        myHashMap.put("Basil", "07.12.1987"); // Имя и дата рождения
        myHashMap.put("Kate", "12.10.1971"); // Имя и дата рождения
        myHashMap.put("Lena", "11.01.1991"); // Имя и дата рождения
        // Строка которая выведится в консоль
        System.out.println("До удаления ключа:");
        // Map.Entry(интерфейс) позволяет получить доступ к записям на карте
        for (Map.Entry<java.lang.String, java.lang.String> entry : myHashMap.entrySet())
            // Вывод информации в консоль {String = ключ} {String = Значение}
            System.out.println(entry.getKey() + " - " + entry.getValue());
        // remove(Object key) - удаляем значение по его ключу. Например;
        myHashMap.remove("Kate");
        // Строка которая выведится в консоль
        System.out.println("\nПосле удаления ключа:");
        // Map.Entry(интерфейс) позволяет получить доступ к записям на карте
        for (Map.Entry<java.lang.String, java.lang.String> entry : myHashMap.entrySet())
            // Вывод информации в консоль {String = ключ} {String = Значение}
            System.out.println(entry.getKey() + " - " + entry.getValue());
    } // Закрывает тело метода
} // Закрывает тело класса


// Публичный класс С названием ContainsKey
class ContainsKey { // Тело класса
    // Модификатор доступа основного метода
    public static void main(String[] args) { // Тело метода
        // Создание объекта типа Map похоже на создание коллекций - только мы должны задавать два типа - тип ключа и тип значения:
        HashMap<java.lang.String, java.lang.String> myHashMap = new HashMap<>();
        // put(K key, V value) - добавляет элемент в карту;
        myHashMap.put("Basil", "07.12.1987"); // Имя и дата рождения
        myHashMap.put("Kate", "12.10.1971"); // Имя и дата рождения
        myHashMap.put("Lena", "11.01.1991"); // Имя и дата рождения
        // containsKey(Object key) - спрашиваем, есть ли в карте заданный ключ. Например:
        System.out.println("Сдесь есть {Basil}? " + myHashMap.containsKey("Basil")); // В этом случае выйдет true, т.к. (Basil) есть в карте
        System.out.println("Сдесь есть {Victoria}? " + myHashMap.containsKey("Victoria")); // В этом случае выйдет false, т.к. (Victoria) нет в карте
    } // Закрывает тело метода
} // Закрывает тело класса


// Публичный класс С названием ContainsValue
class ContainsValue { // Тело класса
    // Модификатор доступа основного метода
    public static void main(String[] args) { // Тело метода
        // Создание объекта типа Map похоже на создание коллекций - только мы должны задавать два типа - тип ключа и тип значения:
        HashMap<java.lang.String, java.lang.String> myHashMap = new HashMap<>();
        // put(K key, V value) - добавляет элемент в карту;
        myHashMap.put("Basil", "07.12.1987"); // Имя и дата рождения
        myHashMap.put("Kate", "12.10.1971"); // Имя и дата рождения
        myHashMap.put("Lena", "11.01.1991"); // Имя и дата рождения
        // containsValue(Object value) - спрашиваем, есть ли в карте заданное значение. Например:
        System.out.println("Сдесь есть значеие {12.10.1971}? " + myHashMap.containsValue("12.10.1971")); // В этом случае выйдет true, т.к. (12.101971) есть в карте
        System.out.println("Сдесь есть значение {lalala}? " + myHashMap.containsValue("lalala")); // В этом случае выйдет false, т.к. (lalala) нет в карте
    } // Закрывает тело метода
} // Закрывает тело класса


// Публичный класс С названием Size
class Size { // Тело класса
    // Модификатор доступа основного метода
    public static void main(String[] args) { // Тело метода
        // Создание объекта типа Map похоже на создание коллекций - только мы должны задавать два типа - тип ключа и тип значения:
        HashMap<java.lang.String, java.lang.String> myHashMap = new HashMap<>();
        // put(K key, V value) - добавляет элемент в карту;
        myHashMap.put("Basil", "07.12.1987"); // Имя и дата рождения
        myHashMap.put("Kate", "12.10.1971"); // Имя и дата рождения
        myHashMap.put("Lena", "11.01.1991"); // Имя и дата рождения
        // size() - возвращает размер карты (количество пар "ключ-значение"). Например:
        System.out.println("Длина(размер) карты: " + myHashMap.size()); // Выводит в консоль строку и длину(размер) карты
    } // Закрывает тело метода
}  // Закрывает тело класса