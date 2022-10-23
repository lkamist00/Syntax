package homework.class18;

public class Task2 {

    /*
    Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
    Instance variables are being initialized
    Both Constructors are being executed
     */
    class Book {


        String name;
        String author;
        int pages;
        int ISBN;


        public Book(String name, String author, int pages) {
            this.name = name;
            this.author = author;
            this.pages = pages;
        }

        public Book(String name, String author, int pages, int ISBN) {
            this(name, author, pages);
            this.ISBN=ISBN;
        }

        //public static void main(String[] args) {

           // Book book1=new Book("The Machiavelians","Burnham", 300, 56789);
           // Book book2=new Book("1984","Orwel", 20);
            
        //}





    }




}
