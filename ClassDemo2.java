/*
* ClassDemo2
* Purpose: The goal of ClassDemo2 is
* Author/s: Morgan Myhill
* 11/27/17
* On My Honor: MM
* Collaborators:
*/
public class ClassDemo2 {
    //instance data

    private int x;
    private double d;
    private boolean b;

    public ClassDemo2(){
    }

    public ClassDemo2(int x, double d, boolean b){
        this.x = x;
        this.d = d;
        this.b = b;

    }

    public ClassDemo2(int x){
        this();//initializes instance data to default values
        this.x = x;
        }
        //can also do
    public ClassDemo2(double d){
        this(0, d, false);
    }

}
