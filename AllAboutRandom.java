/*
* AllAboutRandom
* Purpose: The goal of AllAboutRandom is
* Author/s: Morgan Myhill
* 9/13/17
* On My Honor: MM
* Collaborators:
*/
import java.util.Random;
public class AllAboutRandom {
    public static void main(String args){
        Random r = new Random();//has one argument
        //pseudo random number generators
        //computer uses a combination of initial conditions to
        //help stimulate randomness in calculations (ex: time)

        int i= r.nextInt (6);//[0,6) or [0,5]


        //nextInt
        //range [0, x)

        i = r.nextInt();//will do the whole range of possible integers [-2^31, 2^31-1] & [-2^32, 2^31)

        double d = r.nextDouble();//[0.0, 1.0)

        //how to change range of next int using math?
        //[4,6)
        //[0, 2)
        //can use addition to make them the same

        int x = r.nextInt(2)+4;

        double y = r.nextDouble();//can't ever put argument there
        //[0.0, 1.0)+10 will give you random number from 1-10

        //multiplication expands or contracts the range

        //double z in range [25.0, 50.0)

        double z = r.nextDouble()*25.0+25.0;

        //should only need one random object per file (just reinitialize)

        }
    }

