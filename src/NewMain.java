public class NewMain {
    public static void main(String[] args) {
        //book1.setYear();
        Book book1 = new Book("'Война и мир'", 1900, "Лев Толстой");
        System.out.println(book1.getAuthor() + book1.getName() + book1.getYear());
        book1.setYear(1999);
        System.out.println(book1.getAuthor() + book1.getName() + book1.getYear());
    }
}
