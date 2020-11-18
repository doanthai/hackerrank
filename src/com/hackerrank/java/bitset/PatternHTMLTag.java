package com.hackerrank.java.bitset;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternHTMLTag {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("/home/thaidq2/topica/sample/javatm/src/htmlTag.txt")));
    int n = Integer.parseInt(br.readLine());
    Map<String, Set<String>> result = new TreeMap<>();
    while (n > 0) {
      n--;
      String dom = br.readLine();
      Pattern pattern = Pattern.compile("[<](\\w+)([^>]*)[>]");
      Pattern patternAttr = Pattern.compile("\\s(\\w+)[=]");
      Matcher matcher = pattern.matcher(dom);
      while (matcher.find()) {
        String tag = matcher.group(1);
        Set<String> attr = result.computeIfAbsent(tag, k -> new TreeSet<>());

        Matcher matcherAttr = patternAttr.matcher(matcher.group(2));
        while (matcherAttr.find()) {
          attr.add(matcherAttr.group(1));
        }
        result.put(tag, attr);
      }
    }
    result.forEach((tag, attrs) -> System.out.println(tag + ":" + String.join(",", new ArrayList<>(attrs))));
  }
}
