
/*
* MyArrayList
* Purpose: The goal of MyArrayList is to improve arrays.
* Author/s: Morgan Myhill
* 2/22/18
* On My Honor: MM
* Collaborators: Mx. Haynes
*/


public class MyArrayList {
//    Write a class MyArrayList which provides a wrapper for an array. This class should contain an Object array,
// a variable that holds the number of filled spaces in the array, and a DEFAULT_CAPACITY as a final int.
//    It should have the following methods and constructors
    private final int DEFAULT_CAPACITY;
    private Object[] arr;//not really sure why it's doing this and couldn't find on internet?
    private int boxFill;

    /* constructs an array list with a DEFAULT_CAPACITY */
    public MyArrayList(){
        DEFAULT_CAPACITY = 10;
        arr = new Object[DEFAULT_CAPACITY];
    }

    /* constructs an array list with a capacity that is passed in */
    public MyArrayList(int initialCapacity){
        DEFAULT_CAPACITY = initialCapacity;
        arr = new Object[DEFAULT_CAPACITY];
    }

    /* returns the size of the array list */
    public int size(){
        return boxFill;
    }

    /* returns the Object at position index */
    public Object get(int index){
        return arr[index];
    }

    /* replaces the element at index with x returns the element formerly at the specified position */
    public Object set(int index, Object newItem){
        Object toReturn = arr[index];
        arr[index] = newItem;
        return toReturn;
    }

    /* appends item to the end of the list, returns true */
    public boolean add(Object item){
        if(boxFill == arr.length)doubleCapacity();
        arr[boxFill] = item;
        boxFill++;
        return true;
    }
    /* inserts item at position index, sliding elements at position index and higher to the right (adds 1 to their indices) and adjusts size */
    public void add(int index, Object item){//i is the index being taken from
        if(boxFill == arr.length)doubleCapacity();
        for(int i = boxFill; i > index; i--){
            arr[i] = arr[i - 1];
        }
        arr[index] = item;
        boxFill++;
    }

    /* removes elements from position index sliding elements at position index + 1 and higher to the left (subtracts 1 from their indices) and adjusts size */
    public Object remove(int index){
        Object toReturn = arr[index];
        for(int i = index; i < arr.length -1; i++){
            arr[i] = arr[i + 1];
        }
        boxFill--;
        if(arr.length >= 1.5 * boxFill){
            Object[] temp = new Object[boxFill];
            for(int i = 0; i < boxFill; i++){
                temp[i] = arr[i];
            }
            arr = temp;//shallow copy ok, other array deleted
        }
        return toReturn;
    }

    /* doubles the capacity of the Object array */
    private void doubleCapacity(){
        Object[] temp = new Object[arr.length * 2];
        for(int i = 0; i < arr.length; i++){
            temp[i] = arr[i];
        }
        arr = temp;
    }

}
