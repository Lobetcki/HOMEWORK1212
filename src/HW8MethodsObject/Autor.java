package HW8MethodsObject;

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
