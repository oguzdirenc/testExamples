package com.testexample.demo;

public class MathUtils {

    public int add(int a,int b){
        return a+b;
    }

    public int subtract(int a,int b){
        return a-b;
    }

    public int multiply(int a, int b){
        return a*b;
    }

    public boolean isLessThenFive(int a){
        return a < 5;
    }

    public int divide(int a, int b){
        return a/b;
    }

    public double computeCircleArea(double radius){
        return Math.PI*radius*radius;
    }

}
