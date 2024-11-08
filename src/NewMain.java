public class NewMain {
    public static void main(String[] args) {
        Book book1 = new Book("Капитанская дочь", 1999, new Author("Александр", "Пушкин"));
        System.out.println(book1);

        book1.setYear(1990);
        System.out.println(book1);
    }
}
