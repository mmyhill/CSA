import java.util.Scanner;

/*
* ClockDriver
* Purpose: The goal of ClockDriver is to write a class that inherits from another class and then write a driver that
* exhibits polymorphism.
* Author/s: Morgan Myhill
* 1/11/18
* On My Honor: MM
* Collaborators: None
*/
public class ClockDriver {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for(int i = 0; i < 2; i++) {
            System.out.print("Would you like the result printed in 12 or 24 hour time?");
            int form = s.nextInt();
            Clock c;
            if (form == 12) c = new Clock();
            else c = new MilitaryClock();
            System.out.println(c.getTime());//will print default time
            c.setPm();
            c.setHour(1);
            c.setMin(33);
            c.setSeconds(33);
            System.out.println(c.getTime());
        }
    }
}
