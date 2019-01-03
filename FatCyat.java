import java.util.Random;

/*
* FatCyat
* Purpose: The goal of FatCyat is
* Author/s: Morgan Myhill
* 1/29/18
* On My Honor: MM
* Collaborators:
*/
public class FatCyat extends Cyat implements grumpyAminal, badAminal {
    public FatCyat(String name){ super(name);}

    public boolean snuggle(){
        Random r = new Random();
        int use = r.nextInt(10);
        if(use <= 3)return true;
        else return false;
    }
    
    public void eatFoodOffTable(){
        setName("Bad " + getName());
    }
}
