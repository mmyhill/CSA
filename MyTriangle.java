import java.awt.*;

/*
* MyTriangle
* Purpose: The goal of MyTriangle is
* Author/s: Morgan Myhill
* 11/16/17
* On My Honor: MM
* Collaborators:
*/
public class MyTriangle {
    private Point p1;
    private Point p2;
    private Point p3;
    private double perim;
    private double area;
    private double side1;
    private double side2;
    private double side3;


   //default constructor
    public MyTriangle(){//have to initialize everything
    p1 = new Point(0,0);
    p2 = new Point(0, 2);
    p3 = new Point(1,1);
    }

    public MyTriangle(Point p1, Point p2, Point p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

   public void perim(){
       side1 = p1.distance(p3);
//       System.out.println(side1);
       side2 = p1.distance(p2);
//       System.out.println(side2);
       side3 = p2.distance(p3);
//       System.out.println(side3);
       perim = side1 + side2 + side3;
   }
   public double getPerim(){
       perim();
       return perim;
   }
   //use Heron's formula for area
    //Math.sqrt(s(s-a)(s-b)(s-c))
    //s = semi perimeter or perim/2
   public void area(){
       double s = perim/2;
       area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
   }
   public double getArea(){
       return area;
   }

   public void setP1(int x, int y){
       p1 = new Point (x,y);
       area();
       perim();
   }
   public void setP2(int x, int y){
        p2 = new Point (x,y);
        area();
       perim();
    }

    public void setP3(int x, int y){
        p3 = new Point (x,y);
        area();
        perim();
    }
    public Point getP1(){
        return p1;
    }
    public Point getP2(){
        return p2;
    }
    public Point getP3(){
        return p3;
    }

}
