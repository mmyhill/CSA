/*
* DormRoom
* Purpose: The goal of DormRoom is to learn how to write constructors and accessor methods
* Author/s: Morgan Myhill
* 11/20/17
* On My Honor: MM
* Collaborators: None
*/
public class DormRoom {
    private double myWidth;
    private double myLength;
    private String myName;

    //default constructor
    //input = none
    //auto sets width to 10 and length to 15
    public DormRoom(){
        myWidth = 10;
        myLength = 15;
        myName = "Room";
    }

    //constructor
    //inputs = length & width
    //auto sets name to "Room"
    public DormRoom(double width, double length){
        myWidth = width;
        myLength = length;
        myName = "Room";
    }

    //constructor
    //inputs = name
    //auto sets width to 10 and length to 15
   public  DormRoom(String room){
       myWidth = 10;
       myLength = 15;
       myName = room;
   }

    //constructor
    //inputs = width, length, name
   public DormRoom(double width, double length, String room){
       myWidth = width;
       myLength = length;
       myName = room;

   }
    // returns a double which is the value of myWidth
    public double getWidth(){
       return myWidth;
    }

    // returns a double which is the value of myLength
    public double getLength(){
        return myLength;
    }

    // returns a String which is the value of myName
    public String getName(){
        return myName;
    }

    // returns a double which is the area of the Dorm Room
    public double getArea(){
        return myWidth * myLength;
    }

    //to String
    public String toString(){
        return "" + myName + ":" + " Width " + myWidth + " Length " + myLength ;
    }



}
