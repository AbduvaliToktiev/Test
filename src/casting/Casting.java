package casting;

public class Casting {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Animal animal = cat;
        Meow meow = new Cat();
        Animal animal1 = new Cat();
        ((Cat) animal1).meow();


    }
}
