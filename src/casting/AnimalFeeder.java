package casting;

import java.util.List;

public class AnimalFeeder {

    public void feed(List animals) {
        animals.forEach(animal -> {
            animal.getClass();
            if (animal instanceof Cat) {
                ((Cat) animal).meow();
            }
        });
    }
}