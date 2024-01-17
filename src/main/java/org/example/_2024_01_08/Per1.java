package org.example._2024_01_08;

public class Per1 {
    Cat1 cat1;

    public Per1(Cat1 cat1) {
        this.cat1 = cat1;
    }
}


class Cat1 {
    Cat1 cat1;

    public static void main(String[] args) {
        new Per1(new Cat1());
    }
}