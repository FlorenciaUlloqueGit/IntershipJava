package Tarea2;

public class TestAuthor {
    public static void main(String[] args) {

        Author author = new Author("Camilo Rassi", "crassi@gmail.com", 'M');
        System.out.println(author.toString());

        System.out.println("Changing the email");
        author.setEmail("camilorassi@gmail.com");
        System.out.println(author.toString());

    }
}
