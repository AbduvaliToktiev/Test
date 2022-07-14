package Error_Exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionMain {
    public static void main(String[] args) throws IOException {
        Person[] persons = new Person[2];
        Person person1 = new Person();
        Person person2 = new Person();
        person1.setAge(20);
        person2.setAge(25);
        persons[0] = person1;
        persons[1] = person2;
        for (Person p : persons) {
            try {
                System.out.println(p.getAge());
                persons[1] = null;
                BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Username\\Desktop\\test.txt"));
                String firstString = reader.readLine();
                System.out.println(firstString);
                int num2 = 5 / 0;
            } catch (FileNotFoundException found) {
                System.out.println(found.getMessage() + " {Файл не найден!}");
            } catch (NullPointerException exception) {
                System.out.println(exception.getMessage() + " {Ошибка объекта не существует!}");
            } catch (ArithmeticException arithmetic) {
                System.out.println(arithmetic.getMessage() + " {Арифметическая ошибка!}");
            }
        }
    }
}
