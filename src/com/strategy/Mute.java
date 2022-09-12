package com.strategy;

public class Mute extends QuackBehaviour {
    @Override
    public void canQuack() {
        System.out.println("mute");
    }
}
