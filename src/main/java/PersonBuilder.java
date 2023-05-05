//Создайте статический вложенный класс (static nested class) как класс
// Builder, а затем скопируйте все поля из внешнего класса в класс Builder.
// Мы должны следовать соглашению об именах, поэтому если имя класса Person,
// то класс Builder должен называться как PersonBuilder.
public class PersonBuilder {
    protected String name;
    protected String surname;
    protected int age;
    protected String address;

    //Класс Builder должен иметь общедоступный конструктор со всеми необходимыми
// полями в качестве параметров.
    public PersonBuilder() {
    }

    //Класс Builder должен иметь методы для установки необязательных параметров,
//и он должен возвращать тот же объект Builder после установки
// необязательного поля.
    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    //Последним шагом является предоставление метода build() в классе Builder,
// который будет возвращать объект, необходимый клиентской программе.
// Для этого нам нужно иметь частный конструктор в основном классе
// с классом Builder в качестве аргумента.
    public Person build() {
        return new Person(this);
    }
}