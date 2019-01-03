import java.util.Scanner;

/*
* GrowingAnArrayLecture
* Purpose: The goal of GrowingAnArrayLecture is
* Author/s: Morgan Myhill
* 2/12/18
* On My Honor: MM
* Collaborators:
*/
public class GrowingAnArrayLecture {
    public static void main(String[] args) {
        //if you want to extend an array:

        //choice 1: create more boxes than needed
        //how do you distinguish answers from default zeros?

        int[] responses = new int[500];

        int numElems = 0;

        //plus plus numElems each time a response is taken in


        //other choice: could you also just fill buckets for response (ex: response is 6, therefore arr[5]++;

        //choice 1.2: for loop with numElems as limit

        //creating too many boxes is memory filled with empty boxes, how to prevent memory wasting?

        Scanner s = new Scanner(System.in);
        int a = 0;
        double[] labScores = new double[2];
        int numScores = 0;

        //create system that creates new array with large enough length within scope of finite loop and then reset original
        //array to finite array (saves memory)


    }

}
