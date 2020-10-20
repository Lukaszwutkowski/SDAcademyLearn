package genericTypes.animals;

import java.util.Arrays;

public class AnimalTest {
    public static void main(String[] args) {
        Animal[] animal = {new Cat("Persian", 10), new Dog("German Shepherd", " beef"), new Horse("Arab", true)};
        AnimalHouse<Animal> animals = new AnimalHouse<>(animal);
        System.out.println(Arrays.toString(animals.getAnimals()));
    }
}
