package com.strategy;

public class Quack extends QuackBehaviour{
    @Override
    public void canQuack() {
        System.out.println("quack");
    }
}
