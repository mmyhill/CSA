import java.util.Scanner;
import java.util.StringTokenizer;

/*
* AddressLabels
* Purpose: The goal of AddressLabels is to continue working with loops and to learn a useful java.util class.
* Author/s: Morgan Myhill
* 11/13/17
* On My Honor: MM
* Collaborators: None
*/
public class AddressLabels {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input your address separated by ?'s: ");
        String in = s.nextLine();
        StringTokenizer st = new StringTokenizer(in,"?" );
        for(int i =0; i < 40; i++){
            System.out.print("*");}
        System.out.println();
        System.out.print("*");
        for(int i = 0; i<38; i++){
            System.out.print(" ");
        } System.out.println("*");
        while(st.hasMoreTokens()){
            System.out.print("*" + "    ");
            String next = st.nextToken();
            System.out.print(next);
            for(int i = 0; i < 34- next.length(); i++){
                System.out.print(" ");
            }
            System.out.println("*");}
        System.out.print("*");
        for(int i = 0; i<38; i++){
            System.out.print(" ");
        } System.out.println("*");
        for(int i =0; i < 40; i++){
            System.out.print("*");}
        }
    }


