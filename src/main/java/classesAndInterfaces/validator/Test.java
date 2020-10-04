package classesAndInterfaces.validator;

public class Test {
    public static void main(String[] args) {
        User1();

        User2();

    }

    private static void User2() {
        User user = new User();
        user.setFirstName("Steve", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return !input.isEmpty() &&
                        Character.isUpperCase(input.charAt(0));
            }
        });
        user.setLastName("Smith", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return input != null && !input.isEmpty() &&
                        Character.isUpperCase(input.charAt(0));
            }
        });
        user.setAge(32, new Validator<Integer>() {
            @Override
            public boolean validate(Integer input) {
                return input >= 0 && input <= 150;
            }
        });
        user.setLogin("SteveSmith", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return input.length() == 10;
            }
        });
        user.setPassword("password!", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return input.contains("!");
            }
        });
        System.out.println(user);
    }

    private static void User1() {
        User user = new User();
        user.setFirstName("John", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return !input.isEmpty() &&
                        Character.isUpperCase(input.charAt(0));
            }
        });
        user.setLastName("Smith", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return input != null && !input.isEmpty() &&
                        Character.isUpperCase(input.charAt(0));
            }
        });
        user.setAge(20, new Validator<Integer>() {
            @Override
            public boolean validate(Integer input) {
                return input >= 0 && input <= 150;
            }
        });
        user.setLogin("test", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return input.length() == 10;
            }
        });
        user.setPassword("test", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return input.contains("!");
            }
        });
        System.out.println(user);
    }
}

