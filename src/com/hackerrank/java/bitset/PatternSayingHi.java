package com.hackerrank.java.bitset;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternSayingHi {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("/home/thaidq2/topica/sample/javatm/src/sayinghi.txt")));
    int n = Integer.parseInt(br.readLine());
    while (n > 0) {
      n--;
      String str = br.readLine();
      Pattern pattern = Pattern.compile("(C|CPP|JAVA|PYTHON|PERL|PHP|RUBY|CSHARP|HASKELL|CLOJURE|BASH|SCALA|ERLANG|CLISP|LUA|BRAINFUCK|JAVASCRIPT|GO|D|OCAML|R|PASCAL|SBCL|DART|GROOVY|OBJECTIVEC)");
      Matcher matcher = pattern.matcher(str.split(" ")[1]);
      System.out.println(matcher.matches() ? "VALID" : "INVALID");
    }
  }
}
