package com.strategy;

public abstract class Duck {
    protected FlyBehaviour flyBehaviour;
    protected QuackBehaviour quackBehaviour;

    public void performFly(){
        flyBehaviour.fly();
    }
    public abstract void display();

    public void performQuack(){
        quackBehaviour.canQuack();
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour){
        this.flyBehaviour = flyBehaviour;
    }
    public void setQuackBehaviour(QuackBehaviour quackBehaviour){
        this.quackBehaviour = quackBehaviour;
    }

}
