package com.hackerrank.java.bitset;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtrator {
  public static void main(String[] args) {
    String tag = "Goodbye bye bye world world world";
    Pattern ptTag = Pattern.compile("\\b(\\w+)(?:\\W\\1\\b)+", Pattern.CASE_INSENSITIVE);
    Matcher matcher = ptTag.matcher(tag);
    while (matcher.find()) {
      System.out.println(matcher.group());
      tag = tag.replace(matcher.group(), matcher.group(1));
    }
    System.out.println(tag);
  }
}
