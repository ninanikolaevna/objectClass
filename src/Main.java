//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Капитанская дочь",
                1990,
                new Author("Александр", "Пушкин")
        );
        System.out.printf("\"%s\",%s,%s %s",
                book1.getName(),
                book1.getYear(),
                book1.getAuthor().getFirstName(),
                book1.getAuthor().getLastName()
        );

        Book book2 = new Book("Война и мир",
                1900,
                new Author("Лев", "Толстой")
        );
        System.out.println(" ");
        System.out.printf("\"%s\", %s, %s %s",
                book2.getName(),
                book2.getYear(),
                book2.getAuthor().getFirstName(),
                book2.getAuthor().getLastName()
        );
        System.out.println(" ");
        Author author1 = new Author("Лев", "Толстой");
        System.out.printf("%s %s",
                author1.getFirstName(), author1.getLastName());
        System.out.println(" ");
        Author author2 = new Author("Александр", "Пушкин");
        System.out.printf("%s %s",
                author2.getFirstName(), author2.getLastName());
    }
}