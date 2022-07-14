package equalsAndHashCode;

public class EqualsAndHashCode {
    public static void main(String[] args) {
        Person ivan = new Person(1, "Ivan", "Ivanov");
        Person petr = new Person(1, "Petr", "Petrov");

        System.out.println(ivan.hashCode());
        System.out.println(petr.hashCode());
        System.out.println(ivan.equals(petr));
    }
}
