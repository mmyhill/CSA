/*
* Cornershot
* Purpose: The goal of Cornershot is to determine whether a ball in a fair game earns a point by hitting the square
* surrounding the target using the java classes Random and Point.
* Author/s: Morgan Myhill
* 9/14/17
* On My Honor: MM
* Collaborators: None
*/

import java.awt.Point;
import java.util.Random;

public class Cornershot {
    public static void main(String []args){
        Random r = new Random();
        Point test;
        test = new Point(r.nextInt(301),r.nextInt(301));//doing inclusive
        //if you need to test points: test = new Point(50,50);
        Point circleCenter;//center of blue circle/target
        circleCenter = new Point(150,150);//point is 150, 150 because circle's radius(125) + edge of board (25)
        double distance;
        distance = test.distance(circleCenter);
        int x;
        x = (int)test.getX();
        int y;
        y = (int)test.getY();
        boolean isCornerShot;
        isCornerShot= distance > 125 && x <= 275 && x >= 25 && y >= 25 && y <= 275;//the radius of the blue target is 125,
        //therefore, if the distance from the center is not greater, the point is in the circle
        //used these x & y value limits to make sure that point is not only outside the circle, but not on the 0-point/
        //wood section of the board`
        System.out.print("(");
        System.out.print(x);
        System.out.print(",");
        System.out.print(y);
        System.out.print("): ");
        System.out.println(isCornerShot);

    }

}
