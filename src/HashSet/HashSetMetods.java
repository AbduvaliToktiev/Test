package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetMetods {
    public static void main(String[] args) {
        HashSet<String> country = new HashSet<String>();

        // Добавляем элементы в HashSet с помощью метода add()
        country.add("Индия");
        country.add("Австралия");
        country.add("Южная Африка");
        country.add("Индия");// пытаемся добавить еще один такой же элемент

        // Выводим элементы HashSet в консоль
        System.out.println(country);
        System.out.println("Список содержит Индию или нет: " +
                country.contains("Индия")); // contains = true или false

        // Удаляем элементы из множества с помощью метода remove()
        country.remove("Австралия");
        System.out.println("Список после удаления Австралии: " + country);

        // Проходимся по элементам HashSet с помощью итератора:
        System.out.println("Итерация по списку: ");
        Iterator<String> i = country.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }
}

class Add {
    public static void main(String[] args) {
        // как и в списках, мы указываем тип данных, которые находятся в множестве:
        HashSet<Integer> myHashSet = new HashSet<Integer>();
        // С помощью метода add добавляем значения в множество
        myHashSet.add(1); // значения которые передаём во множество
        myHashSet.add(2); // значения которые передаём во множество
        myHashSet.add(3); // значения которые передаём во множество
        // Добавляем 1 еще раз
        myHashSet.add(1);
        // Проходим по множеству
        for (int i : myHashSet)
            System.out.println(i); // Вывод множества в консоль
    }
}

class Remove {
    public static void main(String[] args) {
        // как и в списках, мы указываем тип данных, которые находятся в множестве:
        HashSet<Integer> myHashSet = new HashSet<Integer>();
        // С помощью метода add добавляем значения в множество
        myHashSet.add(1); // значения которые передаём во множество
        myHashSet.add(2); // значения которые передаём во множество
        myHashSet.add(3); // значения которые передаём во множество

        System.out.println("До удаления:");
        // Проходим по множеству
        for (int i : myHashSet)
            System.out.println(i); // Вывод множества в консоль
        // remove() - удаляет элемент из множества.
        myHashSet.remove(1); // Метод remove удаляет значение которое задали в скобках
        System.out.println("После удаления:");
        for (int i : myHashSet) // Проходим по множеству
            System.out.println(i); // Вывод множества в консоль

    }
}

class Contains {
    public static void main(String[] args) {
        // как и в списках, мы указываем тип данных, которые находятся в множестве:
        HashSet<Integer> myHashSet = new HashSet<Integer>();
        // С помощью метода add добавляем значения в множество
        myHashSet.add(1); // значения которые передаём во множество
        myHashSet.add(2); // значения которые передаём во множество
        myHashSet.add(3); // значения которые передаём во множество
        // contains() - определяет, есть ли элемент в множестве.
        System.out.println("Содержит ли myHashSet '1'? " + myHashSet.contains(1));
        System.out.println("Содержит ли myHashSet '11'? " + myHashSet.contains(11));

    }
}

class Size {
    public static void main(String[] args) {
        // как и в списках, мы указываем тип данных, которые находятся в множестве:
        HashSet<Integer> myHashSet = new HashSet<Integer>();
        System.out.println("Прежде чем мы добавим что-либо, размер myHashSet " + myHashSet.size());
        // С помощью метода add добавляем значения в множество
        myHashSet.add(1); // значения которые передаём во множество
        myHashSet.add(2); // значения которые передаём во множество
        myHashSet.add(3); // значения которые передаём во множество
        //  size() - возвращает размер множества
        System.out.println("Теперь размер myHashSet составляет " + myHashSet.size());
    }
}

class Clear {
    public static void main(String[] args) {
        // как и в списках, мы указываем тип данных, которые находятся в множестве:
        HashSet<Integer> myHashSet = new HashSet<Integer>();

        System.out.println("Прежде чем мы добавим что-либо, размер myHashSet " + myHashSet.size());
        // С помощью метода add добавляем значения в множество
        myHashSet.add(1); // значения которые передаём во множество
        myHashSet.add(2); // значения которые передаём во множество
        myHashSet.add(3); // значения которые передаём во множество

        System.out.println("Теперь размер myHashSet составляет " + myHashSet.size());
        // clear() - удаляет все элементы из коллекции:
        myHashSet.clear();
        System.out.println("После очистки размер myHashSet " + myHashSet.size());
    }
}

class IsEmpty {
    public static void main(String[] args) {
        // как и в списках, мы указываем тип данных, которые находятся в множестве:
        HashSet<Integer> myHashSet = new HashSet<Integer>();
        // isEmpty() - возвращает true если множество пустое, и false если там есть хотя бы один элемент
        System.out.println("Вначале myHashSet пуст: " + myHashSet.isEmpty());
        // С помощью метода add добавляем значения в множество
        myHashSet.add(1); // значения которые передаём во множество
        myHashSet.add(2); // значения которые передаём во множество
        myHashSet.add(3); // значения которые передаём во множество
        System.out.println("После добавления элементов myHashSet пуст: " + myHashSet.isEmpty());
        // clear() - удаляет все элементы из коллекции:
        myHashSet.clear();
        System.out.println("После очистки myHashSet пуст: " + myHashSet.isEmpty());
    }
}
