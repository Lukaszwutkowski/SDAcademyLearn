package collections.bookStore;

import java.util.Objects;

public class Author {

    private String firstName;
    private String lastName;
    private char gender;

    public Author(String firstName, String lastName, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return gender == author.gender &&
                firstName.equals(author.firstName) &&
                lastName.equals(author.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, gender);
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                '}';
    }
}
