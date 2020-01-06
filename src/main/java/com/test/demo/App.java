package com.test.demo;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int a = 6;
        //先考虑优先级，同等优先级再考虑结合性,赋值运算符(+=,-=,*=)右结合:自右向左,即先右后左
        //a = a + ( a - ( a * a ))
        //a*a=36
        //a-36=6-36=-30
        //a+(-30)=6-30=-24
        a += a -= a * a;
        System.out.println("a=" + a);
    }
}
