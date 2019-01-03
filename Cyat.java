import java.util.Random;

/*
* Cyat
* Purpose: The goal of Cyat is
* Author/s: Morgan Myhill
* 1/26/18
* On My Honor: MM
* Collaborators:
*/
public class Cyat extends Mammal implements Pet{
    public Cyat(String name){
        super(name);
    }

    public void changeName(String name){
        this.setName(name);
    }
}
