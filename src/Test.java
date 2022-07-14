import java.io.File;
import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("file1.txt");
        fileWriter.write("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        fileWriter.close();
        FileReader fileReader = new FileReader("file1.txt");
        Scanner scan = new Scanner(fileReader);
        int len = fileReader.read();
        if (len < 100) {
            while (scan.hasNextLine()) {
                System.out.println(scan.nextLine());
            }
        }
    }
}

class Program {
    public static void main(String[] args) {

        try (FileReader reader = new FileReader("notes3.txt")) {
            char[] buf = new char[256];
            int c;
            while ((c = reader.read(buf)) > 0) {

                if (c < 256) {
                    buf = Arrays.copyOf(buf, c);
                }
                System.out.print(buf);
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}

class FirstTask {
    public static void main(String[] args) {
        // ITVDN.com 1 из ТОП 20 тестовых заданий на интервью для Java разработчика
        String st = "Задача 1";
        StringBuilder stB = new StringBuilder();
        stB.append(st);
        stB = stB.reverse();       // используем StringBuilder для переворота строки
        System.out.println(stB);
    }
}

class SecondTask {
    public static void main(String[] args) {
        //ITVDN.com 2 из ТОП 20 тестовых заданий на интервью для Java разработчика
        String st = "Учимся программировать";
        char symbols[] = st.toCharArray();  // конвертируем строку в массив символов, затем выводим символы на экран в обратном порядке
        for (int x = symbols.length - 1; x >= 0; x--) {
            System.out.print(symbols[x]);
        }
    }
}


// в этом классе мы получаем размер файла
class FileSize {
    public static void main(String[] args) {
        File file = new File("/Users/prologistic/Desktop/TestVideo.mov");
        if (file.exists()) {
            System.out.println(getFileSizeBytes(file));
            System.out.println(getFileSizeKiloBytes(file));
            System.out.println(getFileSizeMegaBytes(file));
        } else System.out.println("Файла нет!");

    }

    // метод возвращает размер файла в мегабайтах
    // длину файла делим на 1 мегабайт (1024 * 1024 байт) и узнаем количество мегабайт
    private static String getFileSizeMegaBytes(File file) {
        return (double) file.length() / (1024 * 1024) + " mb";
    }

    // метод возвращает размер файла в килобайтах
    // длину файла делим на 1 килобайт (1024 байт) и узнаем количество килобайт
    private static String getFileSizeKiloBytes(File file) {
        return (double) file.length() / 1024 + " kb";
    }

    // просто вызываем метод length() и получаем размер файла в байтах
    private static String getFileSizeBytes(File file) {
        return file.length() + " bytes";
    }
}


class SplitIt {
    public static void main(String args[]) {
        String person = "name=john age=13 year=2001";
        for (String p : person.split("\\s")) {
            String[] keyValue = p.split("=");
            System.out.println(keyValue[0] + " = " + keyValue[1]);
        }
    }
}

class RemovingSpace {
    /**
     * @param args Removing Space Using Matcher
     */
    public static void main(String[] args) {
        String str = "jld fdkjg jfdg ";
        String pattern = "[\\s]";
        String replace = "";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(str);

        str = m.replaceAll(replace);
        System.out.println(str);
    }
}


class Convertirovat {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("A");
        ll.add("B");
        ll.add("C");
        ll.add("D");

        List<String> myAL = new ArrayList<>(ll);

        for (Object alObject : myAL)
            System.out.println(alObject);
    }
}

class Main {
    public static void main(String[] args) {
        String str1 = new String("Hello World!");
        String str2 = new String("My name is Earl");
        String str3 = new String("I love Java");
        String str4 = new String("I live in Moscow");
        LinkedList<String> earlBio = new LinkedList<>();
        earlBio.add(str1);
        earlBio.add(str3);
        earlBio.add(1, str2);
        earlBio.remove(1);
        System.out.println(earlBio);
    }
}

class Car {

    String model;

    public Car(String model) {
        this.model = model;
    }

    public static void main(String[] args) {
        LinkedList<Car> cars = new LinkedList<>();
        Car ferrari = new Car("Ferrari 360 Spider");
        Car bugatti = new Car("Bugatti Veyron");
        Car lambo = new Car("Lamborghini Diablo");
        Car ford = new Car("Ford Mondeo");
        Car fiat = new Car("Fiat Ducato");

        cars.add(ferrari);
        cars.add(bugatti);
        cars.add(lambo);
        System.out.println(cars);

        cars.addFirst(ford);
        cars.addLast(fiat);
        System.out.println(cars);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                '}';
    }
}


class LinkedListDemo {
    public static void main(String args[]) {
        // creating an empty LinkedList
        LinkedList<String> list = new LinkedList<String>();
        // use add() method to add elements in the list
        list.add("Geeks");
        list.add("for");
        list.add("Geeks");
        list.add("10");
        list.add("20");
        // Output the present list
        System.out.println("The list is:" + list);
        // Adding new elements at the beginning
        list.addFirst("First");
        list.addFirst("At");
        // Displaying the new list
        System.out.println("The new List is:" + list);
    }
}

class MassInHashSet {
    public static void main(String[] args) {
        String[] strArray = {"eins", "zwei", "drei", "vier"};
// Перевод из массива в HashSet, например String.
        Set<String> strSet = Arrays.stream(strArray).collect(Collectors.toSet());
        System.out.println(strSet);
    }
}


