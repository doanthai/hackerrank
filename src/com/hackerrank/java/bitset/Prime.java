package com.hackerrank.java.bitset;

public class Prime {
  public void checkPrime(int... number) {
    int[] temp = new int[] {};
    for (int n: number) {
      for(int i = 2, s = (int)Math.sqrt(n); i < s; i++) {
        if (n % i == 0) continue;
      }
      if (n > 1) System.out.print(n + " ");
    }
  }

  public static boolean isPrime(int number) {
    for(int i = 2, s = (int)Math.sqrt(number); i <= s; i++) {
      if (number % i == 0) return false;
    }
    return number > 1;
  }

  public static void main(String[] args) {
    System.out.println(isPrime(4));
  }
}
