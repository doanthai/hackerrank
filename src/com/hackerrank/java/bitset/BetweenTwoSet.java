package com.hackerrank.java.bitset;

import java.util.Arrays;
import java.util.List;

public class BetweenTwoSet {

  public static int getTotalX(List<Integer> a, List<Integer> b) {
    // Write your code here
    int count = 0;
    for (int i = a.get(a.size() - 1) + 1; i <= b.get(0); i++) {
      int finalI = i;
      if (a.stream().allMatch(w -> finalI % w == 0) && b.stream().allMatch(w -> w % finalI == 0)) {
        System.out.println(finalI);
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    List<Integer> a = Arrays.asList(3, 4);
//    List<Integer> b = Arrays.asList(24, 48);
//    System.out.println(getTotalX(a, b));
    int[] arr = new int[] {0,0};
    System.out.println(uc(43,48));
    System.out.println(uc(Arrays.asList(24, 48)));
    System.out.println(bc(2,3));
    System.out.println(bc(Arrays.asList(3, 4)));
  }

  static int birthday(List<Integer> s, int d, int m) {
    int count = 0;
    for (int i = 0, l = s.size(); i < l; i++) {
      int total = s.get(i);
      for (int j = 1; j < m && i + j < l; j++) {
        total += s.get(i+j);
      }
      if (total == d) count++;
    }
    return count;
  }

  public static int uc(int a, int b) {
    while (b > 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }
    return a;
  }

  public static int uc(List<Integer> a) {
    int result = a.get(0);
    for (int i = 1; i < a.size(); i++) {
      result = uc(result, a.get(i));
    }
    return  result;
  }

  public static int bc(int a, int b) {
    return a * (b / uc(a,b));
  }

  public static int bc(List<Integer> a) {
    int result = a.get(0);
    for (int i = 1; i < a.size(); i++) {
      result = bc(result, a.get(i));
    }
    return  result;
  }
}
