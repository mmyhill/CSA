/*
* Mammal
* Purpose: The goal of Mammal is
* Author/s: Morgan Myhill
* 1/26/18
* On My Honor: MM
* Collaborators:
*/
abstract class Mammal {
//    First, write an abstract class called Mammal that has private
//    instance data to store a name and accessor and mutator methods for that instance data.
    private String name;
    Mammal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
