import java.util.Scanner;

/*
* HumanPlayer
* Purpose: The goal of HumanPlayer is to write a class that inherits from an abstract class.
* Author/s: Morgan Myhill
* 1/23/18
* On My Honor: MM
* Collaborators: None
*/
public class HumanPlayer extends Player{
    Scanner s = new Scanner(System.in);
    public HumanPlayer(String name, char use){
        super.setName(name);
        if(use == 'X' || use == 'O' || use == 'x' || use == 'o' );
        else use = 'X';
        setChar(use);
    }
    public int getMove(TicTacToeBoard t){
        System.out.println(getName() + ", please choose a spot to place your mark (1-9): ");
        int use = s.nextInt();
        while(!t.isEmpty(use)){
            System.out.println(getName() + ", please choose a spot to place your mark (1-9): ");
            use = s.nextInt();
        }
        return use;
    }

}
