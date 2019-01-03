/*
* Guess
* Purpose: The goal of Guess is to make a "guessing game" using the java class Random and the class Scanner
* Author/s: Morgan Myhill
* 9/15/17
* On My Honor: MM
* Collaborators: None
*/
import java.util.Scanner;
import java.util.Random;

public class Guess {
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        System.out.println("Try #1:");
        System.out.print("Min: ");
        int lowerLimit;
        lowerLimit =s.nextInt();
        System.out.print("Max: ");
        int upperLimit;
        upperLimit =s.nextInt();
        Random r = new Random();
        int random;
        random = r.nextInt(upperLimit-lowerLimit +1) + lowerLimit;//add 1 because we need upper limit to be included in
        //range
        System.out.print("Guess: ");
        int guess;
        guess = s.nextInt();
        boolean isCorrect = random == guess;
        System.out.println(isCorrect);
        System.out.print("Hint: ");
        System.out.println(random%2);
        System.out.println('\n');


        int saveRandom = random;//have to set it as variable to make sure it is consistent for all guesses
        int saveLowLim = lowerLimit;
        int saveUpLim = upperLimit;

        System.out.println("Try #2:");
        System.out.print("Min: ");
        System.out.println(saveLowLim);
        System.out.print("Max: ");
        System.out.println(saveUpLim);
        System.out.print("Guess: ");
        guess = s.nextInt();
        System.out.println(isCorrect);
        System.out.print("Hint: ");
        System.out.println(random%3);
        System.out.println('\n');

        System.out.println("Try #3:");
        System.out.print("Min: ");
        System.out.println(saveLowLim);
        System.out.print("Max: ");
        System.out.println(saveUpLim);
        System.out.print("Guess: ");
        guess = s.nextInt();
        System.out.println(isCorrect);
        System.out.print("Hint: ");
        System.out.println(random%5);
        System.out.println('\n');

        System.out.print("Ans: ");
        System.out.println(saveRandom);






    }
}
