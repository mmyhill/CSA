/*
* CompoundWords
* Purpose: The goal of CompoundWords is to produce a random combination of words from words found in the dictionary
* and then find the length of the new word to learn about the String class.
* Author/s: Morgan Myhill
* 9/28/17
* On My Honor: MM
* Collaborators: Emma Lu
*/
public class CompoundWords {
    public static void main (String []args){
    Dictionary c= new Dictionary();
    String compound1 = c.randomWord();
    String compound2 = c.randomWord();
    String newWord = compound1 + "-".concat(compound2);
        System.out.print(newWord);
        System.out.print(" Wow!");
        System.out.println(" That word is "+newWord.length()+" characters long!");//includes - in character count

    }
}
