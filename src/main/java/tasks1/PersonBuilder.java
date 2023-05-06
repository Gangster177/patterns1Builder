package tasks1;

//Создайте статический вложенный класс (static nested class) как класс
// Builder, а затем скопируйте все поля из внешнего класса в класс Builder.
// Мы должны следовать соглашению об именах, поэтому если имя класса tasks1.Person,
// то класс Builder должен называться как tasks1.PersonBuilder.
public class PersonBuilder {
    protected String name;
    protected String surname;
    protected int age;
    protected String address;

    //Класс Builder должен иметь общедоступный конструктор
    public PersonBuilder() {
    }

    //Класс Builder должен иметь методы для установки параметров
    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Age isn't allowed");
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    //Последним шагом является предоставление метода build() в классе Builder,
// который будет возвращать объект, необходимый клиентской программе.

    public Person build() {
        if (this.name == null || this.surname == null) {
            throw new IllegalStateException("tasks1.Person without name/surname can't exist");
        }
        return new Person(this);
    }
}