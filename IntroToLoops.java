import java.util.Scanner;

/*
* IntroToLoops
* Purpose: The goal of IntroToLoops is
* Author/s: Morgan Myhill
* 10/26/17
* On My Honor: MM
* Collaborators:
*/
public class IntroToLoops {
    public static void main(String[] args) {
        //intro to while loops

       //count up loop:

        int count = 0;//initialization prior to loop
        while(count < 10){//while condition is true, code will continue to repeat, this is continuation condition
            System.out.print(count + " " );//will print out infinite zeros with code up until here
             count ++;//will give way for count to reach 10, called the update
        }

        //count down loop
         int x = 10;
         while(x >= 0){
             System.out.print(x + " ");
             x--;
         }
//         //infinite loop:
//            int y = 90;
//         while(y > 0){
//             System.out.println(y);
//             y++;//will never stop running because y will always
//             //be greater than 0, program crashes
                 //can use "Command" + "/" to comment out whole highlighted sections
       int y = -3;
        while( y > 0){
            System.out.println();
            y--;//will not run, y will never be greater than 0
        }
        //Fancy uses
        int c = 100;
        while(c >= 0){
            System.out.print(c + " ");
            if(c%10 == 0) System.out.println();//will print 10 chars per line
            c--;
        }

        //read in input until a condition is met
        Scanner s = new Scanner(System.in);
        String userIn = s.nextLine();
        while (!userIn.equals("bananas")){
            System.out.println("please input password");
            userIn = s.nextLine();
        }
        System.out.println("you guessed the password");


    }
}
