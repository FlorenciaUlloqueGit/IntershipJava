package Tarea2;

public class TestBook {
    public static void main(String[] args) {
        Author author = new Author("Gabriel garcia Marquez", "gmarquez@gmail.com", 'M');
        Author author2 = new Author("Gabriel García Lorca", "ggarcia@gmail.com", 'M');

        Book book = new Book("A hundred years lonely",author , 1500, 7 );

        Book book2  = new Book("blood weeding",author2 , 1350, 3 );

        System.out.println(book.getAuthor().getName());
        System.out.println(book2.getAuthor().getName());

        System.out.println("---------------------------------------------------");
        System.out.println(book.toString());
        System.out.println(book2.toString());

        System.out.println("---------------------------------------------------");
        System.out.println(book.getNameAuthor());
        System.out.println(book.getEmailAuthor());
        System.out.println(book.getGenderAuthor());
    }


}
