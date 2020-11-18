package com.hackerrank.java.bitset;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IdentifyingComment {
  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(new FileInputStream("/home/thaidq2/topica/sample/javatm/src/comments.txt"));
    boolean isMultiLine = false;
    while (scanner.hasNextLine()) {
      String str = scanner.nextLine().trim();

      Pattern oneLine = Pattern.compile("(/{2}.*)");
      Pattern oneLine2 = Pattern.compile("^(//*).*(/*/)$");
      Pattern startMultiLine = Pattern.compile("^(//*/*).*");
      Pattern endMultiLine = Pattern.compile(".*(/*/*/)$");
      Matcher matcherOne = oneLine.matcher(str);
      Matcher matcherOne2 = oneLine2.matcher(str);
      Matcher matcherStartMulti = startMultiLine.matcher(str);
      Matcher matcherEndMulti = endMultiLine.matcher(str);
      if (matcherEndMulti.matches()) {
        isMultiLine = false;
        System.out.println(str);
        continue;
      }
      if (isMultiLine) {
        System.out.println(str);
        continue;
      }
      if (matcherOne.find()) {
        System.out.println(matcherOne.group(1));
        continue;
      }
      if (matcherOne2.find()) {
        System.out.println(matcherOne2.group(1));
        continue;
      }
      if (matcherStartMulti.matches()) {
        isMultiLine = true;
        System.out.println(str);
      }
    }
  }
}
