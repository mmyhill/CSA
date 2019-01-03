/*
* LoginChecker
* Purpose: The goal of LoginChecker is to take a username and password in from a user and use the Scanner class to confirm the
* password and username match by reading in text from other files.
* Author/s: Morgan Myhill
* 10/7/17
* On My Honor: MM
* Collaborators: Jude Bearcat
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class LoginChecker {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);
        System.out.println("Login using a username from the list below.");
        try {
             Scanner fileScanner = new Scanner(new File("LoginChecker.txt"));
            String usernames = fileScanner.nextLine();
            System.out.println(usernames);

            System.out.print("Username: ");
            String userInput = keys.nextLine();

            System.out.print("Password: ");
            String passInput = keys.nextLine();

            Scanner fileScanner2 = new Scanner(new File(userInput + ".txt"));
            String password = fileScanner2.nextLine();

            boolean isValid = password.equals(passInput);
            System.out.println("Valid? ");
            System.out.println(isValid);
        } catch (FileNotFoundException e) {
            System.out.println(e);

        }
    }
}