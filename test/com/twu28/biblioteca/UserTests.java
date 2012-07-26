package com.twu28.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Sumedha Verma
 * Date: 7/26/12
 * Time: 12:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class UserTests {

    @Test
    public void checkUserExistsMethodWhenUserExists() throws Exception {
        User user=new User();
        user.setUserDetails("111-1118","password8","user8");
        assertEquals(true, user.userExists("111-1118", "password8"));
    }

    @Test
    public void checkUserExistsMethodWhenUserDoeNotExist() throws Exception {
        User user=new User();
        user.setUserDetails("111-1118","password8","user8");
        assertEquals(false, user.userExists("111-1119", "password8"));
    }

}
