/*
* DataCollector
* Purpose: The goal of DataCollector is
* Author/s: Morgan Myhill
* 12/4/17
* On My Honor: MM
* Collaborators:
*/
public class DataCollector {
    private DataDemo d1;
    private DataDemo d2;
    private DataDemo d3;
    private int numData;//keeps track of how many data demos we have

    public boolean addData(DataDemo d){
        if(numData < 3) {
//        else if (d1 == null) {
                d1 = d;//null objects use ==, only time you can compare objects with ==
            } else if (d2 == null) {
                d2 = d;
            } else if (d3 == null) {
                d3 = d;
            }return true;
//         else return false;
    }
    public DataDemo getData(String key){
        if(d1 != null && d1.getKey().equals(key)) return d1;
        else if(d2 != null && d2.getKey().equals(key)) return d2;
        else if(d3 != null && d3.getKey().equals(key)) return d3;
        else return null;
    }
}
