package HW8MethodsObject;

public class HW8MethodsObject {

    public static void main(String[] args) {

        //  СОЗДАЕМ ОБЪЕКТ АВТОР
        Autor tolstoy = new Autor("Лев", "Толстой", 55);
        Autor dostoevski = new Autor("Николай", "Достоевск", 75);

        //  СОЗДАЕМ ОБЪЕКТ КНИГА
        Book warAndPeace = new Book(tolstoy, "Война и Мир", 1845);
        Book prestuplenie = new Book(dostoevski, "Преступление", 1865);

        // ВЫВОДИМ НА КОНСОЛЬ ДАННЫЕ
        System.out.println(tolstoy + ", " + tolstoy.getAge() + " год.");
        System.out.println(dostoevski + ", " + dostoevski.getAge() +  " год.");
        System.out.println();

        System.out.println(warAndPeace + " год.");
        System.out.println(prestuplenie + " год.");
        System.out.println();

        // СРАВНИВАЕМ АВТОРОВ И КНИГИ
        Autor nickolaiDostoevski = new Autor("Николай", "Достоевск", 75);

        System.out.println(dostoevski.equals(nickolaiDostoevski) + " - сравниваем авторов.");
        System.out.println(dostoevski.hashCode());
        System.out.println(nickolaiDostoevski.hashCode());

        Book prestuplenieAndNakaz = new Book(dostoevski, "Преступление", 1865);
        System.out.println(prestuplenie.equals(prestuplenieAndNakaz) + " - сравниваем книги.");
        System.out.println(prestuplenie.hashCode());
        System.out.println(prestuplenieAndNakaz.hashCode());
        System.out.println();

        //   МЕНЯЕМ ЗНАЧЕНИЯ
        System.out.println("МЕНЯЕМ ЗНАЧЕНИЯ");
        warAndPeace.setPublishingYear(1820);
        prestuplenie.setBookName("Преступление и наказание");
        dostoevski.setName("Федор");
        dostoevski.setLastName("Достоевский");

        // СРАВНИВАЕМ АВТОРОВ И КНИГИ
        System.out.println(dostoevski.equals(nickolaiDostoevski) + " - сравниваем авторов.");
        System.out.println(dostoevski.hashCode());
        System.out.println(nickolaiDostoevski.hashCode());

        System.out.println(prestuplenie.equals(prestuplenieAndNakaz) + " - сравниваем книги.");
        System.out.println(prestuplenie.hashCode());
        System.out.println(prestuplenieAndNakaz.hashCode());

        // ВЫВОДИМ НА КОНСОЛЬ ДАННЫЕ
        System.out.println(warAndPeace + " год.");
        System.out.println(prestuplenie + " год.");
        System.out.println();

        System.out.println(tolstoy.getLastName() + ", " + tolstoy.getAge() + " год.");
        System.out.println(dostoevski + ", " + dostoevski.getAge() +  " год.");


    }
}

