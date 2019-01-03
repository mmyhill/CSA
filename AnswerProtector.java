/*
* AnswerProtector
* Purpose: The goal of AnswerProtector is to learn about the java String class and .equals while creating a program that
* checks whether a username and password that are inputed match a pre set username and password.
* Author/s: Morgan Myhill
* 10/2/17
* On My Honor: MM
* Collaborators: None
*/
import java.util.Scanner;
public class AnswerProtector {
    public static void main(String []args){
        String saveUser = new String("mmyhill20");
        String savePass = new String("12345");
        Scanner s = new Scanner(System.in);
        System.out.print("Username:");
        String inputUser = new String(s.nextLine());
        System.out.print("Password:");
        String inputPass = new String(s.nextLine());
        boolean isCorrect = saveUser.equals(inputUser) && savePass.equals(inputPass);
        System.out.println(isCorrect);
        System.out.println("Ape: " + "\"" + "Do you know why I love you?" + "\"" + "\n" + "Banana: " + "\"" + "Because " +
                "I have appeal!" + "\"");//not my joke





    }
}
