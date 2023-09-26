package edu.cnm.deepdive.inheritance.model;

public class Dog extends Wolf {

  @Override
  public void hunt() {
    //super.hunt(); Invoke the original method.
    System.out.println("Hunt according to how i was trained in obedience school.");
  }

  @Override
  public void hunt(String prey) {
    System.out.println("Chase, catch, and play with " + prey);
  }

  public static void describe() {
    System.out.println("I am an instance of the Dog class");
  }
}
