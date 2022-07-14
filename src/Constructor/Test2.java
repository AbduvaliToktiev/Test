package Constructor;


public class Test2 {
    public static void main(String[] args) {
        Constructor constructor =  new Constructor(1,2);
        constructor.show();
    }
}

class Main {
    public static void main(String... sss) {
        print("Как","же","прекрасно","изучать","Java");
    }

    static void print(String... words){
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
