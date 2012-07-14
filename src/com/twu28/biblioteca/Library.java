package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: Sumedha Verma
 * Date: 7/13/12
 * Time: 5:55 PM
 *
 * This class allows the user to view the books in the library, reserve a book for collection
 * and check their library number.
 */
public class Library {

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
                    viewBookList();  //view the list of books
                    break;
            case 2: optionSelected="reserve books";
                    viewBookList();
                    String selectedBook=new LibraryHelper().getUserInput("\nEnter the serial number of the book you want to reserve");
                    reserveBook(selectedBook);  //reserve the specified book if available
                    break;
            case 3: optionSelected="check library number";
                    String stringLibraryNumber=new LibraryHelper().getUserInput("\nEnter your library number");
                    checkLibraryNumber(stringLibraryNumber);
                    break;
            default: System.out.println(optionSelected);
                     break;
        }
        return optionSelected;
    }

    //displays the list of books
    public void viewBookList() {
        int serial_no=1;
        System.out.println("\n---------List of Books---------");
        System.out.printf("%-5s%-15s%-15s%-15s%-12s\n", "SNo.","Title","Author","ISBN-No.","Availability");
        for (Book book : ListCreation.bookList) {
            System.out.printf("%-5d", serial_no);
            book.viewBookDetails();  //printing the book details on the console
            serial_no++;
        }
    }

    //reserves the book if available
    public Object reserveBook(String selectedBook) {
        int selectedBookNumber;
        String outputString="Please enter a numerical value.";
        try {
            selectedBookNumber=Integer.parseInt(selectedBook);
        } catch(Exception e) {
            System.out.println(outputString);
            return outputString;
        }
        try {
            Book book=ListCreation.bookList.get(selectedBookNumber-1);
            if(book.getAvailability().equals("available")) {
                outputString="Thank You! Enjoy the book.";
                book.setAvailability("reserved");
            } else {
                outputString="Sorry we don't have that book yet.";
            }
            System.out.println(outputString);
        } catch(Exception e) {
            outputString="Sorry we don't have that book yet.";
            System.out.println(outputString);
        }
        return outputString;
    }

    public Object checkLibraryNumber(String stringLibraryNumber) {
        int libraryNumber;
        String outputString="Library number should be numeric.";
        try {
            libraryNumber=Integer.parseInt(stringLibraryNumber);
        } catch(Exception e) {
            System.out.println(outputString);
            return outputString;
        }
        outputString="Please talk to Librarian. Thank you.";
        for(Customer customer: ListCreation.customerList) {
            if(customer.getLibraryNumber()==libraryNumber) {
                customer.viewCustomerDetails();
                System.out.println(outputString);
                return outputString;
            }
        }
        System.out.println("No such library number found!");
        System.out.println(outputString);
        return outputString;
    }

    public static void main(String args[]) {
        Library library=new Library();
        LibraryHelper libraryHelper=new LibraryHelper();
        ListCreation listCreation=new ListCreation();
        String selectedOption, choice="y";
        listCreation.initializeLists();  //create the required lists
        System.out.println("\n!!!Welcome to the Bangalore Public Library System!!!\n");
        while(choice.equals("y") || choice.equals("Y")) {
            library.printMenuOptions();  //printing the menu options
            selectedOption=libraryHelper.getUserInput("\nEnter your option");  //getting option from the user
            library.checkOption(selectedOption);  //checking the option selected by the user
            choice=libraryHelper.getUserInput("\nDo you want to continue? (y/n)");
            System.out.println();
        }
    }

}
