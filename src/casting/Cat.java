package casting;

public class Cat extends Animal implements Meow{

    public void eat() {
        System.out.println("Я кушаю кошачий корм");
    }

    public void meow() {
        System.out.println("Мяу");
    }
}
