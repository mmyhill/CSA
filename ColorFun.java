/*
* ColorFun
* Purpose: The goal of ColorFun is to learn about methods and objects while drawing a rainbow of stick figures.
* Author/s: Morgan Myhill
* 9/22/17
* On My Honor: MM
* Collaborators: None
*/
import java.awt.Graphics;
import java.applet.Applet;
public class ColorFun extends Applet{
    public void paint (Graphics g){

        StickFigurePrimitive original = new StickFigurePrimitive(50,1);
        original.setColor(14,8,54);
        original.draw(g);//use "get darker" for basic colors and comment out rainbow values

        StickFigurePrimitive dark1 = original.duplicate();
        dark1.translate(50);
        dark1.setColor(162,24,220);
        //dark1.getDarker();
        dark1.draw(g);

        StickFigurePrimitive dark2 = dark1.duplicate();
        dark2.translate(50);
        dark2.setColor(44,103,220);
        //dark2.getDarker();
        dark2.draw(g);

        StickFigurePrimitive dark3 = dark2.duplicate();
        dark3.translate(50);
        dark3.setColor(38,220,135);
        //dark3.getDarker();
        dark3.draw(g);

        StickFigurePrimitive dark4 = dark3.duplicate();
        dark4.translate(50);
        dark4.setColor(240,245,114);
        //dark4.getDarker();
        dark4.draw(g);

        StickFigurePrimitive dark5 = dark4.duplicate();
        dark5.translate(50);
        dark5.setColor(243,176,19);
        //dark5.getDarker();
        dark5.draw(g);

        StickFigurePrimitive dark6 = dark5.duplicate();
        dark6.translate(50);
        dark6.setColor(243,56,19);
        //dark6.getDarker();
        dark6.draw(g);

        StickFigurePrimitive dark7 = dark6.duplicate();
        dark6.translate(50);
        dark6.setColor(243,62,121);
        //dark6.getDarker();
        dark6.draw(g);


    }
}
