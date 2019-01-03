/*
* MyPoint
* Purpose: The goal of MyPoint is
* Author/s: Morgan Myhill
* 11/13/17
* On My Honor: MM
* Collaborators:
*/
public class MyPoint {
    private int x;
    private int y;//private means not just everyone can change it, only within this specific
    //scope
    //driver = class with psvm

    //constructors, will be overloaded
    public MyPoint() {
        //constructor initializes instance data
        x = 0;
        y = 0;}

        //two input constructor
    public MyPoint( int x, int y){
            //scope of arguments is method curly bois
            //"local to this method"
            //how does java know whether we are talking about global or local x?
            //use this
            this.x = x;
            this.y = y;//keyword this refers to current instance data and methods
            //this.x is current points instance data
        }
    public MyPoint(MyPoint p) {
            this.x = (int)p.getX();
            this.y = (int)p.getY();
        }
        public double getX(){//accessories usually dont need arguments
         return this.x;
        }
    public double getY(){
        return this.y;
    }
    public boolean equals(MyPoint a){
        return this.x == a.getX() && this.y == a.getY();

    }
    //mutators
    public void translate(int dx, int dy){
        //void, no returns, d + delta
        this.x += dx;
        this.y += dy;
    }
    //set location
    public void setLocation(int x, int y){
        this.x = x;
        this.y = y;
    }
    //set location for doubles
    public void setLocation(double x, double y){
        this.x = (int)x;
        this.y = (int)y;
    }
    //to string
    public String toString(){
        return "("+this.x+this.y+")";
    }
    //try to make distance on your own
    public double distance(MyPoint q){
        return Math.sqrt(Math.pow(this.x - q.getX(), 2)+Math.pow(this.y - q.getY(), 2));

    }
    }

