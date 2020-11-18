package com.hackerrank.java.bitset;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitNumber {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    while (n > 0) {
      n--;
      String str = br.readLine();
      Pattern pattern = Pattern.compile("(\\d+)(-|\\s)(\\d+)(-|\\s)(\\d+)");
      Matcher matcher = pattern.matcher(str);
      while(matcher.find()) {
        System.out.printf("CountryCode=%s,LocalAreaCode=%s,Number=%s", matcher.group(1), matcher.group(3), matcher.group(5));
      }
      System.out.println();
    }
  }
}
