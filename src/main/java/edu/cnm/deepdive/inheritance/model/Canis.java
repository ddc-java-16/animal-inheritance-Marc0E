package edu.cnm.deepdive.inheritance.model;

public abstract class Canis { //abstract won't let you create instances of this class

  private int weight;

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) { //change from public to protected
    this.weight = weight;
  }

  public abstract void hunt();

  public abstract void hunt(String pray); //Don't use {} or it won't work. Is just a declaration that's why us don't use {}.
  //Overload methods: methos that have same name but different parameters;
  public static void describe(){
    System.out.println("I am a instance of the Canis class");
  }


}
