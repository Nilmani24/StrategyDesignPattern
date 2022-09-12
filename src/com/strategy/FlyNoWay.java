package com.strategy;

public class FlyNoWay extends FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("cannot fly");
    }
}
