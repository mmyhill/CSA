import java.util.Random;

/*
* MineSweeper
* Purpose: The goal of MineSweeper is
* Author/s: Morgan Myhill
* 3/1/18
* On My Honor: MM
* Collaborators:
*/
public class MineSweeper {
        private int numGuess;
        private char[][] notTheMWord;
        private boolean isOver;
        public MineSweeper()
        {
            //isOver = false;, will auto set
            notTheMWord = new char[10][10];
            Random r = new Random();
            int row;
            int col;
            for (int i = 0; i < 4; i++) {
               row = r.nextInt(notTheMWord.length);
               col = r.nextInt(notTheMWord[i].length);
               notTheMWord[row][col] = '*';
            }

        }
        public MineSweeper(int size, int numMines){
            //isOver = false;, will auto set
            notTheMWord = new char[size][size];
            Random r = new Random();
            for (int i = 0; i < numMines; i++) {
                int row = r.nextInt(notTheMWord.length);
                int col = r.nextInt(notTheMWord[i].length);
                notTheMWord[row][col] = '*';
            }
        }

    public void takeTurn(char use){//will input 'm' for mark and 'r' for reveal
        if(use == 'm'){

        }
    }

    public int calcNum(int row, int col) {
        int adjMines = 0;
        if (notTheMWord[row][col] != '*') {
            if (row - 1 >= 0) {//can check row above
                if (notTheMWord[row - 1][col] == '*') adjMines++;
                if (col - 1 >= 0 && notTheMWord[row - 1][col - 1] == '*') adjMines++;//up & left
                if (col + 1 < notTheMWord.length && notTheMWord[row - 1][col + 1] == '*') adjMines++;//up & right
            }
            if (row + 1 < notTheMWord.length) {//can check row below
                if (notTheMWord[row + 1][col] == '*') adjMines++;
                if (col - 1 >= 0 && notTheMWord[row + 1][col - 1] == '*') adjMines++;//down & left
                if (col + 1 < notTheMWord.length && notTheMWord[row + 1][col + 1] == '*') adjMines++;//down & right
            }
            if (col - 1 >= 0 && notTheMWord[row][col - 1] == '*') adjMines++;//check same row
            if (col + 1 < notTheMWord.length && notTheMWord[row][col + 1] == '*') adjMines++;
            return adjMines;
        }
        else return -1;//-1 is mine
    }

    public void startBoard(){
        Random r = new Random();
        for(int rev = 0; rev < 2; rev++){//lengths same, is square
                int row = r.nextInt(notTheMWord.length);
                int col = r.nextInt(notTheMWord.length);


      }
    }



}
