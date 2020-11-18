package com.hackerrank.java.bitset;

public class StringLiteral {
  public static void main(String[] args) {
    String str1 = "Hello";
    String str2 = "Hello";
    String str3 = new String("Hello");
    String str4 = str3.intern();

    System.out.println(str1 == str2);
    System.out.println(str1 == str3);
    System.out.println(str1 == str4);
  }

}
