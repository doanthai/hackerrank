package com.hackerrank.java.bitset;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DetectEmail {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("/home/thaidq2/topica/sample/javatm/src/detechdomain.txt")));
    int n = Integer.parseInt(br.readLine().trim());
    Set<String> list = new TreeSet<>();
    while (n > 0) {
      n--;
      String str = br.readLine();
      Pattern pattern = Pattern.compile("(http|https)(://)(www\\.|ww2\\.)?(([\\w-]+\\.)+[^\\W_]+)");
      Matcher matcher = pattern.matcher(str);
      while (matcher.find()) {
        list.add(matcher.group(4));
      }
    }
//    System.out.println(String.join(";", list));
    list.forEach(System.out::println);
  }

  public static Set<String> run() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("/home/thaidq2/topica/sample/javatm/src/detechdomain.txt")));
    int n = Integer.parseInt(br.readLine().trim());
    Set<String> list = new TreeSet<>();
    while (n > 0) {
      n--;
      String str = br.readLine();
      Pattern pattern = Pattern.compile("(http|https)(://)(www\\.|ww2\\.)?((\\w+\\.)+\\w+)");
      Matcher matcher = pattern.matcher(str);
      while (matcher.find()) {
        list.add(matcher.group(4));
      }
    }
    return list;
  }
}
