package com.hackerrank.java.bitset;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MaxCount {
  public static void main(String[] args) throws IOException {
    File file = new File("/home/thaidq2/topica/sample/javatm/text");
    Scanner scanner = new Scanner(file);

    int size = scanner.nextInt();
    long max = 0;
    int result = 0;
    long[] temp = new long[]{0, 0, 0, 0, 0};
    while (size-- > 0) {
      int integer = scanner.nextInt();
      temp[integer - 1] += 1;
      if (temp[integer - 1] > max) {
        max = temp[integer - 1];
        result = integer;
      } else if (temp[integer - 1] == max && integer < result) {
        max = temp[integer - 1];
        result = integer;
      }
    }
    System.out.println(result);
  }
}
