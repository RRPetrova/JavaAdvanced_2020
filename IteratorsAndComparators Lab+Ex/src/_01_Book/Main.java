package _01_Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Scanner scanner = new Scanner(System.in);
        Book bookOne = new Book("Animal Farm", 2003, "George Orwell");
        Book bookThree = new Book("The Documents in the Case", 2002);
        Book bookTwo = new Book("The Documents in the Case", 1930, "Dorothy Sayers", "Robert Eustace");

        List<Book> listBooks = new ArrayList<>();
        listBooks.add(bookOne);
        listBooks.add(bookThree);
        listBooks.add(bookTwo);
    }
}
