/*
* MethodsWithReturns
* Purpose: The goal of MethodsWithReturns is
* Author/s: Morgan Myhill
* 9/9/17
* On My Honor: MM
* Collaborators:
*/
import java.awt.Point;
public class MethodsWithReturns {
    public static void main(String []args){
        Point p = new Point();
        p.setLocation(3,5);//no return value, cant have double argument

        //methods: getX() and getY()
        //no arguments
        //purpose- access instance data

        double d;
        d = p.getX();//d will be 3.0
        d = p.getY();//d will be 5.0

        //why?
        //midpoint problem

        Point a = new Point();
        Point b= new Point(5,6);

        double midx;
        midx =(a.getX() + b.getX())/2;

        double midy;
        midy =(a.getY() + b.getY())/2;

        Point mid= new Point((int)midx, (int)midy);//because you cant store doubles in
        //a point

        System.out.println(mid);//will print out truncated ints





    }
}
