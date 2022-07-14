package sortCollect;

import equalsAndHashCode.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortExample {
    public static void main(String[] args) {
       List<String> strings = Arrays.asList("123", "234", "134", "23", "456");

        Collections.sort(strings);

        System.out.println(strings);

        List<Person> personList = Arrays.asList(
                new Person(1, "Ivan", "Ivanov"),
                new Person(2, "Petr", "Petrov"),
                new Person(3, "Anton", "Antonov"));
        Collections.sort(personList);
        System.out.println(personList);
    }
}
