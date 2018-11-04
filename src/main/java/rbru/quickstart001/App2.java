package rbru.quickstart001;

public class App2 {

    private static void testLibLoan(Library lib, Book book){
        System.out.println("До выдачи:");
        System.out.println(lib.getBookList());
        try{
            lib.loan(book);
        }
        catch (BookNotFoundException ex) {
            System.out.println(ex);

        }
        catch (BookLoanException ex) {
            System.out.println(ex);
        }
        System.out.println("После выдачи:");
        System.out.println(lib.getBookList());

    }

    private static void testAddBook(Library lib, Book book){
        try {
            lib.add2(book);
        } catch (NoEmptySlotsInLibrary ex) {
            System.out.println(ex);
        }
    }

    public static void main( String[] args )  throws NoEmptySlotsInLibrary {

        Library lib1 = new Library();

        Book book1 = new Book(1,"Александр Дюма", "20 лет спустя", 1991, "5-253-00359-2");
        Book book2 = new Book(2,"Джек Лондон", "Мятеж на \"Эльсиноре\"", 1993, "5-85201-051-0");
        Book book3 = new Book(3,"Бернар Вербер", "Голос земли", 2015, "978-5-386-08599-5");
        Book book4 = new Book(4,"Дж. К. Ролинг", "Гарри Поттер и философский камень", 2002, "5-353-00308-X");
        Book book5 = new Book(5,"Стивен Кинг", "Четыре сезона", 2015, "978-5-17-078280-2");
        Book book6 = new Book(6,"Дж. К. Ролинг", "Гарри поттер и тайная комната", 2002, "5-353-00309-8");
        Book book7 = new Book(7,"Дж. К. Ролинг", "Гарри поттер и дары смерти", 2007, "978-5-353-02907-6");
        Book book8 = new Book(8,"Джордж Р.Р. Мартин", "Пир стервятников", 2015, "978-5-17-076208-8");
        Book book9 = new Book(9,"Джордж Р.Р. Мартин", "Игра престолов", 2016, "978-5-17-079589-5");
        Book book10 = new Book(15,"Джордж Р.Р. Мартин", "Буря мечей", 2015, "978-5-17-076208-8");
        Book book11 = new Book(11,"Джордж Р.Р. Мартин", "Танец с драконами: грезы и пыль", 2015, "978-5-17-081175-5");
        Book book12 = new Book(22,"Джордж Р.Р. Мартин", "Танец с драконами: искры над пеплом", 2015, "978-5-17-078401-1");

        testAddBook(lib1, book1);
        testAddBook(lib1, book2);
        testAddBook(lib1, book3);
        testAddBook(lib1, book4);
        testAddBook(lib1, book5);
        testAddBook(lib1, book6);
        testAddBook(lib1, book7);
        testAddBook(lib1, book8);
        testAddBook(lib1, book9);
        testAddBook(lib1, book10);
        testAddBook(lib1, book11);

        lib1.remove(book2);
        lib1.remove(book10);


        testLibLoan(lib1, book1);
        testLibLoan(lib1, book3);
        testLibLoan(lib1, book12);
        testLibLoan(lib1, book4);
        testLibLoan(lib1, book10);


    }
}
