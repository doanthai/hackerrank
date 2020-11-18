package com.hackerrank.java.bitset;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DetectDomain {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("/home/thaidq2/topica/sample/javatm/src/detechdomain.txt")));
    int n = Integer.parseInt(br.readLine());
    Set<String> list = new TreeSet<>();
    while (n > 0) {
      n--;
      String str = br.readLine();
      Pattern pattern = Pattern.compile("([^\\s]+[@](\\w+\\.)+\\w+)");
      Matcher matcher = pattern.matcher(str);
      while (matcher.find()) {
        list.add(matcher.group(1));
      }
    }
    System.out.println(String.join(";", list));
  }
}
