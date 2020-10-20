package genericTypes.exercise2;

interface Validator<T> {
    boolean validate(T value);
}
