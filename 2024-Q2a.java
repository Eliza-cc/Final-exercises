package pkgfinal.pkg24;

class Book {
    private String title;
    private String author;
    private int yearPublished;
        
    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }
    
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getYearPublished(){
        return yearPublished;
    }
    
}

public class Q2 {
    public static void main(String[] args) {
        Book my = new Book("Harry Potter", "J.K. Rowling", 1997);
        System.out.println("Title: " + my.getTitle());
        System.out.println("Author: " + my.getAuthor());
        System.out.println("Year Published: " + my.getYearPublished());
        
    }
}
