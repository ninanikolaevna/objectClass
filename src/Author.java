public class Author {
    private String firstName;
    private String lastName;
//создаю конструктор с данными об имени и фамилии автора
    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


}
