package com.blackdog.study.command;

public class LampCommand implements Command {

    private Lamp lamp;

    public LampCommand(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.turnOn();
    }
}

class Lamp {

    public void turnOn() {
        System.out.println("Turn on the lamp");
    }
}

class RedLamp extends Lamp {

    @Override
    public void turnOn() {
        System.out.println("Turn on the red lamp");
    }
}