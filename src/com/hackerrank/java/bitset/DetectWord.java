package com.hackerrank.java.bitset;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DetectWord {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("/home/thaidq2/topica/sample/javatm/src/detechword.txt")));
    int n = Integer.parseInt(br.readLine());
    List<String> inputs = new ArrayList<>();
    while (n > 0) {
      n--;
      inputs.add(br.readLine());
    }

    int t = Integer.parseInt(br.readLine());
    while (t > 0) {
      t--;
      String str = br.readLine();
      Pattern pattern = Pattern.compile("[^0-9_]?\\b(" + str + ")\\b[^0-9_]?");
      int count = 0;
      for (String input : inputs) {
        Matcher matcher = pattern.matcher(input.toLowerCase());
        while (matcher.find()) {
          count++;
        }
      }
      System.out.println(count);
    }

  }
}
