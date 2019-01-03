/*
* LockerCombination
* Purpose: The goal of LockerCombination is to generate random locker codes ,whose year of use can be identified by the
* middle number, using the java class Random.
* Author/s: Morgan Myhill
* 9/13/17
* On My Honor: MM
* Collaborators: None
*/


import java.util.Random;
public class LockerCombination {
    public static void main(String[] args){
        Random r = new Random();
        //Year A
         int a1 =r.nextInt(50);//because 49 is included
         int a2 =r.nextInt(10);//because year 1 middle is between 1 & 9
         int a3 =r.nextInt(50);

        System.out.print("Year A: ");
        System.out.print(a1);
        System.out.print(" ");
        System.out.print(a2);
        System.out.print(" ");
        System.out.println(a3);

        //Year B
        int b1 =r.nextInt(50);//because 49 is included
        int b2 =r.nextInt(10)+10;//because year 1 middle is between 1 & 9
        int b3 =r.nextInt (50);

        System.out.print("Year B: ");
        System.out.print(b1);
        System.out.print(" ");
        System.out.print(b2);
        System.out.print(" ");
        System.out.println(b3);

        //Year C
        int c1 =r.nextInt(50);//because 49 is included
        int c2 =r.nextInt(10)+20;//because year 1 middle is between 1 & 9
        int c3 =r.nextInt (50);

        System.out.print("Year C: ");
        System.out.print(c1);
        System.out.print(" ");
        System.out.print(c2);
        System.out.print(" ");
        System.out.println(c3);

        //Year D
        int d1 =r.nextInt(50);//because 49 is included
        int d2 =r.nextInt(10)+30;//because year 1 middle is between 1 & 9
        int d3 =r.nextInt (50);

        System.out.print("Year D: ");
        System.out.print(d1);
        System.out.print(" ");
        System.out.print(d2);
        System.out.print(" ");
        System.out.println(d3);

        //Year E
        int e1 =r.nextInt(50);//because 49 is included
        int e2 =r.nextInt(10)+40;//because year 1 middle is between 1 & 9
        int e3 =r.nextInt (50);

        System.out.print("Year E: ");
        System.out.print(e1);
        System.out.print(" ");
        System.out.print(e2);
        System.out.print(" ");
        System.out.println(e3);



    }
}
