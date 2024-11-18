package Ainputs.domain;

import java.util.Scanner;

public class CalculoArea {
  private static double pi = 3.14159;

  public CalculoArea() {
  }

  public void CalcularArea() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o raio a ser calculado a área: ");
    double raio = sc.nextDouble();

    double area = pi * Math.pow(raio, 2);
    int lll = 33;

    System.out.printf("Área do raio: %e é %.4f", area, lll);

    sc.close();
  }
}
