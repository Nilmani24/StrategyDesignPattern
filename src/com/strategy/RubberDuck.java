package com.strategy;

public class RubberDuck extends Duck{

    public RubberDuck(){
        //flyBehaviour = new FlyNoWay();
        //quackBehaviour = new Mute();
    }

    @Override
    public void display() {
        System.out.println("I am rubber duck");
    }
}
