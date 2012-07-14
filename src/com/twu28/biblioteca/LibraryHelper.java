package com.twu28.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * User: Sumedha Verma
 * Date: 7/13/12
 * Time: 8:04 PM
 *
 * This class is used to get the input string entered by the user at the console
 */
public class LibraryHelper {

    //takes the input from the user and returns the input string
    public String getUserInput(String prompt) {
        String inputLine=null;
        System.out.print(prompt+" ");
        try {
            BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
            inputLine=reader.readLine();
            if(inputLine.length()==0) return null;
        } catch(IOException e) {
            System.out.println("IOException: " + e);
        }
        return inputLine;
    }
}
