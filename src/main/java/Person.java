import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;

    public Person(PersonBuilder personBuilder) {
        name = personBuilder.name;
        surname =personBuilder.surname;
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
        return "Name: " + getName() + " surname: " + getSurname() + "\n age: ";
    }

//    @Override
//    public int hashCode() { /*...*/ }
}