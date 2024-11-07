public class Book {
    private String name;
    private int year;
    private String Author;

    //создаю конструктор со всеми полями
    public Book(String name, int year, String Author) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }
}

