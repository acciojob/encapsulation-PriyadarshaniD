package com.driver;

public class Main {
  public static void main(String[] args){
      RWOnly ob = new RWOnly();
      //ob.name= "Priya";
      //System.out.println(ob.name);
      ob.setName("Priya");
      System.out.println(ob.getName());
  }
}