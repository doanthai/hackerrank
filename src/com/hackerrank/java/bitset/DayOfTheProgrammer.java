package com.hackerrank.java.bitset;

public class DayOfTheProgrammer {
  public static void main(String[] args) {
    int year = 2017;
    int totalDay = (year % 400 == 0 && year % 4 == 0 && year % 100 != 0) ? 244 : 243;
    int day = 256 - totalDay;
  }
}
