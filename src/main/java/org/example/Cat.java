package org.example;

import java.util.Random;

public class Cat extends PatAnimal implements Comparable<Cat>{
    public Cat(String name, int yearOfBirth) {
        super(name, yearOfBirth);
    }

    public int caughtMiceCount(){
        return new Random().nextInt(0,100);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }

    @Override
    public int compareTo(Cat o) {
        return caughtMiceCount()-o.caughtMiceCount();
    }
}
