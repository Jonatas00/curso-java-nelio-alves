package Ainput.test;

import java.util.Scanner;

public class InputTest {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    String l = scanner.nextLine();

    System.out.println(l);

    scanner.close();
  }
}
