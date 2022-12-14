package HW8MethodsObject;

import java.util.Objects;

public class Autor {
    // ОПИСАНИЕ КЛАССА
    private String name;
    private String lastName;
    private int age;

    // КОНСТРУКТОР
    public Autor(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    // Метод @Override toString
    @Override
    public String toString() {
        return this.name + " " + this.lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autor autor = (Autor) o;
        return lastName.equals(autor.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName);
    }

    // Метод @Override equals
//    @Override
//    public boolean equals(Object other) {
//        if (this.getClass() != other.getClass()) {
//            return false;
//        }
//        Autor c2 = (Autor) other;
//        return lastName.equals(c2.lastName);
//    }


//    @Override
//    public int hashCode() {
//        return java.util.Objects.hash(lastName);

    // ГЕТЫ
    public String getName() {
        return this.name;
    }
    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    // СЕТЫ
    public void setName(String name) {
        this.name = name;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAge(int age) {
        this.age = age;
    }

}
