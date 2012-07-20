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

    private String username;
    private boolean loginStatus=false;
    //prints the list of menu options on the console
    public void printMenuOptions() {
        System.out.println("-------MENU-------");
        System.out.println("Enter 1 to view all the books in the library");
        System.out.println("Enter 2 to reserve a book");
        System.out.println("Enter 3 to check your library number");
        System.out.println("Enter 4 to view the list of movies");
        System.out.println("Enter 5 to login");
    }

    //checks the menu option entered by the user
    public Object checkOption(String stringOption) {
        int option;
        String optionSelected="Select a valid option!";
        option=convertStringToInteger(stringOption, optionSelected);  //get the numeric value
        if(option==Integer.MIN_VALUE) {
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
                    checkLibraryNumber(loginStatus);
                    break;
            case 4: optionSelected="view movies";
                    viewMovieList();  //view the list of movies
                    break;
            case 5: optionSelected = "login";
                    String loginId=new LibraryHelper().getUserInput("\nUsername:");
                    String password=new LibraryHelper().getUserInput("\nPassword:");
                    boolean status=checkIfUserExists(loginId,password);
                    setLoginStatus(status);
                    printUserLoginMessage();
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
        for (Book book : Repository.bookList) {
            System.out.printf("%-5d", serial_no);
            book.viewBookDetails();  //printing the book details on the console
            serial_no++;
        }
    }

    //reserves the book if available
    public Object reserveBook(String selectedBook) {
        int selectedBookNumber;
        String outputString="Please enter a numerical value.";
        selectedBookNumber=convertStringToInteger(selectedBook, outputString); //get the numeric value
        if(selectedBookNumber==Integer.MIN_VALUE) {
            return outputString;
        }
        try {
            Book book= Repository.findBook(selectedBookNumber);
            if(book.isAvailable()) {
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

    //checks the library number of the user
    public Object checkLibraryNumber(boolean loginStatus) {
        String outputString="Please talk to Librarian. Thank you.";
        if(loginStatus) {
            System.out.println("Your library number: "+username);
            outputString="library number printed";
        }
        else {
            System.out.println(outputString);
        }
        return outputString;
    }

    public void viewMovieList() {
        int serial_no=1;
        System.out.println("\n---------List of Movies---------");
        System.out.printf("%-5s%-25s%-20s%-5s\n","SNo.","Movie Name","Director","Rating");
        for (Movie movie : Repository.movieList) {
            System.out.printf("%-5s",serial_no);
            movie.viewMovieDetails();  //printing the movie details on the console
            serial_no++;
        }
    }

    public boolean checkIfUserExists(String loginId, String password) {
        boolean status=false;
        username=loginId;
        for(User user : Repository.userList) {
            if(user.userExists(loginId,password)) {
                status=true;
                break;
            }
        }
        return status;
    }

    private void setLoginStatus(boolean status) {
        loginStatus=status;
    }

    //returns a whole number value equal to the number contained in the input of the user
    public int convertStringToInteger(String numString, String outputString) {
        int integerValue=Integer.MIN_VALUE;
        try {
            integerValue=Integer.parseInt(numString);
        } catch(Exception e) {
            System.out.println(outputString);
        }
        return integerValue;
    }

    public void printUserLoginMessage() {
        if(loginStatus) {
            System.out.println("You are now logged in!");
        }
        else {
            System.out.println("Incorrect login details!");
        }
    }

    public static void main(String args[]) {
        Library library=new Library();
        LibraryHelper libraryHelper=new LibraryHelper();
        Repository repository =new Repository();
        String selectedOption, choice="y";
        repository.initializeLists();  //create the required lists
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
