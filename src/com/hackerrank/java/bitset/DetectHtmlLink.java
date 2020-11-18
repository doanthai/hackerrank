package com.hackerrank.java.bitset;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DetectHtmlLink {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("/home/thaidq2/topica/sample/javatm/src/detechhtmllink.txt")));
    int n = Integer.parseInt(br.readLine());
    while (n > 0) {
      n--;
      String str = br.readLine();
      Pattern pattern = Pattern.compile("(<a).*?(href=)\"(.*?)\".*?(>)(.*?)(</a>)");
      Matcher matcher = pattern.matcher(str);
      while (matcher.find()) {
        System.out.println(matcher.group(3));
      }
    }
  }
}
