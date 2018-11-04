package com.zyj.java8.labmda;

public class LambdaTest1 {

    Runnable r = () -> System.out.println(this);
    Runnable r2 = new Runnable() {
        @Override
        public void run() {
            System.out.println("r2" + this);
        }
    };
    Runnable r3 = new Runnable() {
        @Override
        public void run() {
            System.out.println("r3" + this);
        }
    };

    public static void main(String[] args) {
        LambdaTest1 lambdaTest1 = new LambdaTest1();

        Thread t1 = new Thread(lambdaTest1.r);
        t1.start();

        System.out.println("---------------");

        Thread t3 = new Thread(lambdaTest1.r3);
        t3.start();

        System.out.println("---------------");

        Thread t2 = new Thread(lambdaTest1.r2);
        t2.start();
    }
}
