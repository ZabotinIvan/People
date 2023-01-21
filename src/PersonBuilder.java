
public class PersonBuilder extends IllegalArgumentException {
    String name;
    String surname;
    int age;
    String address;
    public PersonBuilder setName(String name) {
        this.name = name;
        return PersonBuilder.this;
    }
    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return PersonBuilder.this;
    }
    public PersonBuilder setAge(int age) {
        this.age = age;
        return PersonBuilder.this;
    }
    public PersonBuilder setAddress(String address) {
        this.address = address;
        return PersonBuilder.this;
    }

    public Person build() {
        if (name != null && surname != null && age > 0 && address != null) {
            return new Person(name, surname, age, address);
        }

        if (name != null && surname != null && age > 0) {
            return new Person(name, surname, age);
        }
        if (name != null && surname != null) {
            return new Person(name, surname);
        }

        return null;
    }

}
