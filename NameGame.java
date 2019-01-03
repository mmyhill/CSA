import java.util.ArrayList;
import java.util.Scanner;

/*
* NameGame
* Purpose: The goal of NameGame is to remember how to java
* Author/s: Morgan Myhill
* 8/22/18
* On My Honor: MM
* Collaborators: None
*/
public class NameGame {
    public static void main(String[] args) {
        ArrayList name1 = new ArrayList();
        ArrayList name2 = new ArrayList();
        ArrayList ice = new ArrayList();

        Scanner s = new Scanner(System.in);

        Boolean newPerson = true;

        while(newPerson) {
            System.out.println("What is your first name?");
            name1.add(s.nextLine());

            System.out.println("What is your last name?");
            name2.add(s.nextLine());

            System.out.println("What is your favorite ice cream flavor?");
            ice.add(s.nextLine());

            System.out.println("Another person? (Y/N)");


            if(s.nextLine().equals("N")){
                System.out.println();
                break;
            }
        }

        for(int x = name1.size() - 1; x >= 0; x--){
            System.out.println ("" + name1.get(x) + " " + name2.get(x) + " , " + ice.get(x));
        }


    }
}
