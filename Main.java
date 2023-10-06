import javax.sound.midi.Soundbank;
import javax.swing.text.Style;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args)  {
        ArrayList<Book> bookList = new ArrayList<>();
      //  bookList.add(new Book("Mark Twain", "Adventures of Tom Sawyer", "fiction", 2009));
//        bookList.add(new Book("Mark Twain","Adventures of Tom Sawyer","fiction",2009));
//        bookList.add(new Book("Chethan Bhagath","Making India Awesome","nonFiction",1945));
//        bookList.add(new Book("Jawaharlal Nehru","A Bunch Of Old Letters","nonFiction",1940));
//        bookList.add(new Book("James Clear","Atomic Habits","nonFiction",2017));

        System.out.println("Welcome To The Library!");


            try {
                boolean empty = bookList.isEmpty();
                if(!empty)
                {
                    for(Book book:bookList)
                        System.out.println(book);

                }
                else throw new BookNotFoundException("Book is not found");

            } catch (BookNotFoundException e) {
                System.out.println(e);
            }
InterfaceImpl method=new InterfaceImpl();
            method.checkout();
            method.returnItem();



    }
}






