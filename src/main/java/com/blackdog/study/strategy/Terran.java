package com.blackdog.study.strategy;

public abstract class Terran {

    private String name;
    private AttackStrategy attackStrategy;
    private MovingStrategy movingStrategy;

    public Terran(String name) {
        this.name = name;
    }

    public void attack() {
        this.attackStrategy.attack();
    }

    public void move() {
        this.movingStrategy.move();
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void setMovingStrategy(MovingStrategy movingStrategy) {
        this.movingStrategy = movingStrategy;
    }
}

class Marine extends Terran {

    public Marine(String name) {
        super(name);
    }
}

class Wraith extends Terran {

    public Wraith(String name) {
        super(name);
    }
}

class Goliath extends Terran {

    public Goliath(String name) {
        super(name);
    }
}