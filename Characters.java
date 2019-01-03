/*
* Characters
* Purpose: The goal of Characters is
* Author/s: Morgan Myhill
* 8/31/17
* On My Honor: MM
* Collaborators:
*/
public class Characters {
    public static void main(String []args){
        //characters, java text symbol
        char c;
        c= '0';//dont confuse ' with " (Strings)

        //special characters
        //escape character: \

        c= '\'';//represents to java that you want single quote as your character
        c = '\"';//represents wanting double quote character
        c = '\n';//n= new line symbol
        c = '\t';//tab

        System.out.print('a');
        System.out.print('\t');
        System.out.println('b');//dont need backslash for space
        //unicode, dont need to memorize integer values associated
        //with each letter, just know that the values for digits< capital letters
        //< lowercase letters
        //Can compare values of letters with relational operators

        System.out.println('0'< '9');//true
        System.out.println('9'>'A');//false
        System.out.println('A' < 'Z');//true
        System.out.println('Z' < 'a');//true

        //character implicit promotion > int
        //demotion: (char)5 is legal but no implicit demotion

        System.out.println('a'+5);//legal
        //if we wanted to find out what letter has value of 102:
        System.out.println((char)('a'+5));//casting, get f
        System.out.println('a'+'a');//legal, promotes both sides to int, will get int

        char myText=98;
        System.out.println(myText);//works, implicitly demotes
        //an integer to store it into a char variable, only time jave will do this
    }
}


