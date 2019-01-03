/*
* MilitaryClock
* Purpose: The goal of MilitaryClock is
* Author/s: Morgan Myhill
* 1/11/18
* On My Honor: MM
* Collaborators:
*/
public class MilitaryClock extends Clock {
    public String getTime() {
        int hours;
        int hour1 = (int) (super.getTime().charAt(0) - '0') * 10;//will check if time is in double digs
        int hour2 = (int) (super.getTime().charAt(1) - '0');
        if (super.getTime().indexOf("P.M.") > -1 && !(hour1 == 10 && hour2 == 2))//for times 1:00 pm and later
            hours = hour1 + hour2 + 12;//will only use when P.M., everything until 1:00 PM reads correctly
        else if (super.getTime().indexOf("A.M.") > -1 && hour1 == 10 && hour2 == 2)//checks to see if clock reset
            hours = 0;
        else hours = hour1 + hour2;//if AM or 12:00 - 1:00 PM
        if (hours < 10)
            return "0" + hours + super.getTime().substring(super.getTime().indexOf(":"), super.getTime().indexOf(".") - 1);
        else return hours + super.getTime().substring(super.getTime().indexOf(":"), super.getTime().indexOf(".") - 1);
        //super's getTime returns "" + hour + ":" + min + ":" + sec + period;
        //need to call super.getTime()!! otherwise it will be an infinite loop ("java.lang.StackOverflowError")
    }
}

