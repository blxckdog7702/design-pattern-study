package com.blackdog.study.builder;

public class BuilderMain {
    public static void main(String[] args) {

        // Don't care parameter's order.
        // Don't have to make constructor.
        // User can understand data field clearly.
        Information james = new Information.Builder("james", 28)
                .address("suwon")
                .postalCode(12345)
                .job("engineer")
                .major("cs")
                .build();

        // Don't have to fill out optional fields.
        Information susan = new Information.Builder("susan", 42)
                .address("new york")
                .job("CEO")
                .build();

        System.out.println(james);
        System.out.println(susan);
    }
}
