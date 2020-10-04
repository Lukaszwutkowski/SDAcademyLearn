package classesAndInterfaces;

public class Test {
    public static void main(String[] args) {
        UserValidator userValidator = new UserValidator();
        String[] results = userValidator.validateEmails("pb@", "@yahoo.com");
        System.out.println(results[0]);
        System.out.println(results[1]);
    }
}
