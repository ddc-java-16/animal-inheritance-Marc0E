package edu.cnm.deepdive.inheritance;

import edu.cnm.deepdive.inheritance.model.Canis;
import edu.cnm.deepdive.inheritance.model.Dog;
import edu.cnm.deepdive.inheritance.model.Wolf;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    /*Canis c = new Wolf();
    c.hunt();
    c.hunt("badgers");
    c.describe(); //Static method (not override ) not polymorphic  that's why it goes to Canis.describe not Wolf.describe
    //static methods we can create another methods with the same name and parameters.
    c.setWeight(50);
    System.out.println(c.getWeight());*/
    //Collection<Canis> roster = new LinkedList<>(); // <Type Ex. String, int, Canis> just save this class or subclass
    List<Canis> roster = new LinkedList<>(); // <Type Ex. String, int, Canis> just save this class or subclass
    roster.add(new Wolf());
    roster.add(new Wolf());
    roster.add(new Dog());
    roster.add(new Dog());
//OO POLYMORPHIC AND ...
    Collections.shuffle(roster); //Changed Collection to List because Collection doesn't have the concept of position.

    for(Canis c : roster){
      c.hunt();
      c.hunt("snapping turtle");
      c.describe();
    }
  }

}
