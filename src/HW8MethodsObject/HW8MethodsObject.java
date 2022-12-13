package HW8MethodsObject;

public class HW8MethodsObject {

    public static void main(String[] args) {

        //  СОЗДАЕМ ОБЪЕКТ АВТОР
        Autor tolstoy = new Autor("Лев", "Толстой", 55);
        Autor dostoevski = new Autor("Николай", "Достоевский", 75);

        //  СОЗДАЕМ ОБЪЕКТ КНИГА
        Book warAndPeace = new Book(tolstoy.getName(), tolstoy.getLastName(), "Война и Мир", 1845);
        Book prestuplenie = new Book(dostoevski.getName(), dostoevski.getLastName(), "Преступление и наказание", 1865);

       //   МЕНЯЕМ ЗНАЧЕНИЯ
        warAndPeace.setPublishingYear(1820);
        prestuplenie.setPublishingYear(1765);
        dostoevski.setName("Федор");

        // ВЫВОДИМ НА КОНСОЛЬ ДАННЫЕ
        //System.out.println(warAndPeace.getAutorName() + " " + warAndPeace.getAutorLastName() + " - " + warAndPeace.getBookName() + ", " + warAndPeace.getPublishingYear() + " год.");
        //System.out.println(dostoevski.getAuthorName() + " " + dostoevski.getAuthorLastName() + " - " + prestuplenie.getBookName() + ", " + prestuplenie.getPublishingYear() + " год.");
        //System.out.println(tolstoy.getAuthorName() + " " + tolstoy.getAuthorLastName() + ", " + tolstoy.getAge() + " год.");
        //System.out.println(dostoevski.getAuthorName() + " " + dostoevski.getAuthorLastName() + ", " + dostoevski.getAge() + " год.");


    }
}

