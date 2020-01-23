package com.blackdog.study.strategy;

public class StrategyMain {

    public static void main(String[] args) {
        Terran marine = new Marine("marine");
        Terran wraith = new Wraith("wraith");

        marine.setAttackStrategy(new GunAttackStrategy());
        marine.setMovingStrategy(new RunMovingStrategy());
        wraith.setAttackStrategy(new MissileAttackStrategy());
        wraith.setMovingStrategy(new FlyMovingStrategy());

        marine.attack();
        marine.move();
        wraith.attack();
        wraith.move();

        // Add other unit without change.
        Terran goliath = new Goliath("goliath");

        goliath.setAttackStrategy(new MissileAttackStrategy());
        goliath.setMovingStrategy(new RunMovingStrategy());

        goliath.attack();
        goliath.move();

    }
}
