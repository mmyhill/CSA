/*
* InsertionSortDriver
* Purpose: The goal of InsertionSortDriver is to write sorting methods
* Author/s: Morgan Myhill
* 4/6/18
* On My Honor: MM
* Collaborators: Mx. Haynes
* Best case complexity: ascending sorted list, O(n) (checks each elem, but no swapping)
* Worst case complexity: descending sorted list, O(n^2) (must swap each elem 1 + 2 +....n - 2 + n - 1 + n times, sum is n/2 for
* swaps * n for getting elem to be sorted)
* Average complexity: n + n^2/2 = O(n^2)
*/
public class InsertionSortDriver
{
    public static void main(String[] args)
    {
        Comparable[] months={"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        Comparable[] sortedMonths=Sorts.insertionSort(months);

        for(int i=0; i<months.length; i++)
        {
            System.out.print(months[i]+" ");
        }

        System.out.println();

        for(int i=0; i<sortedMonths.length; i++)
        {
            System.out.print(sortedMonths[i]+" ");
        }
    }
}

