import java.util.Scanner;

/*
* ActivitySelector
* Purpose: The goal of ActivitySelector is to use a selection control structure (if statement) in a program
* Author/s: Morgan Myhill
* 10/17/17
* On My Honor: MM
* Collaborators: None
*/
public class ActivitySelector {
    public static void main(String[] args) {
        //F = (9/5)C +32 and C = (5/9)(F - 32)

        //Swimming for temperatures 85 or greater
        //Tennis for temperatures between 70 and 85
        //Golf for temperatures between 32 and 70
        //Skiing for temperatures between 0 and 32
        //Dancing for temperatures less than 0

        Scanner s = new Scanner(System.in);
        System.out.println("Temperature in Celsius or Fahrenheit? (Type in C for Celsius and F for Fahrenheit)");
        String measure = s.nextLine();
        System.out.println("Input temperature");
        int unconvert = s.nextInt();//this is unconverted temp
        int convert;
        int temp = 0;
        if(measure.indexOf("C") > -1){ temp = (int)(unconvert/ (5.0 / 9) + 32);
            System.out.println(unconvert + " degrees Celsius is " + temp + " degrees Fahrenheit. ");}//temp wil be used
        // for calculations
        if(measure.indexOf("F") > -1){
            temp = unconvert;
            convert = (int)((unconvert - 32)/(9.0/5));
            System.out.println(unconvert + " degrees Fahrenheit is " + convert + " degrees Celsius. ");}//all measurements
        //in program in Fahrenheit


        if(temp >= 85) System.out.println("You should go swimming.");
        else if(temp > 70 && temp < 85)System.out.println("You should go tennis.");
        else if(temp > 32 && temp < 70)System.out.println("You should play golf.");
        else if(temp >= 0 && temp < 32)System.out.println("You should go skiing.");//because one of the activities should
        //include 0 degrees
        else System.out.println("You should dance.");








        }




    }

