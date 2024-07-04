package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("tru");

    double l=5;
    System.out.println(area(l));

    double a= 4;
    double b= 6;
    System.out.println(area(a,b));
  }

  public static void hello(String somebody) {
    System.out.println("Hellow " + somebody);
  }

  public static double area(double len){
    return len*len;
  }

  public static double area(double a,double b){
    return a*b;
  }

}