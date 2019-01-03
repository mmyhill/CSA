/*
* IfElseIntro
* Purpose: The goal of IfElseIntro is
* Author/s: Morgan Myhill
* 10/16/17
* On My Honor: MM
* Collaborators:
*/
public class IfElseIntro {
    public static void main(String[] args) {

        //if runs a piece of code only is a boolean evaluates to true
        int x = 1;
        if(x <= 0) {System.out.println("x is zero or negative");
        //only when x is less than or equal to zero will line print
            System.out.println("does this happen if? ");
        }//will work regularly if there are no curly brackets
        //if statement format
        //if(boolean expression) one line of code;
        //OR
        //if(boolean expression){
        //multiple lined of code;
        //}
        else System.out.print("else case! ");//must come after an if statement

        if(x > 0) System.out.println("x is greater than 0.");

        //can also have
        else if(x==-1) System.out.println("x is -1");
        else if(x == -2) System.out.println("x is -2");
        else System.out.println("x is VERRRYYY negative");

        boolean isSick;
                if(isSick = true) System.out.println("Stay away from me!");
                else System.out.println("Hugs");

                double grade = 92.3;
                if(grade >= 90) System.out.println("A");
                else if(grade >= 80) System.out.println("B");
                else if(grade >= 70) System.out.println("C");
                else if(grade >= 60) System.out.println("D");
                else if(grade <= 50) System.out.println("F");

        if(grade >= 90) System.out.println("A");
        if(grade >= 80) System.out.println("B");
        if(grade >= 70) System.out.println("C");
        if(grade >= 60) System.out.println("D");
        else System.out.println("F");//else has to be directly after the if

        //if you want to use an int that is condemned to curly brackets set it to random value

        int z;//whenever primitives are initialized default value is 0










    }
}
