import java.awt.*;
import java.util.Random;
import java.util.Scanner;

/*
* ConstructorDemo
* Purpose: The goal of ConstructorDemo is
* Author/s: Morgan Myhill
* 11/17/17
* On My Honor: MM
* Collaborators:
*/
public class ConstructorDemo {
 private int x;
 private double d;
 private char c;
 private boolean b;
 private Point p;
 private Scanner s;
 private Random r;
 private String str;

 public int getX(){
     return x;
 }
    public double getD(){
        return d;
    }
    public char getC(){
        return c;
    }
    public boolean getB(){
        return b;
    }
    public Point getP(){
        return p;
    }
    public Scanner getS(){
        return s;
    }
    public Random getR(){
        return r;
    }
    public String getStr(){
        return str;
    }
    public ConstructorDemo(){
        p = new Point();//will show toString if printed
    }

    //if you want to use static, ex: pi

    public static final double PI = 3.14;//final for static doubles
}
