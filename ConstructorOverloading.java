/**
 * Name: lhaynes
 * Lab Name: ConstructorOverloading
 * Lab purpose: The goal of ConstructorOverloading is to create a program that
 * demonstrates Constructor Overloading and introduces Scanner.
 * Date: 9/14/17
 * Collaborators: None
 */
import java.awt.Point;
import java.util.Random;
import java.util.Scanner;
//all Ms. Haynes notes
public class ConstructorOverloading {
    public static void main(String[] args) {

        // An overloaded constructor has multiple versions that
        // take in different types or numbers of arguments.

        //Point constructor is overloaded.
        Point p = new Point(); //0, 0

        Point q = new Point(4, 5); //x = 4, y = 5

        Point x = new Point(q); // x= 4, y = 5

        //Random constructor is overloaded.

        Random r = new Random(); //zero arguments seed related to clock time

        Random setSeed = new Random(12345); //51, 80, 41 every time

        System.out.println(setSeed.nextInt(100));
        System.out.println(setSeed.nextInt(100));
        System.out.println(setSeed.nextInt(100));

        System.out.println(r.nextInt(100)); //random sequence every time
        System.out.println(r.nextInt(100));
        System.out.println(r.nextInt(100));

        //constructor takes one argument
        // the location of input. We will always use System.in (console)

        Scanner s = new Scanner(System.in);


        //nextInt
        //arguments- none
        //output- an integer that the user input

        System.out.println("please input your favorite int");
        int fav = s.nextInt(); //waits for user to input before continuing program
        System.out.println("your favorite number is:" + fav);

        System.out.println("please input your favorite double");
        double favDouble = s.nextDouble();
        System.out.println("your favorite double is: " + favDouble);

        //if you press enter after point, it will automatically import java.awt.Point
        //if you press enter after random, it will automatically import java.util.Random
    }
}