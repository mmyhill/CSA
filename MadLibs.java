/*
* MadLibs
* Purpose: The goal of MadLibs is to create a madlibs to entertain middles schoolers and also develop my ability to use the
* java Strings class and learn its shortcuts
* Author/s: Morgan Myhill
* 10/3/17
* On My Honor: MM
* Collaborators: None
*/

import java.util.Scanner;
public class MadLibs {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Adjective: ");
        String adj1 = s.nextLine();
        System.out.print("\n");

        System.out.print("Favorite (specific) place: ");
        String place = s.nextLine();
        System.out.print("\n");

        System.out.print("Plural noun: ");
        String noun = s.nextLine();
        System.out.print("\n");

        System.out.print("Character(male): ");
        String maleChar = s.nextLine();
        System.out.print("\n");

        System.out.print("Greeting: ");
        String greet = s.nextLine();
        System.out.print("\n");

        System.out.print("Verb(infinitive): ");
        String verbInf = s.nextLine();
        System.out.print("\n");

        System.out.println("Relationship(ex: sister & brother, student & teacher)");
        System.out.print("First relation: ");
        String relation1 = s.nextLine();
        System.out.print("Second relation: ");
        String relation2 = s.nextLine();
        System.out.print("\n");

        System.out.print("Exclamation: ");
        String exclam = s.nextLine();
        System.out.print("\n");

        String first = "We were both ".concat(adj1);
        String second = " when I first saw you I close my eyes and the flashback starts I'm standing there on a ".concat
                (place);
        String third = " in summer air See the ".concat(noun);
        String fourth = ", see the party, the ball gowns See you make your way through the crowd And say ".concat(greet);
        String fifth = " And I said, ".concat(maleChar);
        String sixth = ", take me somewhere we can be alone I'll be waiting, all that's left to do is ".concat(verbInf);
        String seventh = " You'll be the ".concat(relation1);
        String eighth = " and I'll be the ".concat(relation2);
        String ninth = " It's a love story, baby just say ".concat(exclam) + "!";

        System.out.println(first + second + third + fourth + fifth + sixth + seventh + eighth + ninth);


    }
    }
