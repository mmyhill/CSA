import java.util.Random;

/*
* EquilateralTriangle
* Purpose: The goal of EquilateralTriangle is to write a several classes that inherits from a single common superclass.
* Some of these classes should also be superclasses of their own.
* Author/s: Morgan Myhill
* 1/18/18
* On My Honor: MM
* Collaborators: None
*/
public class EquilateralTriangle extends Triangle {
    EquilateralTriangle(){
        super();
        Random r = new Random();
        int use = r.nextInt(10) + 1;
        setPerim(use * 3);
    }

}
