/*
* FlashCards
* Purpose: The goal of FlashCards3 is to practice growing an array and to practice deleting from an array
* Author/s: Morgan Myhill
* 2/12/18 & 2/23/18
* On My Honor: MM
* Collaborators: None
* Banana Bonanza!!!
*/

public class FlashCards
{
    protected String[] myQuestions;
    protected String[] myAnswers;
    private int numCards;

    /* initialize instance data: arrays with a length of 1, and numCards to 0 */
    public FlashCards()
    {
        myAnswers = new String[1];
        myQuestions = new String[1];
        numCards = 0;

    }

    /* helper method that doubles the two arrays (myQuestions and myAnswers) in size to hold more data */
    protected void doubleArrayLengths()
    {
        String[] tempQ = new String [myQuestions.length * 2];
        String[] tempA = new String [myAnswers.length * 2];
        for(int i = 0; i < numCards; i++){
            tempQ[i] = myQuestions[i];
            tempA[i] = myAnswers[i];
        }
        myQuestions = tempQ;
        myAnswers = tempA;
    }

    /* Adds the question and answer as a flashcard
    Hint: remember to check to see if the arrays need to double in size */
    public void addCard(String question, String answer)
    {
        if(numCards >= myQuestions.length){
            doubleArrayLengths();
            addCard(question, answer);
        }else{
            myQuestions[numCards] = question;
            myAnswers[numCards] = answer;
            numCards++;
        }
    }

    /* returns the question at the given index */
    public String getQuestion(int i)
    {
        return myQuestions[i];

    }

    /* returns the answer at the given index */
    public String getAnswer(int i)
    {
        return myAnswers[i];
    }

    /* returns the number of flash cards */
    public int getNumCards()
    {
        return numCards;
    }

    public void addNumCards(){ numCards++; }

//    public int getSize(){
//        return myAnswers.length;
//    }

    /* prints all the flashcards, you may want to use this method for testing!!*/
    public void printFlashCards()
    {
        for(int i=0; i<numCards; i++)
        {
            System.out.println("Q: " + getQuestion(i));
            System.out.println("A: " + getAnswer(i));
        }
    }
    //The method deletes the card at the index passed in,
    //shifts the cards to replace the hole,
    //and decrements the number of card left.
    public void deleteCard(int index){
        for(int i = index; i < numCards - 1; i++){
            myQuestions[i] = myQuestions[i+1];
            myAnswers[i] = myAnswers[i+1];
        }
        numCards--;
    }

}
