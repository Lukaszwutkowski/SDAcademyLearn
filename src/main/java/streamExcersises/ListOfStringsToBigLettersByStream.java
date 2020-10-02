package streamExcersises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOfStringsToBigLettersByStream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int listSize;
        int a = 0;
        List<String> words = new ArrayList<>();


        System.out.println("How many words do you want to put into Array List?:");
        listSize = scanner.nextInt();

        while (a < listSize) {
            System.out.println("Put a word you want to add to list");
            words.add(scanner.next());
            a++;
            if (a == listSize) {
                break;
            }
        }

        System.out.println("List of words: " + words);

          List<String> upperCase = words.stream()
                  .map(String::toUpperCase)
                  .collect(Collectors.toList());

        System.out.println("List of all words to UpperCase: " + upperCase);
    }
}
