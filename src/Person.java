import java.util.Objects;

public class Person {
    protected final String name;
    protected final String surname;
    protected  int age;
    protected  String address;



    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        if (age > 0 && age < 150){
            this.age = age;
        }
    }
    public Person(String name, String surname, int age,String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
        }

    public boolean hasAge() {
        return age > 0;
    }
    public boolean hasAddress() {
        return address != null;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getAge() {
        return age;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void happyBirthday() {
        if (hasAge()) {
            age++;
        }
    }

    @Override
    public String toString() {
        return " Имя: " + name
                + ", Фамилия: " + surname
                + ", Возраст: " + age
                + ", Адрес: " + address;
    }

    @Override
    public int hashCode() {
        int prime = 31;
        return prime* Objects.hash(name, age, address);
    }
        public PersonBuilder newChildBuilder() {
        return new PersonBuilder().setSurname(this.surname).setAddress(this.address);
    }

}
