package com.blackdog.study.command;

public class CommandMain {

    public static void main(String[] args) {
        Button lampButton = new Button(new LampCommand(new Lamp()));
        Button alarmButton = new Button(new AlarmCommand(new Alarm()));

        lampButton.press();
        alarmButton.press();

        lampButton = new Button(new LampCommand(new RedLamp()));
        lampButton.press();
    }
}
