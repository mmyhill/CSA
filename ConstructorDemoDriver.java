/*
* ConstructorDemoDriver
* Purpose: The goal of ConstructorDemoDriver is
* Author/s: Morgan Myhill
* 11/17/17
* On My Honor: MM
* Collaborators:
*/
public class ConstructorDemoDriver {
    public static void main(String[] args) {
        ConstructorDemo cd = new ConstructorDemo();
        System.out.println("x is " + cd.getX());
        System.out.println("d is " + cd.getD());
        System.out.println("c is " + cd.getC());//is box, 0 if you cast to int
        System.out.println("b is " + cd.getB());
        System.out.println("p is " + cd.getP());
        System.out.println("r is " + cd.getR());
        System.out.println("s is " + cd.getS());
        System.out.println("Str is " + cd.getStr());

        //null means there is no instance of the object, cant actually use in
        //get null point exception if you try to use an object when it is not initialized



    }
}
