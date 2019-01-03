/*
* Bullseye
* Purpose: The goal of CrossHairs is to create an applet using the java Graphics class
* that will produce a cross hairs graphic
* Author/s: Morgan Myhill
* 9/8/17
* On My Honor: MM
* Collaborators:None
*/
import java.applet.Applet;
import java.awt.*;
public class CrossHairs extends Applet {
    public void paint(Graphics bullseye) {
        bullseye.setColor(Color.blue);//will outline in blue
        bullseye.drawOval(0, 0, 400, 400);//large, hollow circle
        bullseye.drawOval(25, 25, 350, 350);
        bullseye.drawOval(50, 50, 300, 300);
        bullseye.drawOval(75, 75, 250, 250);
        bullseye.drawOval(100, 100, 200, 200);
        bullseye.drawOval(125, 125, 150, 150);
        bullseye.drawOval(150, 150, 100, 100);
        bullseye.drawOval(175, 175, 50, 50);//last circle

        bullseye.fillOval(25, 25, 350, 350);//will 2nd outer circle blue, must go from outside to inside
        //to get layers right

        bullseye.setColor(Color.white);
        bullseye.fillOval(50, 50, 300, 300);//3nd circle (from outside) white

        bullseye.setColor(Color.yellow);
        bullseye.fillOval(75, 75, 250, 250);//4th circle yellow

        bullseye.setColor(Color.white);
        bullseye.fillOval(100, 100, 200, 200);//5th circle white

        bullseye.setColor(Color.red);
        bullseye.fillOval(125, 125, 150, 150);//6th circle red

        bullseye.setColor(Color.white);
        bullseye.fillOval(150, 150, 100, 100);//7th circle white

        bullseye.setColor(Color.blue);
        bullseye.fillOval(175, 175, 50, 50);//8th/inner circle blue

        bullseye.drawString("Bullseye!", 250, 225);

        bullseye.setColor(Color.red);//will make perpendicular lines in red
        bullseye.drawLine(400, 200, 0, 200);
        bullseye.drawLine(200, 0, 200, 400);
    }

}
