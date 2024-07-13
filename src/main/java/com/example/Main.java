package com.example;

public class Main {

  public static void main(String[] args) {
    double result = divide(10, 0);
    System.out.println("La division es: " + result);
  }

  public static double divide(int n1, int n2) {
    if (n1 < 0) {
      throw new RuntimeException("numerador no puede ser negativo");
    }
    return n1/n2;
  }

}
