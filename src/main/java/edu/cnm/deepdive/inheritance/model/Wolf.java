package edu.cnm.deepdive.inheritance.model;

public class Wolf extends Canis {

  @Override
  public void hunt() { //can't change the return type
    System.out.println("Hunt in packs for live prey");
  }
  @Override
  public void hunt(String prey){
    System.out.println("Hunt in packs for " + prey);
  }

  public static void describe(){
  System.out.println("I am a member/instance of the Wolf class");
}



}
