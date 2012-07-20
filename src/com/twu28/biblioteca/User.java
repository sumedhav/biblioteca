package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: Sumedha Verma
 * Date: 7/14/12
 * Time: 5:28 PM
 *
 * This class contains attributes of a customer and methods to handle them.
 */
public class User {

    private String username;
    private String password;
    String name;

    public void setUserDetails(String library_number, String password, String name) {
        this.username =library_number;
        this.password=password;
        this.name=name;
    }

    public boolean userExists(String loginId, String password) {
        return username.equals(loginId) && this.password.equals(password);
    }

}
