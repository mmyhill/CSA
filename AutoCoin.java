/*
* AutoCoin
* Purpose: The goal of AutoCoin is to determine how many quarters,dimes,nickels and pennies are needed to give change
* for any amount under $1.00
* Author/s: Morgan Myhill
* 8/25/17
* On My Honor: MM
*/
public class AutoCoin {
    public static void main(String[] args){

int initial;
initial=76;//Value of initial change will be less than $1.00//
 int quarters;
 quarters=initial/25;
 System.out.print(quarters);
 System.out.println(" quarter/s");
 int dimes;
 dimes=(initial%25)/10;
 System.out.print(dimes);
 System.out.println(" dimes/s");
 int nickels;
 nickels=(initial%25)%10/5;
 System.out.print(nickels);
 System.out.println(" nickel/s");
 int pennies;
 pennies=(initial%25)%10%5;
 System.out.print(pennies);
 System.out.println(" penny/ies");

    }
}
