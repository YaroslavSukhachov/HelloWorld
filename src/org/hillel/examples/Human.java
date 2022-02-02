package org.hillel.examples;

public class Human {
    protected int age = 0;
    protected String name = "default";

    public Human() {
        System.out.println("human constructor");
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void breathe() {
        System.out.println("human is breathing");
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
