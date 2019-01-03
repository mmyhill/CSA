/*
* EncryptionAdvanced
* Purpose: The goal of EncryptionAdvanced is is to change a 3 letter word into another 3 letter "word"
* by adding any positive integer n
* Author/s: Morgan Myhill
* 9/5/17
* On My Honor: MM
* Collaborators:Emma Lu
*/
public class EncryptionAdvanced {
        public static void main(String []args){
            char origin1;
            origin1 = 'm';
            System.out.print(origin1);
            char origin2;
            origin2 = 'a';
            System.out.print(origin2);
            char origin3;
            origin3 = 'x';
            System.out.print(origin3);
            char tab;
            tab = '\t';
            System.out.print(tab);
            int n;//n is amount that is added to each letter
            n=666;
            char encrypt1;
            encrypt1 =(char)((origin1 + n%26)+(((origin1 +n%26)/('z'+1))*(-26)));//this works because if the remainder causes the original
            //code to go into symbols (original was simply:(char)(origin1 +n%26) and then the code will multiply the number of character
            // over z (if there are any)by -26 so that it wraps. This cannot be a double otherwise the number will not truncate to
            //0 is there is no need to wrap.
            //need to use %26 because it does not matter how many times 26 goes into n, only
            //how many additional letters original will change(if n is a factor of 26, encrypted and original will be the same)
            System.out.print(encrypt1);
            char encrypt2;
            encrypt2 = (char)((origin2 + n%26)+(((origin2 +n%26)/('z'+1))*(-26)));
            System.out.print(encrypt2);
            char encrypt3;
            encrypt3 = (char)((origin3 + n%26)+(((origin3 +n%26)/('z'+1))*(-26)));
            System.out.print(encrypt3);

    }

}
