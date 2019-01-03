import java.util.ArrayList;
import java.util.Random;

/*
* ArrListReview
* Purpose: The goal of ArrListReview is
* Author/s: Morgan Myhill
* 5/12/18
* On My Honor: MM
* Collaborators:
*/
public class ArrListReview {
    public static void main(String[] args) {
//        ArrayList<Integer> use = new ArrayList<>();
//        ArrayList<Integer> use1 = new ArrayList<Integer>();
//        ArrayList<Integer> use2 = new ArrayList();
//        ArrayList use3 = new ArrayList<Integer>();
////        for(int i = 0; i < 6; i++){
////            use.add(i, 0);
////        }
//            use.add(5, 6);
//            for(int i = 0; i < use.size(); i++){
//                System.out.println(use.get(i));
//            }
       // testing infinity and division by zero for doubles:  System.out.println(1.0 * 3/0);

//       testing means of variable initialization
// int newNum = 0, temp;
//        int num = 1000;
//        while(num > 10){
//            temp = num % 10;
//            num /= 10; newNum = newNum * 10 + temp;
//        }
//        System.out.println(newNum);

        //testing doubles and int promotion timing
//        double x = (double) 13/5;
//        System.out.println(x);
//        x = 13/5;
//        System.out.println(x);

        Random r = new Random();//testing bounds & what will happen without inputs
        System.out.println(r.nextInt());
        System.out.println(r.nextDouble());
        System.out.println(r.nextDouble());

//        String test = "hi\\is this going\" to be weird\n"; dont get confused between back slash and forward slash!!
//        System.out.println(test);
//        System.out.println("hi/' wth why is it doing this");
//        System.out.println("hi" + "/");
//        System.out.println("hi" + "\\");

    }
}