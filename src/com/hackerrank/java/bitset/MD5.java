package com.hackerrank.java.bitset;

//import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Scanner;

public class MD5 {
  public static void main(String[] args) throws NoSuchAlgorithmException {
//    Scanner scanner = new Scanner(System.in);
//    String text = scanner.nextLine();
    String text = "HelloWorld";

    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
    byte[] digest = messageDigest.digest(text.getBytes());
//    System.out.println(DatatypeConverter.printHexBinary(digest).toLowerCase());
  }
}
