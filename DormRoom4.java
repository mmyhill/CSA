/*
* DormRoom4
* Purpose: The goal of DormRoom4 is
* Author/s: Morgan Myhill
* 12/4/17
* On My Honor: MM
* Collaborators:
*/
public class DormRoom4 {
    private int occupancy; //the current occupancy of the room (initially zero)
    private static final int MAX_OCCUPANCY = 4; //max # of students in the room
    private Student student1; // the four students of the room
    private Student student2;
    private Student student3;
    private Student student4;
    private double myWidth;
    private double myLength;
    private String myName;

        //default constructor
        //input = none
        //auto sets width to 10 and length to 15
        public DormRoom4(){
            myWidth = 10;
            myLength = 15;
            myName = "Room";
        }

        //constructor
        //inputs = length & width
        //auto sets name to "Room"
        public DormRoom4(double width, double length){
            myWidth = width;
            myLength = length;
            myName = "Room";
        }

        //constructor
        //inputs = name
        //auto sets width to 10 and length to 15
        public  DormRoom4(String room){
            myWidth = 10;
            myLength = 15;
            myName = room;
        }

        //constructor
        //inputs = width, length, name
        public DormRoom4(double width, double length, String room){
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
            return "" + myName + ": " + " Width " + myWidth + " Length " + myLength ;
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
        private int calculateMaxOccupancy(){
            return (int)(this.getArea())/72;
            //72 square feet per person, int division will truncate correctly
        }
        //returns the maximum occupancy this room
        // can hold based on current length and width.
        public int getMaxOccupancy(){
            return this.calculateMaxOccupancy();
        } //returns the current maximum occupancy

    /* find the old student by checking to see which student they are equal to, remove him/her (remembering to update t
    he room assignment in their Student instance data), and then adding the new student in their place (updating their
     roomAssignment data as well) returning true if done successfully */
    public boolean switchStudent(Student oldO, Student newO) {
        if (occupancy >= MAX_OCCUPANCY) return false;
        else {
            String room;
            room = student1.getRoomAssignment();
            if (oldO.equals(student1)) {
                student1.setRoomAssignment("");//nullifies room assignment for old student
                student1 = newO;//sets new student to this room
                student1.setRoomAssignment(room);
            }
            else if(oldO.equals(student2)) {
                student2.setRoomAssignment("");//nullifies room assignment for old student
                student2 = newO;//sets new student to this room
                student2.setRoomAssignment(room);
            }
            else if (oldO.equals(student3)) {
                student3.setRoomAssignment("");//nullifies room assignment for old student
                student3 = newO;//sets new student to this room
                student3.setRoomAssignment(room);
            }
            else if (oldO.equals(student4)) {
                student4.setRoomAssignment("");//nullifies room assignment for old student
                student4 = newO;//sets new student to this room
                student4.setRoomAssignment(room);
            }
            return true;
        }
    }
    /* assign a new student to this dorm room. This method will not assign the student (and return false) if it would
    cause the occupancy to exceed the maximum allowed. The greatest number of students allowed in a room independent of
    its size is four. Remember to update the room assignment in the Student class, and increment the occupancy data in
    the DormRoom class. */
    public boolean assignNewStudent(Student o){
        if(occupancy >= MAX_OCCUPANCY)return false;
        else{
            switch(occupancy){
                case 0:
                    student1 = o;
                    occupancy++;
                    break;
                case 1:
                    student2 = o;
                    occupancy++;
                    break;
                case 2:
                    student3 = o;
                    occupancy++;
                    break;
                case 3:
                    student4 = o;
                    occupancy++;
                    break;

            }
            return true;
        }

    }

    /* removes an student from their dorm room. If successful, returns true after updating the Students room assignment, and the occupancy. */
    public boolean removeStudent(Student o){
        if (o.equals(student1)) {
            student1.setRoomAssignment("");//nullifies room assignment for old student
            occupancy--;
            return true;
        }
        else if(o.equals(student2)) {
            student2.setRoomAssignment("");//nullifies room assignment for old student
            occupancy--;
            return true;
        }
        if (o.equals(student3)) {
            student3.setRoomAssignment("");//nullifies room assignment for old student
            occupancy--;
            return true;
        }
        if (o.equals(student4)) {
            student4.setRoomAssignment("");//nullifies room assignment for old student
            occupancy--;
            return true;

        }
        else return false;
    }


    /* returns true if the Student is in the room (as judged by the equals method), false otherwise */
    public boolean isStudent(Student o){
        if (o.equals(student1) || o.equals(student2) || o.equals(student3) || o.equals(student4))return true;
        else return false;
    }

    /* prints to the console all students in the room. Use the conditional student1!=null to help you */
    public void printStudents(){
        if(student1 != null) System.out.println(student1);
        if(student2 != null) System.out.println(student2);
        if(student3 != null) System.out.println(student3);
        if(student4 != null) System.out.println(student4);
        }
    }



