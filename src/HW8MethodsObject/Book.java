package HW8MethodsObject;

public class Book {
// ОПИСАНИЕ КЛАССА
    private String autorName;
    private String autorLastName;
    private String bookName;
    private int publishingYear;

// КОНСТРУКТОР
    public Book(Autor autorName, Autor autorLastName, String bookName, int publishingYear) {
        this.autorName = autorName;
        this.autorLastName = autorLastName;
        this.bookName = bookName;
        this.publishingYear = publishingYear;
    }

// ГЕТЫ
    public Autor getAutorName() {
        return this.autorName;
    }

    public Autor getAutorLastName() {
        return this.autorLastName;
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }
// СЕТЫ
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

}
