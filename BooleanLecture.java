/*
* BooleanLecture
* Purpose: The goal of BooleanLecture is
* Author/s: Morgan Myhill
* 8/27/17
* On My Honor: MM
*/
public class BooleanLecture {
    public static void main(String []args){
        //booleans have the value of true or false
        //when declaring boolean variables, use camel case and phrase it as a question
        //ex: boolean isRaining
        //when initializing, set to true or false, dont use caps as Java won't recognize
        boolean isRaining;
        isRaining=true;
        System.out.println(isRaining);
        //Relational operators:operate on 2 numerical values and output a boolean value
        //> greater than
        //< less than
        //>= greater than or equal to (must be in this order!!!)
        //<= less than or equal to
        //== means items being compared are equal because = is used for assignment
        //!= means not equals
        //these are lower on scale of precedence than operations, so math works
        //ex:3*4==13/4*3, true
        System.out.println(1.0000000000001-.0000000000001==1);//should be true, but is false because == sometimes doesn't
        //work because of Java's rounding of doubles, too be safe do something more like this:
        System.out.println(1.0000000000001-.0000000000001-1.0 < .0000001);//will make true


    }
}
