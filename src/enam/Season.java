package enam;

public enum Season {
    SUMMER(35), WINTER(-30), AUTUMN(10), SPRING(20);

    private int temp;

    Season(int temp) {
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }
}
