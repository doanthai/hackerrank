package com.hackerrank.java.bitset;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class USAndUK {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("/home/thaidq2/topica/sample/javatm/src/USAndUK.txt")));
    int n = Integer.parseInt(br.readLine());
    String[] inputs = new String[n];

    while (n > 0) {
      n--;
      inputs[n] = br.readLine();
    }

    int t = Integer.parseInt(br.readLine());
    while (t > 0) {
      t--;
      String UKStr = br.readLine();
      String USStr = UKStr.replaceAll("ze$", "se");
      Pattern pattern = Pattern.compile("\\b(" + UKStr + "|" + USStr + ")\\b");
      int count = 0;
      for (String input : inputs) {
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
          count++;
        }
      }
      System.out.println(count);
    }
//    test();


  }

  public static void test() {
    String str = "goldclimbing extent_gold manage(gold.relaxing scream'gold insect_gold look'gold-town conventional-gold noticeablegoldpromptly intention.gold gold.make";
    Pattern pattern = Pattern.compile("(?<=[A-z])gold(?=[A-z])");
    int count = 0;
    Matcher matcher = pattern.matcher(str);
    System.out.println(matcher.groupCount());
    while (matcher.find()) {
      count++;
    }
    System.out.println(count);
  }
}
