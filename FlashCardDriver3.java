/*
* FlashCardDriver3
* Purpose: The goal of FlashCardDriver3 is to practice deleting from an array
* Author/s: Morgan Myhill
* 2/25/18
* On My Honor: MM
* Collaborators: None
*/
import java.util.Scanner;               //Make the Scanner class available
import java.io.FileNotFoundException;   //Make this exception available
import java.io.File;                    //Make the File class available
import java.util.Random;

    public class FlashCardDriver3
    {
        public static void main(String[] args) throws FileNotFoundException
        {
            Scanner console;
            Scanner inFile;
            String question;
            String fileName;
            String answer;
            Random rand;

            FlashCards fc;
            fc=new FlashCards();
            console=new Scanner(System.in);
            rand=new Random();

            //loads the question file
            System.out.print("Enter the Question File: ");
            fileName=console.nextLine();
            inFile = new Scanner(new File(fileName));
            while(inFile.hasNextLine())
            {
                question = inFile.nextLine();
                answer = inFile.nextLine();
                fc.addCard(question, answer);
            }

            //Your code here!!

			/* Asks the user the questions in random order until all questions have been asked
			(Hint: once a question is asked it should be removed from the list) */
			int numRuns = fc.getNumCards();
            //System.out.println(fc.getNumCards());
            for(int i = 0; i < numRuns; i++){
                int use = rand.nextInt(fc.getNumCards());//[0, last filled index] int questionNum=rand.nextInt(fc.getNumCards());
                String guess;
                System.out.println("Question: " + fc.getQuestion(use));
                guess=console.nextLine();
                if(guess.equals(fc.getAnswer(use)))
                    System.out.println("You're correct!!");
                else System.out.println("Sorry, the answer is: " + fc.getAnswer(use));
                fc.deleteCard(use);
                //System.out.println(fc.getNumCards());
        }
    }
}
