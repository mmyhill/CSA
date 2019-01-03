/*
* GoldenRectangle
* Purpose: The goal of GoldenRectangle is to write a class that inherits from another class
* Author/s: Morgan Myhill
* 1/10/18
* On My Honor: MM
* Collaborators: None
*/
public class GoldenRectangle extends Rectangle{
    private static double gold = 1.0/2 * (1 + Math.sqrt(5));//1 (on short side) :  1/2 * (1 + Math.sqrt(5))
    private char orient;
    //1:x ,where x is 1/2 of the sum of 1 plus the square root of 5.

    //default constructor
    //sets the (x,y) location to (0,0), the height to 100,
    //and the width to an appropriate value so that the
    //rectangle is golden.
    public GoldenRectangle(){
        //will default call rectangle constructor method within this one
        this.setSize(100, (int)(100 * gold));
        orient = 'W';//W means greater width, L means longer length
    }

    //second constructor
//sets the location to (x,y)
//the orientation can be either 'W' for Wide or 'L' for Long
//set the width and height to the appropriate values so that the
//rectangle is Golden and in the right orientation
    public GoldenRectangle(int x, int y, int shortSide, char orientation){
        this.setLocation(x,y);
        if(orientation == 'W')this.setSize(shortSide, (int)(shortSide * gold));
        else this.setSize((int)(shortSide * gold), shortSide);
        orient = orientation;
    }

    //returns a NEW GoldenRectangle (without changing the original one).
    //this new golden rectangle will be the rectangle that results from //partitioning the original golden rectangle into a square and a
    //rectangle. (See diagram below)
    //need to change orientation every time and make short side = long side
    public GoldenRectangle getNextGoldenRectangle(){
        int shortSide;
        int longSide ;
        if(this.orient == 'W'){//if long side is width
            longSide = this.getHeight();
            shortSide = (int)(longSide/gold);
            orient = 'L';
        }
        else{
            //if long side is length
            longSide = this.getWidth();
            shortSide = (int)(longSide/gold);
            orient = 'W';
        }
        GoldenRectangle r = new GoldenRectangle(this.getX(), this.getY(),shortSide, orient);
        return r;
    }

}
