package enam;

public enum Animal {
    DOG("сабака"), CAT("кошка"), FROG("лягушка");

    private String translate;

    Animal(String translate) {
        this.translate = translate;
    }

    public String getTranslate() {
        return translate;
    }

    public String toString() {
        return "Перевод на русский язык: " + translate;
    }
}
