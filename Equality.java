/*
* Equality
* Purpose: The goal of Equality is
* Author/s: Morgan Myhill
* 9/22/17
* On My Honor: MM
* Collaborators:
*/
import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.awt.Point;
import java.util.Random;

public class Equality {
    public static void main(String []args){
        //== is equality for primitives
         boolean d= 3 == 4;

         //== doesnt work the same way for objects

        Point b;
        b= new Point();

        Point p = new Point();

        Point q = new Point();

        Point k = p;

        System.out.println("is p equal to q?");
        System.out.println(p == q);

        System.out.println("is q equal to k?");
        System.out.println(p == k);
        //will only print out true if they ae the same object in memory
        //asks "are they the same point in memory?"

        //.equals (Object o)

        //argument - one object (if comparing points use point)
        //returns boolean

        System.out.println("is p .equals to q?");
        System.out.println(p.equals(q));
        System.out.println("is k .equals to p?");
        System.out.println(k.equals(p));

        //as long as == is true, .equals must be true too

        //cant use methods on primitives

        //every object has a .equals
        //java developers wrote a default .equals
        //default .equals is ==

        //some classes dont have special .equals programmed in for them
        //ex: random .equals will behave as ==

        Random r = new Random(4);

        Random r2d2 = new Random(4);

        System.out.println("does r equal r2d2?");
        System.out.println(r.equals(r2d2));
    }
}
