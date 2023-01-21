package com.driver;

public class Main {
    public static void main(String[] args) {
        F1 mercedes = new F1("mercedes", false);
        mercedes.move(200, 29);
        mercedes.accelerate(20);
        mercedes.move(20,76);
//        mercedes.accelerate(-60);
    }
}