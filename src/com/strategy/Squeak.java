package com.strategy;

public class Squeak extends QuackBehaviour {
    @Override
    public void canQuack() {
        System.out.println("squeak");
    }
}
