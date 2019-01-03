import java.util.Scanner;

/*
* AlternativeLoops
* Purpose: The goal of AlternativeLoops is
* Author/s: Morgan Myhill
* 11/2/17
* On My Honor: MM
* Collaborators:
*/
public class AlternativeLoops {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //for loop to replace count controlled loops
//        for(int i = 0; i < 9; i++){
//
//        }
        for(int c = 0; c <= 10; c++){
            System.out.println(c + " ");//only thing that goes here is code we want to be run

            for(int i = 2; i <= 46; i += 2){
                System.out.println(i + " ");//can also move update to inside of loop if you want

                //scope of i is within curly brackets


                int stop= s.nextInt();
                for(int start = s.nextInt(); start < stop;){
                    System.out.println(start + " ");
                    if(start % 13 == 0) {
                        System.out.println();
                        //dont want to read in continuation condition within for loop
                    }
                        //do while loop
                        int i2 =6;
                        int end = 5;
                        do {
                            //code
                        }while(i < end);//continuation condition here

                    }
                }
                String userIn = "";
                do{
                    System.out.println("play the game here");
                    System.out.println("do you want to play again? y for yes");
                    userIn = s.nextLine();
            }while(userIn.equals("y") );
        }
        //while loop can do anything
        //for loop can only do count controlled
        //do while can do most things, best if you want to loop at least once


    }
}
