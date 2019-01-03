import java.awt.*;

/*
* MyTriangleDriver
* Purpose: The goal of MyTriangleDriver is to get comfortable with the patterns for basic instance data, constructors,
* accessors and mutators.
* Author/s: Morgan Myhill
* 11/17/17
* On My Honor: MM
* Collaborators: None
*/
public class MyTriangleDriver {
    public static void main(String[] args) {
        MyTriangle trig = new MyTriangle();
        System.out.println(trig.getP1());
        System.out.println(trig.getP2());
        System.out.println(trig.getP3());
        trig.perim();
        System.out.println(trig.getPerim());
        trig.area();
        System.out.println(trig.getArea());

        System.out.println();
        trig.setP1(4,5);
        trig.setP2(0,0);
        trig.setP3(5,9);
        System.out.println(trig.getP1());
        System.out.println(trig.getP2());
        System.out.println(trig.getP3());
        trig.perim();
        System.out.println(trig.getPerim());
        trig.area();
        System.out.println(trig.getArea());

        System.out.println();
        MyTriangle trig2 = new MyTriangle(new Point(3,3),new Point (0,0), new Point(2, 6));
        System.out.println(trig2.getP1());
        System.out.println(trig2.getP2());
        System.out.println(trig2.getP3());
        trig2.perim();
        System.out.println(trig2.getPerim());
        trig2.area();
        System.out.println(trig2.getArea());


    }
}
