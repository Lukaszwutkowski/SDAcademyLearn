import java.util.Scanner;

public class TurnBackNumberWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int reversNumber = 0;

        System.out.println("Write your number. It has to be at least two digits number.");
        number = scanner.nextInt();

        while (number != 0)
        {
            reversNumber = reversNumber * 10;
            reversNumber = reversNumber + number % 10;
            number = number/10;
        }

        System.out.println("Reverse of input number is: " + reversNumber);

    }
}
