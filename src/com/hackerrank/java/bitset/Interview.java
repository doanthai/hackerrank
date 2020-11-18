package com.hackerrank.java.bitset;

import java.io.*;
import java.lang.reflect.Array;
import java.time.Year;
import java.util.*;
import java.util.stream.Collectors;

public class Interview {
//  private static final Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) throws IOException {
//    System.out.println(countingValleys(8, "DUDU"));
//    System.out.println(repeatedString("epsxyyflvrrrxzvnoenvpegvuonodjoxfwdmcvwctmekpsnamchznsoxaklzjgrqruyzavshfbmuhdwwmpbkwcuomqhiyvuztwvq", 549382313570L));
//    minimumBribes(new int[]{2, 1, 5, 3, 7, 8, 6, 4});
//    minimumBribes(new int[] {2, 5, 1, 3, 4});
//    minimumBribes(new int[] {2, 1, 5, 3, 4});
//    BufferedReader br = new BufferedReader(new InputStreamReader( new FileInputStream("/home/thaidq2/topica/sample/javatm/src/minimumBribes.txt")));
//    Scanner scan = new Scanner(new FileInputStream("/home/thaidq2/topica/sample/javatm/src/minimumBribes.txt"));
//    int t = scan.nextInt();
//    while (t > 0) {
//      t--;
//      int n = scan.nextInt();
//      int[] arr = new int[n];
//      for (int i = 0; i < n; i++) {
//        arr[i] = scan.nextInt();
//      }
//      minimumBribes(arr);
//    }
//    long result = arrayManipulation(n, new int[][]);
//    System.out.println(result);

//    bufferedWriter.write(String.valueOf(result));
//    bufferedWriter.newLine();
//
//    bufferedWriter.close();
//    int n = scanner.nextInt();
//    int k = scanner.nextInt();
//    int[] a = new int[n];
//    int max = 0;
//    while(k > 0) {
//      k--;
//
//      int left = scanner.nextInt();
//      int right = scanner.nextInt();
//      int unit = scanner.nextInt();
//      for(int i = left; i <= right; i++) {
//        a[i - 1] += unit;
//        if (max < a[i - 1]) max = a[i -1];
//      }
//    }
//    System.out.println(max);
    towString();
  }

  public static void towString() throws FileNotFoundException {
    Scanner scanner = new Scanner(new FileInputStream("/home/thaidq2/topica/sample/javatm/src/twoString.txt"));
    int n = scanner.nextInt();
    Set<Character> set;
    while (n-- > 0) {
      set = new TreeSet<>();
      String s1 = scanner.next();
      String s2 = scanner.next();
      for(int j = 0; j < s1.length(); j++) {
        set.add(s1.charAt(j));
      }
      boolean check = false;
      for(int j = 0; j < s2.length(); j++) {
        if (set.contains(s2.charAt(j))) {
          check = true;
          break;
        }
      }
      System.out.println(check ? "YES" : "NO");
      System.out.println(hasCommonString(s1, s2) ? "YES" : "NO");
    }

  }

  public static boolean hasCommonString(String s1, String s2) {
    return (toInt(s1) & toInt(s2)) > 0;
  }

  private static int toInt(String str) {
    int res = 0;
    for (int i: str.toCharArray()) {
      int index = i - 'a';
      int resTemp = 1 << index;
      res = res | resTemp;
    }
    return res;
  }

  public static int countingValleys(int steps, String path) {
    // Write your code here
    String[] split = path.split("");
    int curr = 0;
    int rs = 0;
    for (String str : split) {
      if (str.equals("D")) curr--;
      if (str.equals("U")) {
        curr++;
        if (curr == 0) rs++;
      }

    }
    return rs;

  }

  public static int jumpingOnClouds(int[] c) {
    int jump = -1;
    for (int i = 0; i < c.length; i++, jump++) {
      if (i+2 < c.length && c[i+2] == 0) i++;
    }
    return jump;
  }

  public static long repeatedString(String s, long n) {
    int countOne = 0;
    long remain = n % s.length();
    long count = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'a') {
        countOne++;
        if (i < remain) count++;
      }
    }
    count += (n / s.length()) * countOne;
    return count;
  }

  public static int minimumSwaps(int[] arr) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (i == arr[i] - 1) continue;
      int temp = arr[arr[i] - 1];
      arr[arr[i] - 1] = arr[i];
      arr[i] = temp;
      count++;
      i--;
    }

    return count;
  }

  public static void minimumBribes(int[] q) {
    int count = 0;
    for (int i = 0; i < q.length; i++) {
      if (q[i] - i > 3) {
        System.out.println("Too chaotic");
        return;
      }
      if (i == q[i] - 1 || q[i] < q[i+1]) continue;
      int temp = q[i + 1];
      q[i + 1] = q[i];
      q[i] = temp;
      count++;
      i -= 2;
      i = Math.max(i, -1);
    }
    System.out.println(count);
  }

  public static long arrayManipulation(int n, int[][] queries) {
    long max = 0;
    long[] sumArr = new long[n];
    for (int i = 1; i <= n; i++) {
      for (int[] query : queries) {
        if (query[0] <= i && query[1] >= i) {
          sumArr[i - 1] += query[2];
          if (max < sumArr[i - 1]) max = sumArr[i - 1];
        }
      }
    }
    return max;
  }

  public static void hashTable() throws FileNotFoundException {
    Scanner scanner = new Scanner(new FileInputStream("/home/thaidq2/topica/sample/javatm/src/hashTable.txt"));
    int m = scanner.nextInt();
    int n = scanner.nextInt();
    Map<String, Integer> map = new Hashtable<>();
    while (0 < m--) {
      String str = scanner.next();
      if (map.containsKey(str)) {
        map.put(str, map.get(str) + 1);
      } else {
        map.put(str, 1);
      }
    }
    map.forEach((s, integer) -> System.out.println(s + integer));
    while (0 < n--) {
      String str = scanner.next();
      Integer count = map.get(str);
      if (count == null || count <= 0) {
        System.out.println("No");
        return;
      }
      map.put(str, count - 1);
    }
    System.out.println("Yes");
  }
}
