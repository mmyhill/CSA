/*
* LogicalOperators
* Purpose: The goal of LogicalOperators is
* Author/s: Morgan Myhill
* 8/30/17
* On My Honor: MM
* Collaborators:
*/
public class LogicalOperators {
    public static void main(String []args){
        //AND && both sides of the operation
        //must be true, in order for AND to print out true
        System.out.println(true&&false);//false
        System.out.println(true&&true);//true
        System.out.println(false&&true);//false
        System.out.println(false&&false);//false

        //OR
        System.out.println(true||false);//true
        System.out.println(false||true);//true
        System.out.println(true||true);//true
        System.out.println(false||false);//false, only false when both sides are false

        //NOT !
        System.out.println(!true);//false
        System.out.println(!false);//true
        //takes opposite of boolean value

        //boolean takeUmbrella=isRaining && isGoingOutside;
        //will only be true if both of the others are true

        //boolean isSleeping=isBedtime || hasFreetime;
        //will be true if either is true

        //boolean isEating = !isFull;
        //if we are full, isEating should be false, if we are not, isEating should
        //be true

        //combining relational operators and logical operators

        //order of operations
        //()
        //casting()//when you put int(equation) because you want the answers of the equation to be truncated and stored as
        //as integer
        //*/%
        //+-
        //relational operators
        //logical operators
        //!
        //&&
        //||
        //=assignment operator

        //5<x<10
        int x;
        x=(int)(6.5+1.0);//12 is false

        System.out.println(5<x && x<10);

        //true||false&&false
        //incorrect evaluation- right to left
        //should be true

        //Demorgan's law-how to take the logical opposite of a logical
        //expression
        //!(a||b)==!a && !b

        //also gives opposites of relational operators
        //> is opposite of <=, because inclusive is opposite of exclusive

        //add parenthesis to preserve original order of operations when solving
        //for logical opposite






    }
}
