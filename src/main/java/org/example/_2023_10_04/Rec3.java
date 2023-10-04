package org.example._2023_10_04;

public class Rec3 {
    public static void main(String[] args) {

    }

    public static void rr() {
        System.out.println("^^^^");
        System.out.println("&&&&");
        System.out.println("$$$$");
    }

    public static void m1(Inter inter) {
        System.out.println("****");
        inter.get("1", "a");
    }
}

@FunctionalInterface
interface Inter1 {
    void get(String s, String d);
}
