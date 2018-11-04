package rbru.quickstart001;

public class BookLoanException extends Exception {

    private int id;

    public BookLoanException(String m)
    {
        super(m);
    }

    public BookLoanException(String m, int id)
    {
        super(m);
        this.id = id;
    }

}
