/*
* DormRoom2
* Purpose: The goal of DormRoom2 is to learn how to write constructors and accessor methods
* Author/s: Morgan Myhill
* 11/28/17
* On My Honor: MM
* Collaborators:
*/
public class DormRoom2 {
        private double myWidth;
        private double myLength;
        private String myName;

        //default constructor
        //input = none
        //auto sets width to 10 and length to 15
        public DormRoom2(){
            myWidth = 10;
            myLength = 15;
            myName = "Room";
        }

        //constructor
        //inputs = length & width
        //auto sets name to "Room"
        public DormRoom2(double width, double length){
            myWidth = width;
            myLength = length;
            myName = "Room";
        }

        //constructor
        //inputs = name
        //auto sets width to 10 and length to 15
        public  DormRoom2(String room){
            myWidth = 10;
            myLength = 15;
            myName = room;
        }

        //constructor
        //inputs = width, length, name
        public DormRoom2(double width, double length, String room){
            myWidth = width;
            myLength = length;
            myName = room;

        }
        public double getWidth(){
            return myWidth;
        } // returns a double which is the value of myWidth

        public double getLength(){
            return myLength;
        } // returns a double which is the value of myLength
        public String getName(){
            return myName;
        } // returns a String which is the value of myName
        public double getArea(){
            return myWidth * myLength;
        } // returns a double which is the area of the Dorm Room


        public String toString(){
            return "" + myName + ":" + " Width " + myWidth + " Length " + myLength ;
        }

    public void setWidth(double newWidth){
            myWidth = newWidth;
    } // sets the width of the room to newWidth,
    //leaving the length unchanged
    public void setLength(double newLength){
            myLength = newLength;
    } // sets the length of the room to newLength,
    //leaving the width unchanged
    public void setProportionalWidth(double newWidth){
        double area = this.getArea();
        myWidth = newWidth;
        myLength = area/myWidth;
    }// sets the width of the room to
    //newWidth, leaving the area unchanged
    //(length is changed to compensate)
    public void setProportionalLength(double newLength){
        double area = getArea();
        myLength = newLength;
        myWidth = area/myLength;
    } // sets the length of the room to
    //newLength, leaving the area unchanged
    //(width is changed to compensate)




}




