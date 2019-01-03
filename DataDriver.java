/*
* DataDriver
* Purpose: The goal of DataDriver is
* Author/s: Morgan Myhill
* 12/4/17
* On My Honor: MM
* Collaborators:
*/
public class DataDriver {
    public static void main(String[] args) {
        DataDemo d1 = new DataDemo(33, "ugh Monday");
        System.out.println(d1.getVal());
        System.out.println(d1.getKey());

        DataCollector dc = new DataCollector();

        dc.addData(d1);
        dc.addData(d1);
        dc.addData(d1);
        dc.addData(d1);

        System.out.println(dc.getData("gvghgyurdetkuf"));
    }
}
