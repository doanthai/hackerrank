package com.hackerrank.java.bitset;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternAlienName {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("/home/thaidq2/topica/sample/javatm/src/alienname.txt")));
    int n = Integer.parseInt(br.readLine());
    while (n > 0) {
      n--;
      String str = br.readLine();
      Pattern pattern = Pattern.compile("^[_.]\\d+[A-Za-z]*[_]?$");
      Matcher matcher = pattern.matcher(str);
      System.out.println(matcher.matches() ? "VALID" : "INVALID");
    }
  }
}
