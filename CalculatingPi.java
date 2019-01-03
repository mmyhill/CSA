import java.applet.Applet;
import java.awt.*;
import java.util.Random;
import java.util.Scanner;

/*
* CalculatingPi
* Purpose: The goal of CalculatingPi is to write a loop where the work done in the body of the loop is a little more ‘substantial’
* Author/s: Morgan Myhill
* 11/2/17
* On My Honor: MM
* Collaborators: None
*/
public class CalculatingPi extends Applet {
    public void paint(Graphics g) {
        resize(550, 550);
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Input # of points you would like to use: ");
        int tests = s.nextInt();
        int side = 400;//this is the side of the square or the diameter of the circle
        int points = 0;
        int circle = 0;//this will give number of points in circle
        g.drawRect(0, 0, side, side);
        g.drawOval(0, 0, side, side);
        while (points < tests) {
            int x = r.nextInt(side);
            int y = r.nextInt(side);
            Point p = new Point(x, y);
            if (p.distance(side / 2, side / 2) <= side / 2) circle++;
            g.drawOval(x, y, 1, 1);
            points++;
        }
        double piAprox = (circle * 4.0) / points;
        System.out.println("I calculated Pi to be " + piAprox);
        double pError = 100 * (piAprox - Math.PI) / Math.PI;
        System.out.println("The percent error is " + pError);
        g.drawString("Pi calculation: " + piAprox, 25 , side +25);
        g.drawString("Percent error: " + pError, 25, side +50);



    }
}


