package com;

public class Person {
    private String name;
    private int age;
    private Gender gender;
    private Payment payment;
    public Person(String name, int age, Gender gender,Payment payment) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.payment = payment;


    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public Payment getPayment() {
        return payment;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", payment=" + payment +"\n==============================\n";
    }
}
