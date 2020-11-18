package com.hackerrank.java.bitset;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DetechIPv4AndIPV6 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("/home/thaidq2/topica/sample/javatm/src/IPv4AndIPv6.txt")));
    int n = Integer.parseInt(br.readLine());
    while (n > 0) {
      n--;
      String str = br.readLine();
      Pattern ipv4 = Pattern.compile("^((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]\\d|\\d)[.]){3}(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]\\d|\\d)$");
      Pattern ipv6 = Pattern.compile("^(([0-9abcdef]{1,4})[:]){7}([0-9abcdef]{1,4})$");
      if (ipv4.matcher(str).matches()) {
        System.out.println("IPv4");
        continue;
      }
      if (ipv6.matcher(str).matches()) {
        System.out.println("IPv6");
        continue;
      }
      System.out.println("Neither");
    }
  }
}
