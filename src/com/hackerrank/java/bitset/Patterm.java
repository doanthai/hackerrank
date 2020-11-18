package com.hackerrank.java.bitset;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Patterm {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("/home/thaidq2/topica/sample/javatm/src/htmlTag.txt")));
    int n = Integer.parseInt(br.readLine());
    List<String> list = new LinkedList<>();
    Pattern pattern = Pattern.compile("<\\b(\\w+)\\b.*?>");
    while (n > 0) {
      n--;
      String str = br.readLine();
      Matcher matcher = pattern.matcher(str);
      while (matcher.find()) {
        list.add(matcher.group(1));
      }
    }
    list.sort(String::compareTo);
    list = list.stream().distinct().collect(Collectors.toList());
    System.out.println(String.join(";", list));
//    test();

  }

  public static void test() {
    String str = "<li style=\"-moz-float-edge: content-box\">... that <a href=\"/wiki/Orval_Overall\" title=\"Orval Overall\">Orval Overall</a> <i>(pictured)</i> is the only <b><a href=\"/wiki/List_of_Major_League_Baseball_pitchers_who_have_struck_out_four_batters_in_one_inning\" title=\"List of Major League Baseball pitchers who have struck out four batters in one inning\">Major League Baseball player to strike out four batters in one inning</a></b> in the <a href=\"/wiki/World_Series\" title=\"World Series\">World Series</a>?</li>";
    Pattern pattern = Pattern.compile("<(\\w+)(\\s(\\w+)=[\"][^\"]+[\"])*");
    List<String> list = new LinkedList<>();
    Matcher matcher = pattern.matcher(str);
    while (matcher.find()) {
      System.out.println(matcher.group(1));
//      System.out.println(matcher.group(3));
//      System.out.println(matcher.group(2));
    }
    list.sort(String::compareTo);
    list = list.stream().distinct().collect(Collectors.toList());
    System.out.println(String.join(";", list));
  }
}
