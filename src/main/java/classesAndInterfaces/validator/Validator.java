package classesAndInterfaces.validator;

public interface Validator<T> {

    boolean validate(T input);
}
