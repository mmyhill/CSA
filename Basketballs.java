/*
* Basketballs
* Purpose: The goal of Basketballs is to determine if it is true that 2 regulation basketballs
* can fit into a hoop at the same time
* Author/s: Morgan Myhill
* 8/29/17
* On My Honor: MM
* Collaborators:Emma Lu
*/
public class Basketballs {
    public static void main(String[] args){
double mensBall;
mensBall=9.39*2.54;//9.39 is inches. I am converting all inch measurements to centimeters. 1 inch=2.54 cm
double womensBall;
womensBall=9.07*2.54;
double hoop;
hoop=22.85*2;//22.85 is radius
      boolean mensAndWomensWillFit;
      mensAndWomensWillFit=mensBall+womensBall<=hoop;
        System.out.print("Men's and women's will fit? ");
      System.out.println(mensAndWomensWillFit);//will give whether or not both balls will fit
      System.out.print(hoop-(womensBall+mensBall));//will give leftover space, if any
        //if number is negative, then the 2 balls will not fit into the hoop at the same time
        System.out.println(" cm to spare");
        boolean mensAndMensWillFit;
        mensAndMensWillFit=mensBall*2<=hoop;
        System.out.print("Men's and men's will fit? ");
        System.out.println(mensAndMensWillFit);
        System.out.print(hoop-mensBall*2);
        System.out.println(" cm to spare");
        boolean womensAndWomensWillFit;
        womensAndWomensWillFit=womensBall*2<=hoop;
        System.out.print("Women's and women's will fit? ");
        System.out.println(womensAndWomensWillFit);
        System.out.print(hoop-womensBall*2);
        System.out.print(" cm to spare");
    }
}
