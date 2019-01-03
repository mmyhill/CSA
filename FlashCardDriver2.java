/*
* FlashCardDriver2
* Purpose: The goal of FlashCardDriver2 is to practice inserting into a sorted array
* Author/s: Morgan Myhill
* 2/21/18
* On My Honor: MM
* Collaborators: None
*/
import java.util.Scanner;               //Make the Scanner class available
import java.io.FileNotFoundException;   //Make this exception available
import java.io.File;                    //Make the File class available

    public class FlashCardDriver2
    {
        public static void main(String[] args) throws FileNotFoundException
        {
            Scanner console;
            Scanner inFile;
            String question;
            String fileName;
            String answer;

            FlashCards fc;
            fc=new SortedFlashCards();
            console=new Scanner(System.in);

            //load the question file
            System.out.print("Enter the Question File: ");
            fileName=console.nextLine();
            inFile = new Scanner(new File(fileName));
            int asks = 0;
            while(inFile.hasNextLine())
            {
                question = inFile.nextLine();
                answer = inFile.nextLine();
                fc.addCard(question, answer);
                asks++;
            }

            //Ask the questions and compare the answers
            for(int i=0; i<asks; i++)
            {
                String guess;
                System.out.println("Question: " + fc.getQuestion(i));
                guess=console.nextLine();
                if(guess.equals(fc.getAnswer(i)))
                    System.out.println("You're correct!!");
                else System.out.println("Sorry, the answer is: " + fc.getAnswer(i));
            }
        }
    }

