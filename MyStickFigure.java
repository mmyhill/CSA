/*
* MyStickFigure
* Purpose: The goal of MyStickFigure is to write a program using the Java graphics class
* to draw a stick figure and then create another that is a percentage of that size
* Author/s: Morgan Myhill
* 9/11/17
* On My Honor: MM
* Collaborators: None
*/
import java.applet.Applet;
import java.awt.*;
    public class MyStickFigure extends Applet {
        public void paint(Graphics stickfigure) {
            Point originCenter;//graphs the original stick figure using given points
            originCenter = new Point(100,100);
            stickfigure.drawOval(75,50,50,50);//head
            stickfigure.drawLine(100,100,100,200);//torso
            stickfigure.drawLine(100,150,125,125);//right arm
            stickfigure.drawLine(100,150,75,125);//left arm
            stickfigure.drawLine(100,200,125,250);//right leg
            stickfigure.drawLine(100,200,75,250);//left leg

            double myScale;
            myScale = .80;
            double originRadius;
            originRadius= 25;
            int newRadius;
            newRadius = (int)(myScale*originRadius);

            int windowSize;
            windowSize= 200;//window size is height of original stick figure
            int groundLevel = 250;//the horizontal line through the y axis that the stick figures
            //will be "standing on"
            int y;
            y = (int)(groundLevel - windowSize*myScale + 2*newRadius);//used to find y of new center
            Point newCenter;
            newCenter = new Point(300,y);//300 was given as x-coordinate of new stick figure

            int x;
            x = (int)(newCenter.getX()-newRadius);//will give top left x coordinate of head
            y = (int)(newCenter.getY()-2*newRadius);//will give top left y coordinate of head
            stickfigure.drawOval(x,y,2*newRadius,2*newRadius);//will draw new head

            Point originHip;
            originHip = new Point(100,200);
            int spineLength;
            spineLength = (int)(originHip.getY()-originCenter.getY());//will give length of the "spine"
            int newSpineLength;
            newSpineLength = (int)(myScale * spineLength);

            Point newHip;
            x= (int)(newCenter.getX());
            y= (int)(newCenter.getY()+ newSpineLength);//gives adjusted "spine" length
            newHip = new Point(x,y);//this is bottom of spine

            int y2;
            y2 = (int)(newCenter.getY());
            stickfigure.drawLine(x, y2, x,y);//will make new spine

            int x2;
            x2=(int)(x + newRadius);
            y2=(int)(y + 2*newRadius);
            stickfigure.drawLine(x,y,x2,y2);//will draw right leg

            x2=(int)(x - newRadius);
            y2=(int)(y + 2*newRadius);
            stickfigure.drawLine(x,y,x2,y2);//will draw left leg

            x=(int)(newCenter.getX());
            y=(int)(newCenter.getY() + 2*newRadius);//will give "shoulder" of stick figure

            x2=x + newRadius;
            y2=y - newRadius;
            stickfigure.drawLine(x, y,x2,y2);//will draw right arm

            x2=x - newRadius;
            stickfigure.drawLine(x, y,x2,y2);//will draw left arm

            //EXTRA CREDIT:
            myScale = .60;
            newRadius = (int)(myScale*originRadius);

            y = (int)(groundLevel - windowSize*myScale + 2*newRadius);//used to find y of new center
            newCenter = new Point(200,y);//300 was given as x-coordinate of new stick figure
            x = (int)(newCenter.getX()-newRadius);//will give top left x coordinate of head
            y = (int)(newCenter.getY()-2*newRadius);//will give top left y coordinate of head
            stickfigure.drawOval(x,y,2*newRadius,2*newRadius);//will draw new head
            newSpineLength = (int)(myScale * spineLength);
            x= (int)(newCenter.getX());
            y= (int)(newCenter.getY()+ newSpineLength);//gives adjusted "spine" length
            newHip = new Point(x,y);//this is bottom of spine
            y2 = (int)(newCenter.getY());
            stickfigure.drawLine(x, y2, x,y);//will make new spine
            x2=(int)(x + newRadius);
            y2=(int)(y + 2*newRadius);
            stickfigure.drawLine(x,y,x2,y2);//will draw right leg
            x2=(int)(x - newRadius);
            y2=(int)(y + 2*newRadius);
            stickfigure.drawLine(x,y,x2,y2);//will draw left leg
            x=(int)(newCenter.getX());
            y=(int)(newCenter.getY() + 2*newRadius);//will give "shoulder" of stick figure
            x2=x + newRadius;
            y2=y - newRadius;
            stickfigure.drawLine(x, y,x2,y2);//will draw right arm
            x2=x - newRadius;
            stickfigure.drawLine(x, y,x2,y2);//will draw left arm




            x= (int)(newCenter.getX());
            y= (int)(newCenter.getY()+ newSpineLength);
            x2=(int)(x - newRadius -102);
            y2=(int)(y + 2*newRadius +20);
            stickfigure.drawString("Harry",x2,y2);

            x2=(int)(x - newRadius +85);
            y2=(int)(y + 2*newRadius + 20);
            stickfigure.drawString("Hermione",x2,y2);

            x2=(int)(x - newRadius -30);
            y2=(int)(y + 2*newRadius + 20);
            stickfigure.drawString("Albus Severus",x2,y2);





        }
    }