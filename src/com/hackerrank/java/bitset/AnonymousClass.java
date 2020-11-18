package com.hackerrank.java.bitset;

public class AnonymousClass {
  interface ShowName {
    String getName();
  }

  public static void main(String[] args) {
    String name = "status";

    class ShowOnlyName implements ShowName {
      private String name = "private";

      @Override
      public String getName() {
        return name;
      }
    }

    ShowName fullName = new ShowName() {
      @Override
      public String getName() {
        return name;
      }
    };
    System.out.println((new ShowOnlyName()).getName());
    System.out.println(fullName.getName());
  }
}
