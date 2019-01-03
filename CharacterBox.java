
import java.util.Scanner;
/*
* CharacterBox
* Purpose: The goal of CharacterBox is to write loop structures with both for and while loops.
* Author/s: Morgan Myhill
* 11/5/17
* On My Honor: MM
* Collaborators: None
*/
public class CharacterBox {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input the desired amount of lines: ");
        int lines = s.nextInt()-2;
        System.out.print("Input string: ");
        s.nextLine();//to clear /n left by nextInt()
        String in = s.nextLine();
        System.out.println("************");//will always be 10 chars per line
        String out = "";
        String nums = "";
        for(int numLines = 0; numLines < lines; numLines++) {
            nums += "0123456789";
        }
        out = in + nums;
        int have = 0;
        while(have < lines){
            System.out.println("*" + out.substring(have * 10, (have +1) * 10) + "*");//will give 10 chars because
            // index starts at 0
            have++;}
        System.out.println("************");

        }
                }







