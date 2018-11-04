package rbru.quickstart001;

public class Library {

    private   static final int LIBRARY_CAPACITY = 10;
    Book[] lib = new Book[LIBRARY_CAPACITY];



    public int curLibraryBookCount(){
        int count = 0;
        for (int i = 0; i<LIBRARY_CAPACITY; i++){
            if(lib[i]!=null) count++;
        }
        return count;
    }



    public void loan(Book book) throws BookLoanException, BookNotFoundException{
        boolean a = false; //переменная, в которой отмечаем найдена ли книга
        for (int i = 0; i<LIBRARY_CAPACITY; i++)
        {   if(lib[i] == null)
        {
            continue;
        }
            if(lib[i].getId() == book.getId())
            {
                a = true;
                break;
            }

        }

        if(a == false)
            throw  new BookNotFoundException("Запрашиваемая книга с id "+book.getId()+" не найдена", book.getId());


        if(book.isOnLoan())
            throw new BookLoanException("Книга с id "+ book.getId()+" уже выдана", book.getId());

        book.setOnLoan(true);
        System.out.println("выдана книга с id "+book.getId());


    }

    public void add (Book newBook) {


        lib[curLibraryBookCount()] = newBook;
        //System.out.println("count after add " + curLibraryBookCount());


    }
    public void add2 (Book newBook) throws NoEmptySlotsInLibrary {

        if (curLibraryBookCount()==LIBRARY_CAPACITY)
            throw new NoEmptySlotsInLibrary("Библиотека заполнена");
        lib[curLibraryBookCount()] = newBook;
        //System.out.println("count after add " + curLibraryBookCount());


    }

    public void remove (Book remBook) {
        for (int i = 0; i < LIBRARY_CAPACITY; i++) {
            if (lib[i] == null) {
                continue;
            }
            if (lib[i].getId() == remBook.getId())
                lib[i] = null;


        }
        //System.out.println("count after remove " + curLibraryBookCount());
    }

    public String getBookList (){
        String result = "Books in library:"+"\r\n";
        for (int i = 0; i<LIBRARY_CAPACITY; i++)
            if(lib[i]!=null)
            result = result+lib[i].toString()+"\r\n";
        return result;
    }




}
