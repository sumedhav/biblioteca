package com.twu28.biblioteca;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Sumedha Verma
 * Date: 7/26/12
 * Time: 12:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class UserRepository {

    static ArrayList<User> userList=new ArrayList<User>();

    //creates a list of users
    public void initializeUserList() {
        addUser("111-1111", "abcdef123", "user1");
        addUser("111-1112", "password2", "user2");
        addUser("111-1113", "password3", "user3");
        addUser("111-1114", "password4", "user4");
        addUser("111-1115", "password5", "user5");
    }

    //adds a user to the list of users
    public void addUser(String library_no, String password, String name) {
        User user =new User();
        user.setUserDetails(library_no,password, name);
        userList.add(user);
    }

}
