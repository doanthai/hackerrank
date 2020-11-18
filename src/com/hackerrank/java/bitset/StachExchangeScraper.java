package com.hackerrank.java.bitset;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StachExchangeScraper {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("/home/thaidq2/topica/sample/javatm/src/stackexchange.txt")));
    br.lines().forEach(str -> {
      Pattern pattern = Pattern.compile("<a\\s(href)[=](\"/questions/)(\\d+)[^\"]+\"\\s(class=\"question-hyperlink\">)(.+)(</a>).+(class=\"relativetime\">)(.+)(</span>)");
      Matcher matcher = pattern.matcher(str);
      while (matcher.find()) {
        System.out.print(matcher.group(3));
        System.out.print(";");
        System.out.print(matcher.group(5));
        System.out.print(";");
        System.out.print(matcher.group(8));
      }
//      Pattern patternHour = Pattern.compile("<span\\s(title)[=]\"[^\"]+\"\\s(class=\"relativetime\">)(.+)(</span>)");
//      Matcher matcherHour = patternHour.matcher(str);
//      while (matcherHour.find()) {
//        System.out.print(matcherHour.group(3));
//        System.out.println();
//      }
    });


  }
}
