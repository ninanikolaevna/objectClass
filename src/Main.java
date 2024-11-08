
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Капитанская дочь",
                1990,
                new Author("Александр", "Пушкин")
        );
        System.out.println(book1);
        Book book2 = new Book("Война и мир",
                1990,
                new Author("Лев", "Толстой")
        );
        System.out.println(book2);
        Author author1 = new Author("Александр", "Пушкин");
        System.out.println(author1);
        Author author2 = new Author("Лев", "Толстой");
        System.out.println(author2);
        System.out.println(author1.equals(author2));
        System.out.println(book1.equalsYears(book2));
    }
}