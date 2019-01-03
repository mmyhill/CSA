/*
* FindCity
* Purpose: The goal of FindCity is to implement a sequential and a binary search
* Author/s: Morgan Myhill
* 3/11/18
* On My Honor: MM
* Collaborators: None
*/
import java.util.Scanner;               //Make the Scanner class available
import java.util.ArrayList;				//Make the ArrayList class available
import java.io.FileNotFoundException;   //Make this exception available
import java.io.File;                    //Make the File class available

public class FindCity
{
    public static void main(String[] args) throws FileNotFoundException
    {
        ArrayList<CityZip> list = new ArrayList<CityZip>();
        Scanner inFile = new Scanner(new File("OH_zips.txt"));

        while(inFile.hasNextLine())
        {
            int zip = inFile.nextInt();
            String city = inFile.nextLine();
            city = city.substring(2); //eat two leading spaces
            list.add(new CityZip(city,zip));
        }

        System.out.println("Expected output:");
        System.out.println("ALEXANDRIA, COLUMBUS, city not found, LEWISTOWN, CINCINNATI");
        System.out.println("ALEXANDRIA, COLUMBUS, city not found, LEWISTOWN, CINCINNATI");

        System.out.println();
        System.out.println("Actual output:");
        double t1seq = (double)System.currentTimeMillis();
        System.out.print(findCitySequential(list,43001)+", ");
        System.out.print(findCitySequential(list,43230)+", ");
        System.out.print(findCitySequential(list,43999)+", ");
        System.out.print(findCitySequential(list,43333)+", ");
        System.out.println(findCitySequential(list,45999));
        double tseq = ((double)System.currentTimeMillis() - t1seq)/5;
        System.out.println("Average runtime for sequential: " + tseq);

        double t1bin = (double)System.currentTimeMillis();
        System.out.print(findCityBinary(list,43001)+", ");
        System.out.print(findCityBinary(list,43230)+", ");
        System.out.print(findCityBinary(list,43999)+", ");
        System.out.print(findCityBinary(list,43333)+", ");
        System.out.println(findCityBinary(list,45999));
        double tbin = ((double)System.currentTimeMillis() - t1bin)/5;
        System.out.println("Average runtime for binary: " + tbin);


    }

    // post condition:  returns city with give zip, or "city not found"
    // use a SEQUENTIAL search!
    public static String findCitySequential(ArrayList<CityZip> list, int zip)
    {
        for(CityZip elem : list){
            if(elem.getZip() == zip)return elem.getCity();
        }
        return "city not found";
    }


    // pre condition:  list must be sorted
    // postcondition:  returns city with give zip, or "city not found"
    // use a BINARY search!
    public static String findCityBinary(ArrayList<CityZip> list, int zip)
    {
        int low = 0;
        int high = list.size() - 1;
        int mid = (high + low)/2;//int division ok
        while(high >= low){
            if(list.get(mid).getZip() == zip) return list.get(mid).getCity();
            else if(list.get(mid).getZip() < zip) low = mid + 1;
            else if(zip < list.get(mid).getZip())high = mid - 1;
            mid = (high + low)/2;
        }
        return "city not found";
    }

}
