package streamExcersises;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageNumbFromListByStream {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int listSize;
        int a = 0;
        List<Integer> numbers = new ArrayList<>();


        System.out.println("How many numbers do you want to put into Array List?:");
        listSize = scanner.nextInt();
        while (a < listSize) {
            System.out.println("Put a number you want to add to list");
            numbers.add(scanner.nextInt());
            a++;
            if (a == listSize) {
                break;
            }
        }
        System.out.println("List of numbers: " + numbers);

        double average = numbers.stream()
                .mapToInt(i -> i)
                .average()
                .getAsDouble();

        System.out.println("Average number from List is: " + average);


    }
}
