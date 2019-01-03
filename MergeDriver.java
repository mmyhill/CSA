/*
* MergeDriver
* Purpose: The goal of MergeDriver is to learn how to merge two sorted arrays into a single sorted array.
* Author/s: Morgan Myhill
* 4/8/18
* On My Honor: MM
* Collaborators: Mx. Haynes
*/
    public class MergeDriver {

        public static void main(String[] args) {
            System.out.println("Testing merge");
            String[] one = new String[]{"A", "C", "E", "G"};
            String[] two = new String[]{"B", "D", "F", "H"};

            Comparable[] result = merge(one, two);

            System.out.println("Should be: A B C D E F G H");

            for(int i = 0 ; i < result.length; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();

            one = new String[]{"A", "B", "C", "G"};
            two = new String[]{"F", "G", "H", "I"};

            System.out.println("Should be: A B C F G G H I");

            result = merge(one, two);

            for(int i = 0 ; i < result.length; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();

            one = new String[]{"A", "X", "Y", "Z"};
            two = new String[]{"B", "D", "F", "H", "I", "J", "K", "L"};

            System.out.println("Should be: A B D F H I J K L X Y Z");

            result = merge(one, two);

            for(int i = 0 ; i < result.length; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();

            System.out.println("Testing mergeSort");

            Comparable[] toUse = {'M','O','R','G','A','N','L','E','N','A','M','Y','H','I','L','L'};

            System.out.println("Should be: A A E G H I L L L M M N N O R Y");

            result = mergeSort(toUse);

            for(int i = 0; i < result.length; i++){
                System.out.print(result[i] + " ");
            }
            System.out.println();

        }


        public static Comparable[] merge(Comparable[] a , Comparable[] b) {
            Comparable[] toReturn = new Comparable[a.length + b.length];
            int countA = 0;//index of next elem in array
            int countB = 0;
            for (int newInd = 0; newInd < toReturn.length; newInd++) {
                if(countA < a.length && countB < b.length){
                    if(a[countA].compareTo(b[countB]) < 0){
                        toReturn[newInd] = a[countA];
                        countA++;
                    }else{
                        toReturn[newInd] = b[countB];
                        countB++;
                    }
                }else if(countA < a.length){//if all vals from b have been used
                    toReturn[newInd] = a[countA];
                    countA++;
                }else{//if all vals from a have been used
                    toReturn[newInd] = b[countB];
                    countB++;
                }
            }
            return toReturn;
        }

    public static Comparable[] mergeSort(Comparable[] arr) {
        Comparable[] a = new Comparable[arr.length/2];
        Comparable[] b = new Comparable[arr.length - arr.length/2];
//        if(arr.length == 2){
//            a[0] = arr[0];
//            b[0] = arr[1];
//            return merge(a,b);
        if(arr.length >= 2){
            for(int i = 0; i < a.length; i++){
                a[i] = arr[i];
            }
            for(int i = a.length; i < arr.length; i++){
                b[i - a.length] = arr[i];
            }
            return merge(mergeSort(a), mergeSort(b));
        }else{//if arr.length == 1
            return arr;
            }
        }
    }


