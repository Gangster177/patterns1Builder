import java.util.Objects;
import java.util.OptionalInt;

public class Person {
    private final String name;
    private final String surname;
    private int age;
    private String address;

    // Нам нужно иметь частный конструктор в основном классе
// с классом Builder в качестве аргумента.
    public Person(PersonBuilder personBuilder) {
        this.name = personBuilder.name;
        this.surname = personBuilder.surname;
        this.age = personBuilder.age;
        this.address = personBuilder.address;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, String address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().setSurname(this.surname).setAddress(this.address);
    }

    public boolean hasAge() {
        if (getAge().isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public boolean hasAddress() {
        if (getAddress() != null) {
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public OptionalInt getAge() {
        OptionalInt optionalInt = OptionalInt.of(this.age);
        return optionalInt;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        this.age += 1;
    }

    @Override
    public String toString() {
        // return "Name: " + getName() + " surname: " + getSurname() + "\n age: ";
        return getName() + " " + getSurname();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, address);
    }
}