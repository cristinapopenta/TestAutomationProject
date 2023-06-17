package Homework.Homework03;

public class Author {
    private String authorName;
    private String authorEmail;

    public Author(String name, String email) {
        System.out.println("Constructor cu parametri");
        this.authorName=name;
        this.authorEmail=email;
    }

    public String getName() {
        return authorName;
    }
    public String getEmail() {
        return authorEmail;
    }
}
