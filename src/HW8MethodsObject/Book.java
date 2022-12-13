package HW8MethodsObject;

import java.util.Objects;

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

// Метод @Override toString
    @Override
    public String toString() {
        return this.autorName + " - " + this.bookName + ", " + this.publishingYear;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Book book = (Book) o;
//        return publishingYear == book.publishingYear && autorName.equals(book.autorName) && bookName.equals(book.bookName);
//    }

    //// Метод @Override equals
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book c1 = (Book) other;
        return bookName.equals(c1.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autorName, bookName, publishingYear);
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
