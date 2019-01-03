import java.util.Random;
import java.util.Scanner;

/*
* DiceProbability
* Purpose: The goal of DiceProbability is to explore declaring, constructing and accessing arrays using histograms
* Author/s: Morgan Myhill
* 2/6/18
* On My Honor: MM
* Collaborators: None
*/
public class DiceProbability {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        boolean keepRunning = true;
        int[] use;
        do {
            System.out.println("How many times would you like to roll?");
            int roll = Math.abs(s.nextInt());
            use = new int[11];
            for (int i = 0; i < roll; i++) {
                int rand1 = r.nextInt(6) + 1;
                int rand2 = r.nextInt(6) + 1;
                int sum = rand1 + rand2;
                use[sum - 2]++;
            }
            boolean again = true;
            do {
                System.out.println("Which sum would you like to see the probability for?(2 - 12)");
                int prob = s.nextInt();
                if (prob >= 2 && prob <= 12) {
                    System.out.println(use[prob - 2] * 1.0 / roll * 100);
                    System.out.println("Would you like to calculate a different probability?(y/n)");
                    s.nextLine();
                    if (s.nextLine().charAt(0) != 'y') again = false;
                }
            }
                while (again) ;
                System.out.println("Would you like to roll again?(y/n)");
                if (s.nextLine().charAt(0) != 'y') keepRunning = false;
        } while (keepRunning);
    }
}
