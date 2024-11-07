//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("'Война и мир'", 1900, "Лев Толстой");
        System.out.println(book1.getAuthor() + book1.getName() + book1.getYear());
        Book book2 = new Book("'Капитанская дочь'", 1990, "Александр Пушкин");
        System.out.println(book2.getAuthor() + book2.getName() + book2.getYear());
        Author author1 = new Author("Лев", "Толстой");
        Author author2 = new Author("Александр", "Пушкин");
    }
}