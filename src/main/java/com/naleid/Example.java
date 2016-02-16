package com.naleid;

public class Example {
  public static void main(String[] args) throws Exception {
    System.out.println("Hello from " + System.getProperty("external.ip",  "localhost"));
  }
}
