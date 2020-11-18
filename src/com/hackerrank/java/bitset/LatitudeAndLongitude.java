package com.hackerrank.java.bitset;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LatitudeAndLongitude {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("/home/thaidq2/topica/sample/javatm/src/latitudeandlongitude.txt")));
    int n = Integer.parseInt(br.readLine());
    while (n > 0) {
      n--;
      String str = br.readLine();
      Pattern pattern = Pattern.compile("^[(][+|-]?((90|[1-8]\\d|\\d)(\\.\\d+)?),\\s[+|-]?(((1[0-7]\\d)|[1-9]\\d|\\d)(\\.\\d+)?|180(\\.[0]+)?)[)]$");
      Matcher matcher = pattern.matcher(str);
      System.out.println(matcher.matches() ? "VALID" : "INVALID");
    }
  }
}
