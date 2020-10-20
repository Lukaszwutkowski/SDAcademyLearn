package genericTypes.exercise2;

public class Test {
    public static void main(String[] args) {
        Integer[] tab = {10, 21, 33, 40, 50, 60};
        int counter = Utils.countIf(tab, value -> value % 3 == 0);
        System.out.println(counter);
    }
}
