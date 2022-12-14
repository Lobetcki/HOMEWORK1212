package HW8MethodsObject;

public class Book {
// ОПИСАНИЕ КЛАССА
    private Autor autorName;
    private String bookName;
    private int publishingYear;

// КОНСТРУКТОР
    public Book(Autor autorName, String bookName, int publishingYear) {
        this.autorName = autorName;
        this.bookName = bookName;
        this.publishingYear = publishingYear;
    }

// ГЕТЫ
    public Autor getAutorName() {
        return this.autorName;
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
