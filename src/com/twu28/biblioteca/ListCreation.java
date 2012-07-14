package com.twu28.biblioteca;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Sumedha Verma
 * Date: 7/14/12
 * Time: 6:47 PM
 *
 * This class creates a list of books and a list of customers.
 */
public class ListCreation {
    static ArrayList<Book> bookList=new ArrayList<Book>();
    static ArrayList<Customer> customerList=new ArrayList<Customer>();

    public void initializeLists() {
        initializeBookList();
        initializeCustomerList();
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

    public void initializeCustomerList() {
        addCustomer(1111,"customer1");
        addCustomer(2222,"customer2");
        addCustomer(3333,"customer3");
        addCustomer(4444,"customer4");
        addCustomer(5555,"customer5");
    }

    public void addCustomer(int library_no, String name) {
        Customer customer=new Customer();
        customer.setCustomerDetails(library_no, name);
        customerList.add(customer);
    }
}
