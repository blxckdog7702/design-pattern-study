package com.blackdog.study.strategy;

public interface MovingStrategy {
    public void move();
}

class RunMovingStrategy implements MovingStrategy {

    @Override
    public void move() {
        System.out.println("Running!");
    }
}

class FlyMovingStrategy implements MovingStrategy {

    @Override
    public void move() {
        System.out.println("Flying!");
    }
}
