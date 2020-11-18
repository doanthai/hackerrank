package com.hackerrank.java.bitset;

//import sun.security.provider.MD5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Normal {

  public static void main(String[] args) throws FileNotFoundException {
    File text = new File("/home/thaidq2/topica/sample/javatm/text.txt");
    // write your code here
    Scanner scan = new Scanner(text);
    String param = scan.nextLine();
    String[] s = param.split(" ");
    int n = Integer.parseInt(s[0]);
    int m = Integer.parseInt(s[1]);
    int[][] arr2 = new int[2][n];
    for (int j = 0; j < 5; j++) {
      arr2[0][j] = 0;
      arr2[1][j] = 0;
    }
    while (m > 0) {
      m--;
      param = scan.nextLine();
      s = param.split(" ");
      int set = Integer.parseInt(s[1]) - 1;
      int index = Integer.parseInt(s[2]);
      index = index == n ? n - 1 : index;
      switch (s[0]) {
        case "SET":
          arr2[set][index] = 1;
          break;
        case "FLIP":
          arr2[set][index] = arr2[set][index] == 0 ? 1 : 0;
          break;
        default:
          arr2[set] = operator(arr2[set], set == 0 ? arr2[1] : arr2[0], n, s[0]);
          break;
      }
      set = index = 0;
      for (int i = 0; i < n; i++) {
        set += arr2[0][i];
        index += arr2[1][i];
      }
      System.out.println(set + "-" + index);
    }
  }

  public static int[] operator(int[] a, int[] b, int n, String operator) {
    for (int i = 0; i < n; i++) {
      switch (operator) {
        case "AND":
          a[i] = a[i] & b[i];
          break;
        case "OR":
          a[i] = a[i] | b[i];
          break;
        case "XOR":
          a[i] = a[i] ^ b[i];
          break;
      }
    }
    return a;
  }
}
