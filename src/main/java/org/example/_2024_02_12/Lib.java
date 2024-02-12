package org.example._2024_02_12;

import org.springframework.stereotype.Component;

@Component("lib")
public class Lib extends AbstractClass {
    @Override
    void getSmth() {
        System.out.println("Lib.class | getSmth()");
    }
}

class Main {
    public static void main(String[] args) {

    }
}
