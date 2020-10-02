package streamExcersises;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfStringsStreamExcersises {
    public static void main(String[] args) {

        List<String> animals = new ArrayList<>();
        animals.add("Alligator");
        animals.add("Crocodile");
        animals.add("Elephant");
        animals.add("Giraffe");
        animals.add("Horse");
        animals.add("Delphine");
        animals.add("Zebra");
        animals.add("Bird");
        animals.add("Shark");
        animals.add("Fish");
        animals.add("Panther");
        animals.add("Lion");

        System.out.println("List of animals: " + animals);

        List<String> beginOnA = animals.stream()
                .map(String::toLowerCase)
                .filter(s -> s.startsWith("a"))
                .collect(Collectors.toList());

        System.out.println("All animals who starts on letter 'a': " + beginOnA);
    }
}
