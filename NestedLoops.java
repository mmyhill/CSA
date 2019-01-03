import java.util.Scanner;

/*
* NestedLoops
* Purpose: The goal of NestedLoops is
* Author/s: Morgan Myhill
* 11/6/17
* On My Honor: MM
* Collaborators:
*/
public class NestedLoops {
    public static void main(String[] args) {
        //example 1

        for (int j = 0; j  < 7; j ++) {

            for (int i = 0; i < 18; i++) {
                System.out.print(i + 1 + " ");
            }
        }
            //example 2
            //prints a rectangle that is empty in the middle
            //*****
            //*   *
            //*****
            //print stars when row = 0, column = 0, width-1
            //else we need a space
            int height = 9;
            int width = 7;
            for(int row = 0; row < height; row++){
                  for(int col = 0; col < width; col ++){
                      if(row == 0 || row == height-1 || col ==0 || col == width-1){
                          System.out.print("*");
                      }else{
                          System.out.print(" ");
                      }
                      Scanner s = new Scanner(System.in);
                      String userWord = s.nextLine();
                      int countEs = 0;
                      for(int i = 0; i < userWord.length(); i++){

                      }
                      //when 2nd loop depends on previous loop
                      for(int i = 0; i <= 5; i++){
                          for(int j = 5-i ; j >= 0;j--){
                              System.out.println("*");
                          }
                          System.out.println();
                      }

                  }
        }
    }
}
