package interfacePraktik;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите температуру: ");
        double temperature = sc.nextDouble();
        System.out.println("tC = " +
                new CelsiusConverter().getConvertedValue(temperature));
        System.out.println("tK = " +
                new KelvinConverter().getConvertedValue(temperature));
        System.out.println("tF = " +
                new FahrenheitConverter().getConvertedValue(temperature));
    }
}
