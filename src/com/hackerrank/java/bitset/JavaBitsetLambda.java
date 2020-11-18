package com.hackerrank.java.bitset;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiConsumer;

public class JavaBitsetLambda {

  public static void main(String[] args) throws FileNotFoundException {
    File text = new File("/home/thaidq2/topica/sample/javatm/text.txt");
    // write your code here
    Scanner sc = new Scanner(text);
    int setSize = sc.nextInt();
    int noOps = sc.nextInt();
    BitSet[] bitSets = new BitSet[]{new BitSet(setSize), new BitSet(setSize)};
    Map<String, BiConsumer<Integer,Integer>> ops = new HashMap<>();
    ops.put("AND", (set, index) -> bitSets[set-1].and(bitSets[index-1]));
    ops.put("OR", (set, index) -> bitSets[set-1].or(bitSets[index-1]));
    ops.put("XOR", (set, index) -> bitSets[set-1].xor(bitSets[index-1]));
    ops.put("SET", (set, index) -> bitSets[set-1].set(index));
    ops.put("FLIP", (set, index) -> bitSets[set-1].flip(index));
    while (noOps-- > 0) {
      ops.get(sc.next()).accept(sc.nextInt(), sc.nextInt());
      System.out.println(bitSets[0].cardinality() + " " + bitSets[1].cardinality());
    }
  }
}
