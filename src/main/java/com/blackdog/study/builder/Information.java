package com.blackdog.study.builder;

public class Information {
    private String name;
    private int age;
    private String address;
    private int postalCode;
    private String job;
    private String major;

    private Information(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
        this.postalCode = builder.postalCode;
        this.job = builder.job;
        this.major = builder.major;
    }

    @Override
    public String toString() {
        return "Information{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", postalCode=" + postalCode +
                ", job='" + job + '\'' +
                ", major='" + major + '\'' +
                '}';
    }

    // Only nested classes can be static.
    static class Builder {

        // Required parameters(필수 인자)
        private String name;
        private int age;

        // Optional parameters - initialized to default values(선택 인자는 초기화)
        private String address = "";
        private int postalCode = 0;
        private String job = "";
        private String major = "";

        public Builder(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder postalCode(int postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public Builder job(String job) {
            this.job = job;
            return this;
        }

        public Builder major(String major) {
            this.major = major;
            return this;
        }

        public Information build() {
            return new Information(this);
        }
    }
}
