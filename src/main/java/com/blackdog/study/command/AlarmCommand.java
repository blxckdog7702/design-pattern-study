package com.blackdog.study.command;

public class AlarmCommand implements Command {

    private Alarm alarm;

    public AlarmCommand(Alarm alarm) {
        this.alarm = alarm;
    }

    @Override
    public void execute() {
        alarm.start();
    }
}

class Alarm {

    public void start() {
        System.out.println("Start the alarm");
    }
}