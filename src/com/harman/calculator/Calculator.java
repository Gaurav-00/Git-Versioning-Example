package com.harman.calculator;

public class Calculator {
    public static void main(String[] args) {
        int x=10,y=2,c;
        c=x+y;
        System.out.println(c);
        Sub su=new Sub();
        int z;
        z=su.Sub(x,y);
        System.out.println(z);
        Mult mu=new Mult();
        int t=mu.mult(x,y);
        System.out.println(t);
    }
}
