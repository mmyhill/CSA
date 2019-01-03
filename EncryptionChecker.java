import java.util.Scanner;

/*
* EncryptionChecker
* Purpose: The goal of EncryptionChecker is to write a program that makes use of static method calls.
* Author/s: Morgan Myhill
* 10/10/17
* On My Honor: MM
* Collaborators: Emma and Jeremy
*/


//The secret formula to encrypt a word is to take the integer value of each character in the
// String, raise it to the nth power (where n is 1 for the first character, 2 for the second, etc)
// , mod the result by 26, and then add 'a' to get a resulting lowercase letter.

public class EncryptionChecker {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input a 5 letter word: ");
        String wordIn = s.nextLine();
        String encode = EncryptionHelper.encode(wordIn);
        System.out.print("Encoded: ");
        System.out.println(encode);
        int aEncode = encode.charAt(0);
        int bEncode = encode.charAt(1);
        int cEncode = encode.charAt(2);
        int dEncode = encode.charAt(3);
        int eEncode = encode.charAt(4);
        int aOrigin = wordIn.charAt(0);
        int bOrigin = wordIn.charAt(1);
        int cOrigin = wordIn.charAt(2);
        int dOrigin = wordIn.charAt(3);
        int eOrigin = wordIn.charAt(4);
        char aNew =(char) ((Math.pow(aOrigin, 1)%26) + 'a');

        char bNew =(char) ((Math.pow(bOrigin, 2)%26) + 'a');

        char cNew =(char) ((Math.pow(cOrigin, 3)%26) + 'a');

        char dNew =(char) ((Math.pow(dOrigin, 4)%26) + 'a');

        char eNew =(char) ((Math.pow(eOrigin, 5)%26) + 'a');

        //to test:
        //System.out.print("Correct: ");
        //System.out.println("" + aNew + bNew + cNew + dNew + eNew);//add empty string to the beginning

        System.out.print("Char 1 correct? ");
        System.out.print(aEncode == aNew);
        System.out.print(" Char 2 correct? ");
        System.out.print(bEncode == bNew);
        System.out.print(" Char 3 correct? ");
        System.out.print(cEncode == cNew);
        System.out.print(" Char 4 correct? ");
        System.out.print(dEncode == dNew);
        System.out.print(" Char 5 correct? ");
        System.out.print(eEncode == eNew);







    }
}
