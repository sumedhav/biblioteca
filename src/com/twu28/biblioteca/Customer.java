package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: Sumedha Verma
 * Date: 7/14/12
 * Time: 5:28 PM
 *
 * This class contains attributes of the customer nad methods to handle them.
 */
public class Customer {

    int library_number;
    String name;

    public void setCustomerDetails(int library_number, String name) {
        this.library_number=library_number;
        this.name=name;
    }

    public int getLibraryNumber() {
        return library_number;
    }

    public void viewCustomerDetails() {
        System.out.println("Details:");
        System.out.println("Library number: "+library_number);
        System.out.println("Name: "+name);
    }
}
