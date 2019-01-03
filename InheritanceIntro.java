/*
* InheritanceIntro
* Purpose: The goal of InheritanceIntro is
* Author/s: Morgan Myhill
* 1/9/18
* On My Honor: MM
* Collaborators:
*/
public class InheritanceIntro {

    private class Clock{
        //already implemented
    }

    private class AlarmClock{
        //make sure to call clock in alarm methods and dont
        //rewrite code, save time

        //what is a better way to do this?
        //called inheritance:
        //super class (ex: clock)
        //sub class (ex: alarm clock)

        //would say: public class AlarmClock extends Clock {

        //public class subClass extends superClass{

        //just add new instance data and write new methods

        //for constructor: call super():, similar to this
        //can do the same with constructors with inputs
        //java auto calls 0 input super
        //super() needs to be first line

        //java copies and pastes all old clock methods

        //can also use inheritance for modified versions of same class
        //ex: clock >> military time clock (sub class)

        //use super. to refer to super class, just like this
    }
}
