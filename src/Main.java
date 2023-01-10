public class Main {
    public static void main(String[] args) {

        Reader reader1 = new Reader(
                "Петров П.П.",
                20,
                "ИТ",
                "04.10.1985",
                "89165437744");

        Book book1 = new Book("Л.Н. Толстой", "Война и мир");
        Book book2 = new Book("А.С. Пушкин", "Евгений Онегин");


        reader1.takeBook(3);
        System.out.println();
        reader1.takeBook(book1, book2);
        System.out.println();
        reader1.takeBook("Приключения", "Словарь", "Энциклопедия");
        System.out.println();

        reader1.returnBook(3);
        System.out.println();
        reader1.returnBook("Приключения", "Словарь", "Энциклопедия");
        System.out.println();
        reader1.returnBook(book1, book2);
        System.out.println();
    }
}
