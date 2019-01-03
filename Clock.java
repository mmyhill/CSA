/*
* Clock
* Purpose: The goal of Clock is
* Author/s: Morgan Myhill
* 1/9/18
* On My Honor: MM
* Collaborators:
*/
public class Clock {
    private int hour;
    private int min;
    private int sec;
    private boolean isPm;//will give am or pm

    Clock(){
        hour = 12;
        min = 00;
        sec = 00;
        //is Pm will defualt to false

    }

    public String getTime(){
        String period;
        if(isPm)period = " P.M.";
        else period = " A.M.";
        String toReturn = "";
        if(hour < 10)  toReturn += "0" + hour + ":";
        else toReturn += hour + ":";
        if(min < 10)  toReturn += "0" + min + ":";
        else toReturn += min + ":";
        if(sec < 10)  toReturn += "0" + sec + period;
        else toReturn += sec + period;
        return toReturn;
    }

    public void setHour(int hour){
        this.hour = hour;
    }

    public void setMin(int min){
        this.min = min;
    }

    public void setSeconds(int sec){
        this.sec = sec;
    }

    public void setAm(){
        isPm = false;
    }

    public void setPm(){
        isPm = true;
    }

}
