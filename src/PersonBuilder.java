
public class PersonBuilder  {
    String name;
    String surname;
    int age;
    String address;
    public PersonBuilder setName(String name) throws IllegalArgumentException {
        if ("".equals(name)) {
            throw new IllegalArgumentException("Введено не корректное имя");
        }
        this.name = name;
        return PersonBuilder.this;
    }
    public PersonBuilder setSurname(String surname) throws IllegalArgumentException {
        if ("".equals(surname)) {
            throw new IllegalArgumentException("Введена не корректная фамилия");
        }
        this.surname = surname;
        return PersonBuilder.this;
    }
    public PersonBuilder setAge(int age) throws IllegalArgumentException {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Введен не корректный возраст");
        }
        this.age = age;
        return PersonBuilder.this;
    }
    public PersonBuilder setAddress(String address) throws IllegalArgumentException {
        if ("".equals(address)) {
            throw new IllegalArgumentException("Введен не корректный адрес");
        }
        this.address = address;
        return PersonBuilder.this;
    }

    public Person build() throws IllegalStateException {
        if (name == null || surname == null) {
            throw new IllegalStateException("Необходимо ввести имя и фамилию");
        }

        if (age > 0 && address != null) {
        return new Person(name, surname, age, address);
        }
        if (age > 0) {
        return new Person(name, surname, age);
        }
        return new Person(name, surname);
    }
}
