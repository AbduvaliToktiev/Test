package equalsAndHashCode;

import java.util.Objects;

public class Person implements Comparable<Person> {
    private int id;
    private String firstName;
    private String lastName;

    public Person() {

    }

    public Person(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName);
    }

    @Override
    public String toString() {
        return "Человек: " + " | id = " + id + " | Имя = " + firstName + " | Фамилия = " + lastName + "\n";
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(id, o.id);
    //   if (id == o.id) {
    //       return 0;
    //   } else if (id > o.id) {
    //       return 1;
    //   } else {
    //   return -1;
    //   }
    }
}
