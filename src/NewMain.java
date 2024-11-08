public class NewMain {
    public static void main(String[] args) {
Book book1 =  new Book("Капитанская дочь", 1990, new Author("Александр","Пушкин"));
        System.out.printf("\"%s\",%s,%s %s",
                book1.getName(),
                book1.getYear(),
                book1.getAuthor().getFirstName(),
                book1.getAuthor().getLastName()
        );
        System.out.println(" ");
book1.setYear(1999);
        System.out.printf("\"%s\",%s,%s %s",
                book1.getName(),
                book1.getYear(),
                book1.getAuthor().getFirstName(),
                book1.getAuthor().getLastName()
        );
    }
}
