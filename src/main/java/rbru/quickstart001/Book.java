package rbru.quickstart001;

public class Book {
    private int id;
    private String author;
    private String title;
    private int year;
    private String ISBN;
    private boolean onLoan;

    public Book(int id, String author, String title, int year, String ISBN) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.year = year;
        this.ISBN = ISBN;
        this.onLoan = onLoan;
        this.onLoan = false;
    }

    public  String toString (){

        return "Book id: "+id
                + ", author: "+this.author
                + ", title: "+this.title
                + ", year of issue: "+this.year
                + ", ISBN: "+this.ISBN
                + ", onLoan: "+this.onLoan;
    }


    public int getId() {
        return id;
    }


    public boolean isOnLoan() {
        return onLoan;
    }

    public void setOnLoan(boolean onLoan) {
        this.onLoan = onLoan;
    }
}
