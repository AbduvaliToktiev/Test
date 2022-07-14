package Constructor;

public class Constructor {
    int a;
    int b;
    int c;

    public Constructor(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Constructor(int a, int b, int c) {
        // Вызов конструктора с двумя параметрами.
        this(a, b);
        this.c = c;
    }

    public void show() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
