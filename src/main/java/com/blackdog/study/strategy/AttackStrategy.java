package com.blackdog.study.strategy;

public interface AttackStrategy {
    public void attack();
}

class MissileAttackStrategy implements AttackStrategy {

    @Override
    public void attack() {
        System.out.println("Missile attack!");
    }
}

class GunAttackStrategy implements AttackStrategy {

    @Override
    public void attack() {
        System.out.println("Gun Attack!");
    }
}
