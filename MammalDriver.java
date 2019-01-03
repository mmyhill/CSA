import java.util.Scanner;

/*
* MammalDriver
* Purpose: The goal of MammalDriver is to practice writing interfaces, abstract classes, and concrete classes.
* Author/s: Morgan Myhill
* 1/31/18
* On My Honor: MM
* Collaborators:
*/
public class MammalDriver {
    public static void main(String[] args) {
        Cyat c = new FatCyat("Street cyat");
        Scanner s = new Scanner(System.in);
        System.out.println("You find a cat. Would you like to adopt this cat?(y/n)");
        if (s.nextLine().charAt(0) == 'y') {
            System.out.println("What would you like to rename your cat? ");
            c.changeName(s.nextLine());
            System.out.println("You take your cat home. It is now both grumpy and fat. ");
            boolean shouldTry = true;
            while (shouldTry) {
                System.out.println("Does your cat snuggle with you? " + ((grumpyAminal) c).snuggle());//point is that you can cast
                //it to interface or class
                System.out.println("Continue trying to snuggle?(y/n) ");
                if (s.nextLine().charAt(0) == 'n') shouldTry = false;
            }
            ((badAminal)c).eatFoodOffTable();
            System.out.println("Your cat eats food off the table. Its name is now " + c.getName());
        }else System.out.println("Why though? Game Over. ");
    }
}
