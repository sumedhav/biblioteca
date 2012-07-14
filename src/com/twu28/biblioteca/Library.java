package com.twu28.biblioteca;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Sumedha Verma
 * Date: 7/13/12
 * Time: 5:55 PM
 *
 */
public class Library {

    ArrayList<Book> bookList=new ArrayList<Book>();

    //prints the list of menu options on the console
    public void printMenuOptions() {
        System.out.println("-------MENU-------");
        System.out.println("Enter 1 to view all the books in the library");
        System.out.println("Enter 2 to reserve a book");
        System.out.println("Enter 3 to check your library number");
    }

    //checks the menu option entered by the user
    public Object checkOption(String stringOption) {
        int option;
        String optionSelected="Select a valid option!";
        try {
            option=Integer.parseInt(stringOption);
        } catch (Exception e) {
            System.out.println(optionSelected);
            return optionSelected;
        }
        switch(option) {
            case 1: optionSelected="view books";
                    viewBookList();
                    break;
            case 2: optionSelected="reserve books";
                    break;
            case 3: optionSelected="check library number";
                    break;
            default: break;
        }
        System.out.println(optionSelected);
        return optionSelected;
    }

    //displays the list of books
    public void viewBookList() {
        initializeBookList();
        int serial_no=1;
        System.out.println("\n---------List of Books---------");
        System.out.printf("%-5s%-15s%-15s%-15s%-12s\n", "SNo.","Title","Author","ISBN-No.","Availability");
        for (Book book : bookList) {
            System.out.printf("%-5d", serial_no);
            book.viewBookDetails();
            serial_no++;
        }
    }

    public void reserveBook() {

    }

    //creates a list of books
    public void initializeBookList() {
        addBook("Book1","Author1","ISBN-1111","available");
        addBook("Book2","Author2","ISBN-2222","not available");
        addBook("Book3","Author3","ISBN-3333","available");
        addBook("Book4","Author4","ISBN-4444","available");
        addBook("Book5","Author5","ISBN-5555","not available");
    }

    //adds a book to the list of books
    public void addBook(String title, String author, String isbn_no, String availability) {
        Book book=new Book(title, author, isbn_no, availability);
        bookList.add(book);
    }

    public static void main(String args[]) {
        Library library=new Library();
        LibraryHelper libraryHelper=new LibraryHelper();
        String selectedOption, choice="y";
        System.out.println("\n!!!Welcome to the Banglore Public Library System!!!\n");
        while(choice.equals("y") || choice.equals("Y")) {
            library.printMenuOptions();
            selectedOption=libraryHelper.getUserInput("\nEnter your option");
            library.checkOption(selectedOption);
            choice=libraryHelper.getUserInput("\nDo you want to continue? (y/n)");
            System.out.println();
        }
    }

}
